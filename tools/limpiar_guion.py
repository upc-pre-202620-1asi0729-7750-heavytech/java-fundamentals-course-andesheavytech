#!/usr/bin/env python3
"""Quita las marcas de tiempo [mm:ss] de un guion de narración.

El resultado sirve para generar la voz con una herramienta de texto a voz
y para cargar subtítulos con la sincronización automática de YouTube.

Uso: python3 tools/limpiar_guion.py scripts/lesson-01-guion-tts.txt > transcripcion-01.txt
"""
import re
import sys


def limpiar(texto: str) -> str:
    sin_marcas = re.sub(r"^\[\d{2}:\d{2}\]\s*$", "", texto, flags=re.MULTILINE)
    parrafos = [p.strip() for p in sin_marcas.split("\n\n") if p.strip()]
    return "\n\n".join(" ".join(p.split()) for p in parrafos) + "\n"


if __name__ == "__main__":
    if len(sys.argv) != 2:
        sys.exit("Uso: python3 tools/limpiar_guion.py <archivo-guion-tts.txt>")
    with open(sys.argv[1], encoding="utf-8") as archivo:
        sys.stdout.write(limpiar(archivo.read()))
