#!/usr/bin/env bash
# Compila todos los ejemplos y los ejecuta con entradas de prueba.
# Uso: bash tools/check-examples.sh   (requiere Java 17 o superior)
set -euo pipefail
cd "$(dirname "$0")/.."

declare -A INPUT=(
  [lesson-03]=$'PixelNova\n12\n9\n'
  [lesson-04]=$'120\n2\n'
  [lesson-09]=$'Ana\n25\n12\n37\n6\n43\n18\n31\nn\n'
)
# El código inicial de la lección 10 tiene errores intencionales.
EXPECTED_TO_FAIL="starter-files/lesson-10"

fail=0
for dir in starter-files/lesson-* completed-examples/lesson-*; do
  out=$(mktemp -d)
  if javac -encoding UTF-8 -d "$out" "$dir/Main.java" 2>"$out/err.txt"; then
    if [[ "$dir" == "$EXPECTED_TO_FAIL" ]]; then
      echo "FALLO  $dir debería tener errores de compilación"; fail=1; continue
    fi
    lesson=$(basename "$dir")
    if printf '%s' "${INPUT[$lesson]:-}" | timeout 10 java -cp "$out" Main >"$out/run.txt" 2>&1; then
      echo "OK     $dir"
    else
      echo "FALLO  $dir (error al ejecutar)"; cat "$out/run.txt"; fail=1
    fi
  else
    if [[ "$dir" == "$EXPECTED_TO_FAIL" ]]; then
      echo "OK     $dir (no compila, como se espera)"
    else
      echo "FALLO  $dir no compila"; cat "$out/err.txt"; fail=1
    fi
  fi
  rm -rf "$out"
done
exit $fail
