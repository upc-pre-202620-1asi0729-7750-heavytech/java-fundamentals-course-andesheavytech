# Fundamentos de Java para Principiantes

Curso en video de aproximadamente una hora para estudiantes de secundaria (12 a 17 años) sin experiencia en programación. En 10 lecciones cortas se aprenden los fundamentos de Java y de la programación orientada a objetos, y se termina programando un juego de adivinanzas con clases.

**No hace falta instalar nada.** Todas las prácticas se hacen en [OnlineGDB](https://www.onlinegdb.com/online_java_compiler), un editor gratuito que funciona en el navegador.

👉 El documento principal del curso, con los videos y las prácticas, es [`course-plan.md`](course-plan.md).

## ¿Qué aprenderás?

| # | Lección | Conceptos |
|---|---|---|
| 1 | ¿Qué es programar? Tu primer programa | `main`, `System.out.println`, comentarios |
| 2 | Variables y tipos de datos | `String`, `int`, `double`, `boolean`, `char` |
| 3 | Operadores y Scanner | `+ - * / %`, `+=`, división entera, `Scanner` |
| 4 | Decisiones | `if`, `else if`, `else`, `==`, `&&`, `\|\|`, `!` |
| 5 | Bucles | `for`, `while`, bucles anidados, bucle infinito |
| 6 | Métodos | parámetros, `return`, `void` |
| 7 | Clases y objetos | atributos, constructor, `new`, `this` |
| 8 | Encapsulación y arreglos | `private`, getters, setters, arreglos de objetos, métodos de `String` |
| 9 | Proyecto final | juego de adivinanzas con las clases `Jugador` y `JuegoAdivinanza` |
| 10 | Errores comunes y buenas prácticas | errores de compilación, ejecución y lógica, `equals` |

## Cómo hacer una práctica

1. Abre el enlace **OnlineGDB** de la lección en [`course-plan.md`](course-plan.md).
2. Lee los comentarios `TODO` y complétalos.
3. Presiona **Run**. Si el programa pide datos, haz clic en la consola, escríbelos y presiona Enter.
4. Compara tu resultado con la carpeta `completed-examples` cuando termines.

## Estructura del repositorio

```text
java-fundamentals-course-andesheavytech/
├── README.md
├── course-plan.md              # documento principal del curso
├── cuestionario.md             # preguntas para el formulario final
├── starter-files/
│   └── lesson-01 … lesson-10/Main.java   # código inicial con TODO
├── completed-examples/
│   └── lesson-01 … lesson-10/Main.java   # soluciones de referencia
├── scripts/
│   ├── lesson-XX-script.md     # guion de producción (pantalla, textos, reto)
│   └── lesson-XX-guion-tts.txt # narración con marcas de tiempo
├── docs/
│   ├── guia-produccion.md      # cómo grabar, narrar y editar
│   └── descripciones-youtube.md
└── tools/
    ├── check-examples.sh       # compila y ejecuta todos los ejemplos
    └── limpiar_guion.py        # quita marcas de tiempo para TTS y subtítulos
```

## Preparar las prácticas en OnlineGDB (para el equipo)

1. Entra a <https://www.onlinegdb.com/online_java_compiler> y elige el lenguaje **Java**.
2. Pega el contenido de `starter-files/lesson-XX/Main.java`. La clase pública debe llamarse `Main`.
3. Presiona **Run** para comprobar que compila (en la lección 10 los errores son intencionales).
4. Presiona **Share**, copia el enlace y reemplaza `PENDIENTE_ONLINEGDB_XX` en `course-plan.md` y en la descripción del video.

Cada archivo contiene todas sus clases, así cada práctica cabe en un solo editor y se abre con un solo clic. JDoodle también funciona si OnlineGDB no está disponible.

## Comprobar el código

Con Java 17 o superior instalado:

```bash
bash tools/check-examples.sh
```

El script compila los 20 archivos, ejecuta cada uno con entradas de prueba y confirma que el código inicial de la lección 10 **no** compila (tiene errores a propósito). La misma revisión corre en GitHub Actions con cada push.

## Privacidad

Los ejemplos usan nombres inventados. No escribas tu dirección, teléfono ni contraseñas en una práctica compartida.

## Licencia

El código se publica bajo la licencia MIT. Ver [`LICENSE`](LICENSE).
