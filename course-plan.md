# Fundamentos de Java para Principiantes

## Resumen del Curso

Este curso, de una hora aproximadamente, está pensado para estudiantes de secundaria que nunca han programado. En 10 lecciones cortas se presentan las bases de Java y de la programación orientada a objetos. Para que los ejemplos no se sientan abstractos, el hilo conductor es un videojuego: primero se trabaja con los datos de un personaje llamado PixelNova, luego con una mascota virtual y, al final, el estudiante arma su propio juego de adivinanzas usando clases. Todo se hace desde el navegador, así que no hay que instalar nada.

**Duración total**: ~58 minutos (10 lecciones de 5 a 7 minutos)  
**Público Objetivo**: Estudiantes de 12 a 17 años sin experiencia en programación  
**Prerrequisitos**: Ninguno  
**Herramientas necesarias**: Un navegador web (Chrome, Firefox, Safari o Edge) y el editor gratuito [OnlineGDB](https://www.onlinegdb.com/online_java_compiler), que no pide crear una cuenta  
**Repositorio de Código Fuente**: [https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech)  
**Lista de reproducción**: [Las 10 lecciones en YouTube](https://www.youtube.com/playlist?list=PLXpWR-78-fDA)

### ¿Cómo funciona cada lección?

1. Mira el video. Al inicio se muestra el resultado al que se quiere llegar.
2. Cuando el video indique la pausa, detenlo y abre la práctica en OnlineGDB con el enlace de la lección.
3. Completa las partes marcadas con `TODO` en el código y presiona Run.
4. Si te queda tiempo, intenta el mini reto y responde la pregunta del final.
5. Si algo no funciona, compara tu código con la solución que está en el repositorio.

## Secuencia de la Lección

### Lección 1: ¿Qué es programar? Tu primer programa en Java (5:01)

- **Descripción**: Qué es programar, dónde se usa Java y cómo ejecutar un primer programa directamente en el navegador.
- **Enlace**: [Ver la lección](https://youtu.be/ResejKvrKz4)
- **Conclusiones clave**: Un programa es una lista de instrucciones precisas; Java empieza en `main`; `System.out.println("Hola");` muestra texto.
- **Empieza a programar**: [Abrir en OnlineGDB](https://onlinegdb.com/KjeUyRkYG_)
- **Código**: [inicial](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/tree/main/starter-files/lesson-01) · [solución](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/tree/main/completed-examples/lesson-01)

### Lección 2: Variables y tipos de datos (6:32)

- **Descripción**: Uso de variables para guardar el nombre, el nivel y la energía del personaje.
- **Enlace**: [Ver la lección](https://youtu.be/CGj7Ubmo2VE)
- **Conclusiones clave**: `String nombre = "PixelNova";` `int nivel = 1;` `double energia = 75.5;` `boolean tieneEscudo = false;`
- **Práctica**: [Abrir en OnlineGDB](https://onlinegdb.com/ddxkrJwE1)
- **Código**: [inicial](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/tree/main/starter-files/lesson-02) · [solución](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/tree/main/completed-examples/lesson-02)

### Lección 3: Operadores y entrada de datos con Scanner (6:45)

- **Descripción**: Lectura de datos con el teclado y cálculos sencillos de monedas, pociones y bonus.
- **Enlace**: [Ver la lección](https://youtu.be/DBe88mGnbuc)
- **Conclusiones clave**: `Scanner teclado = new Scanner(System.in);` `25 / 7 = 3` y `25 % 7 = 4`; `total += 5;`
- **Práctica**: [Abrir en OnlineGDB](https://onlinegdb.com/F-0DxmxNE)
- **Código**: [inicial](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/tree/main/starter-files/lesson-03) · [solución](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/tree/main/completed-examples/lesson-03)

### Lección 4: Tomar decisiones con if, else if y else (7:04)

- **Descripción**: Condiciones para decidir qué medalla gana el jugador y cuándo se abre un nivel secreto.
- **Enlace**: [Ver la lección](https://youtu.be/DmSyq3yl6hw)
- **Conclusiones clave**: `if (puntos >= 100) {...} else if (puntos >= 50) {...} else {...}`; `&&` significa «y».
- **Práctica**: [Abrir en OnlineGDB](https://onlinegdb.com/sXk2C4Fv7)
- **Código**: [inicial](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/tree/main/starter-files/lesson-04) · [solución](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/tree/main/completed-examples/lesson-04)

### Lección 5: Repetir con bucles for y while (5:06)

- **Descripción**: Bucles para hacer cuentas regresivas, rondas de juego y recolección de monedas sin repetir código.
- **Enlace**: [Ver la lección](https://youtu.be/XyUVXfcWVIA)
- **Conclusiones clave**: `for (int i = 1; i <= 5; i++) {...}` cuando sabes cuántas veces; `while (monedas < 100) {...}` cuando no.
- **Práctica**: [Abrir en OnlineGDB](https://onlinegdb.com/3QTQlzSoS)
- **Código**: [inicial](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/tree/main/starter-files/lesson-05) · [solución](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/tree/main/completed-examples/lesson-05)

### Lección 6: Métodos y parámetros (5:03)

- **Descripción**: Cómo agrupar código en métodos para reutilizarlo en saludos, puntajes y barras de energía.
- **Enlace**: [Ver la lección](https://youtu.be/6YaW3hfgzCE)
- **Conclusiones clave**: `static int calcularPuntaje(int monedas, int enemigos) { return ...; }`; `void` no devuelve nada.
- **Práctica**: [Abrir en OnlineGDB](https://onlinegdb.com/9Z0NF16VG)
- **Código**: [inicial](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/tree/main/starter-files/lesson-06) · [solución](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/tree/main/completed-examples/lesson-06)

### Lección 7: Clases y objetos (5:49)

- **Descripción**: Creación de la clase `Mascota` y de varios objetos, cada uno con su propia energía.
- **Enlace**: [Ver la lección](https://youtu.be/PhIKUwvrgGY)
- **Conclusiones clave**: Clase = molde, objeto = galleta; `new Mascota("Toby", "perro")`; el constructor da los valores iniciales.
- **Práctica**: [Abrir en OnlineGDB](https://onlinegdb.com/XWLuekxHQ)
- **Código**: [inicial](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/tree/main/starter-files/lesson-07) · [solución](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/tree/main/completed-examples/lesson-07)

### Lección 8: Encapsulación, getters, setters y arreglos de objetos (5:46)

- **Descripción**: Uso de `private`, validación con setters y un arreglo para guardar un equipo de mascotas.
- **Enlace**: [Ver la lección](https://youtu.be/4i0zMY9dZYo)
- **Conclusiones clave**: `private int energia;` `getEnergia()` / `setEnergia(int)` con validación; los índices empiezan en 0.
- **Práctica**: [Abrir en OnlineGDB](https://onlinegdb.com/YE4Tk9dx7)
- **Código**: [inicial](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/tree/main/starter-files/lesson-08) · [solución](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/tree/main/completed-examples/lesson-08)

### Lección 9: Proyecto final: juego de adivinanzas con clases (6:09)

- **Descripción**: Desarrollo de un juego completo con las clases `Jugador` y `JuegoAdivinanza`.
- **Enlace**: [Ver la lección](https://youtu.be/wlSmvIYc4Qw)
- **Conclusiones clave**: Cada clase tiene una responsabilidad; `return` termina el método; estrategia de búsqueda binaria.
- **Proyecto final**: [Abrir en OnlineGDB](https://onlinegdb.com/lhuKMb4Qk)
- **Código**: [inicial](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/tree/main/starter-files/lesson-09) · [solución](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/tree/main/completed-examples/lesson-09)

### Lección 10: Errores comunes, buenas prácticas y próximos pasos (5:11)

- **Descripción**: Revisión de 5 errores frecuentes, cómo corregirlos y algunos hábitos que ayudan a programar mejor.
- **Enlace**: [Ver la lección](https://youtu.be/YH2JwEQ03lE)
- **Conclusiones clave**: Errores de compilación, ejecución y lógica; corrige el primero y vuelve a ejecutar; textos con `equals`.
- **Práctica**: [Abrir en OnlineGDB](https://onlinegdb.com/a1OvmWuxa)
- **Código**: [inicial](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/tree/main/starter-files/lesson-10) · [solución](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/tree/main/completed-examples/lesson-10)

## Recursos adicionales

- **Código fuente completo**: [Repositorio de GitHub](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech)
- **Todas las actividades prácticas**:

| Número de lección | Actividad | Empezar a programar | Solución |
|---|---|---|---|
| 1 | Hola mundo | [OnlineGDB](https://onlinegdb.com/KjeUyRkYG_) | [Ver](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/tree/main/completed-examples/lesson-01) |
| 2 | Variables del personaje | [OnlineGDB](https://onlinegdb.com/ddxkrJwE1) | [Ver](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/tree/main/completed-examples/lesson-02) |
| 3 | Tienda de pociones | [OnlineGDB](https://onlinegdb.com/F-0DxmxNE) | [Ver](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/tree/main/completed-examples/lesson-03) |
| 4 | Medallas y nivel secreto | [OnlineGDB](https://onlinegdb.com/sXk2C4Fv7) | [Ver](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/tree/main/completed-examples/lesson-04) |
| 5 | Rondas y monedas | [OnlineGDB](https://onlinegdb.com/3QTQlzSoS) | [Ver](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/tree/main/completed-examples/lesson-05) |
| 6 | Puntaje y barra de energía | [OnlineGDB](https://onlinegdb.com/9Z0NF16VG) | [Ver](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/tree/main/completed-examples/lesson-06) |
| 7 | Mascota virtual | [OnlineGDB](https://onlinegdb.com/XWLuekxHQ) | [Ver](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/tree/main/completed-examples/lesson-07) |
| 8 | Equipo de mascotas | [OnlineGDB](https://onlinegdb.com/YE4Tk9dx7) | [Ver](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/tree/main/completed-examples/lesson-08) |
| 9 | Juego de adivinanzas | [OnlineGDB](https://onlinegdb.com/lhuKMb4Qk) | [Ver](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/tree/main/completed-examples/lesson-09) |
| 10 | Caza de errores | [OnlineGDB](https://onlinegdb.com/a1OvmWuxa) | [Ver](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/tree/main/completed-examples/lesson-10) |

- **Cuestionario**: [Prueba de conocimientos](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/blob/main/cuestionario.md) (10 preguntas, una por lección)
- **Documentación oficial**: [Tutoriales de Java de Oracle](https://docs.oracle.com/javase/tutorial/)
- Compartir: #JavaBeginners

Gracias por completar el curso.

---

## Elaboración

Universidad Peruana de Ciencias Aplicadas  
Carrera de Ingeniería de Software  
Período 202620  
1ASI0729 Desarrollo de Aplicaciones Open Source  
NRC 7750  

**Nombre del equipo**: AndesHeavyTech  
**Líder del equipo**: Cespedes Lezcano, Carlos Gabriel  
**Integrantes del equipo**: Cespedes Lezcano, Carlos Gabriel; Tantalean Granda, Nicolas; Castillo Guevara, Mathias Alejandro; Gutiérrez Lizarbe, Wilmer Sebastián  
**Fecha de entrega**: 13 de noviembre de 2026  

### Resumen de la elaboración en equipo

El curso se planificó y elaboró de forma colaborativa en el repositorio público del curso. Cada integrante tuvo a su cargo lecciones completas (código inicial, solución, guion y video), y todos los aportes quedaron registrados como commits en GitHub.

| Integrante | Lecciones y responsabilidades | Evidencia |
|---|---|---|
| Cespedes Lezcano, Carlos Gabriel | Coordinación, plan del curso, lecciones 7, 8, 9 y 10, edición final | Commits [5c0c6be](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/commit/5c0c6be38c984b875bf113fece11a23295a1509d) y [774cbd2](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/commit/774cbd272c3b841b0aab23942cb2ceca308996b3) |
| Tantalean Granda, Nicolas | Lecciones 1 y 2 | Commit [37dda6f](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/commit/37dda6f186254976d18af15209ece3640cabcb8e) |
| Castillo Guevara, Mathias Alejandro | Lecciones 3 y 4 | Commit [1fbbefe](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/commit/1fbbefe994d503208ad196c99804da42960e1123) |
| Gutiérrez Lizarbe, Wilmer Sebastián | Lecciones 5 y 6 | Commit [e218d29](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/commit/e218d299e223e3e9bbd8078029c249583a178730) |
