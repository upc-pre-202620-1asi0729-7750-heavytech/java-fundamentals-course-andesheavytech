# Fundamentos de Java para Principiantes

## Resumen del Curso

Este curso de aproximadamente 1 hora introduce a estudiantes de secundaria a los fundamentos de la programación con Java, incluida la programación orientada a objetos. A lo largo de 10 lecciones cortas, el estudiante acompaña a un personaje de videojuego llamado **PixelNova**, cuida una mascota virtual y termina programando su propio **juego de adivinanzas con clases**. **¡No requiere descargas!** Solo abre tu navegador web.

**Duración total**: ~60 minutos (10 lecciones de 5 a 7 minutos)
**Público Objetivo**: Estudiantes de 12 a 17 años sin experiencia en programación
**Prerrequisitos**: Ninguno
**Herramientas necesarias**: **¡Solo tu navegador web!** (Chrome, Firefox, Safari, Edge) y el editor gratuito [OnlineGDB](https://www.onlinegdb.com/online_java_compiler)
**📂 Repositorio de Código Fuente**: [https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech)

### ¿Cómo funciona cada lección?

1. Mira el video. Cada uno empieza mostrando lo que vas a lograr.
2. Cuando aparezca **⏸ Pausa**, detén el video y abre la práctica con un clic.
3. Completa los comentarios `TODO` del código y presiona **Run**.
4. Intenta el **mini reto** y responde la **pregunta rápida** del final.
5. Si te trabas, compara con la solución en el repositorio.

## Secuencia de la Lección

### Lección 1: ¿Qué es programar? Tu primer programa en Java (5:30)

- **Descripción**: Descubre qué es programar, para qué se usa Java y ejecuta tu primer programa sin instalar nada.
- **Enlace**: [Ver la lección](https://youtu.be/rE5g7Wa5n2g)
- **Conclusiones clave**: Un programa es una lista de instrucciones precisas; Java empieza en `main`; `System.out.println("Hola");` muestra texto.
- **Empieza a programar**: [Abrir en OnlineGDB](https://onlinegdb.com/KjeUyRkYG_) 👈 **¡No necesitas registrarte!**
- **Código**: [inicial](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/tree/main/starter-files/lesson-01) · [solución](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/tree/main/completed-examples/lesson-01)

### Lección 2: Variables y tipos de datos (5:45)

- **Descripción**: Guarda los datos de tu personaje (nombre, nivel, energía) en variables.
- **Enlace**: [Ver la lección](https://youtu.be/rfPQFgnpz-Q)
- **Conclusiones clave**: `String nombre = "PixelNova";` `int nivel = 1;` `double energia = 75.5;` `boolean tieneEscudo = false;`
- **Práctica**: [Abrir en OnlineGDB](https://onlinegdb.com/ddxkrJwE1) 👈 **¡No necesitas registrarte!**
- **Código**: [inicial](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/tree/main/starter-files/lesson-02) · [solución](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/tree/main/completed-examples/lesson-02)

### Lección 3: Operadores y entrada de datos con Scanner (6:00)

- **Descripción**: Haz que el programa te pregunte cosas y calcule monedas, pociones y bonus.
- **Enlace**: [Ver la lección](https://youtu.be/LIqTo2oa_nM)
- **Conclusiones clave**: `Scanner teclado = new Scanner(System.in);` `25 / 7 = 3` y `25 % 7 = 4`; `total += 5;`
- **Práctica**: [Abrir en OnlineGDB](https://onlinegdb.com/F-0DxmxNE) 👈 **¡No necesitas registrarte!**
- **Código**: [inicial](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/tree/main/starter-files/lesson-03) · [solución](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/tree/main/completed-examples/lesson-03)

### Lección 4: Tomar decisiones con if, else if y else (5:40)

- **Descripción**: Decide qué medalla gana el jugador y desbloquea un nivel secreto.
- **Enlace**: [Ver la lección](https://youtu.be/jwEjyrGpZ7w)
- **Conclusiones clave**: `if (puntos >= 100) {...} else if (puntos >= 50) {...} else {...}`; `&&` significa «y».
- **Práctica**: [Abrir en OnlineGDB](https://onlinegdb.com/sXk2C4Fv7) 👈 **¡No necesitas registrarte!**
- **Código**: [inicial](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/tree/main/starter-files/lesson-04) · [solución](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/tree/main/completed-examples/lesson-04)

### Lección 5: Repetir con bucles for y while (5:50)

- **Descripción**: Crea cuentas regresivas, rondas y recolecta monedas sin repetir código.
- **Enlace**: [Ver la lección](https://youtu.be/BYDImQMPa0w)
- **Conclusiones clave**: `for (int i = 1; i <= 5; i++) {...}` cuando sabes cuántas veces; `while (monedas < 100) {...}` cuando no.
- **Práctica**: [Abrir en OnlineGDB](https://onlinegdb.com/3QTQlzSoS) 👈 **¡No necesitas registrarte!**
- **Código**: [inicial](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/tree/main/starter-files/lesson-05) · [solución](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/tree/main/completed-examples/lesson-05)

### Lección 6: Métodos y parámetros (5:40)

- **Descripción**: Escribe código una vez y reutilízalo: saludos, puntajes y barras de energía.
- **Enlace**: [Ver la lección](https://youtu.be/R59n0P84xPM)
- **Conclusiones clave**: `static int calcularPuntaje(int monedas, int enemigos) { return ...; }`; `void` no devuelve nada.
- **Práctica**: [Abrir en OnlineGDB](https://onlinegdb.com/9Z0NF16VG) 👈 **¡No necesitas registrarte!**
- **Código**: [inicial](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/tree/main/starter-files/lesson-06) · [solución](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/tree/main/completed-examples/lesson-06)

### Lección 7: Clases y objetos (6:45)

- **Descripción**: Crea tu primera clase `Mascota` y varios objetos, cada uno con su propia energía.
- **Enlace**: [Ver la lección](https://youtu.be/PhIKUwvrgGY)
- **Conclusiones clave**: Clase = molde, objeto = galleta; `new Mascota("Toby", "perro")`; el constructor da los valores iniciales.
- **Práctica**: [Abrir en OnlineGDB](https://onlinegdb.com/XWLuekxHQ) 👈 **¡No necesitas registrarte!**
- **Código**: [inicial](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/tree/main/starter-files/lesson-07) · [solución](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/tree/main/completed-examples/lesson-07)

### Lección 8: Encapsulación, getters, setters y arreglos de objetos (6:25)

- **Descripción**: Protege los datos con `private`, valida con setters y guarda un equipo de mascotas en un arreglo.
- **Enlace**: [Ver la lección](https://youtu.be/4i0zMY9dZYo)
- **Conclusiones clave**: `private int energia;` `getEnergia()` / `setEnergia(int)` con validación; los índices empiezan en 0.
- **Práctica**: [Abrir en OnlineGDB](https://onlinegdb.com/YE4Tk9dx7) 👈 **¡No necesitas registrarte!**
- **Código**: [inicial](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/tree/main/starter-files/lesson-08) · [solución](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/tree/main/completed-examples/lesson-08)

### Lección 9: Proyecto final: juego de adivinanzas con clases (6:50)

- **Descripción**: Programa un juego completo con las clases `Jugador` y `JuegoAdivinanza`.
- **Enlace**: [Ver la lección](https://youtu.be/wlSmvIYc4Qw)
- **Conclusiones clave**: Cada clase tiene una responsabilidad; `return` termina el método; estrategia de búsqueda binaria.
- **Proyecto final**: [Abrir en OnlineGDB](https://onlinegdb.com/lhuKMb4Qk) 👈 **¡No necesitas registrarte!**
- **Código**: [inicial](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/tree/main/starter-files/lesson-09) · [solución](https://github.com/upc-pre-202620-1asi0729-7750-heavytech/java-fundamentals-course-andesheavytech/tree/main/completed-examples/lesson-09)

### Lección 10: Errores comunes, buenas prácticas y próximos pasos (5:40)

- **Descripción**: Encuentra y corrige 5 errores típicos y aprende hábitos de buen programador.
- **Enlace**: [Ver la lección](https://youtu.be/YH2JwEQ03lE)
- **Conclusiones clave**: Errores de compilación, ejecución y lógica; corrige el primero y vuelve a ejecutar; textos con `equals`.
- **Práctica**: [Abrir en OnlineGDB](https://onlinegdb.com/a1OvmWuxa) 👈 **¡No necesitas registrarte!**
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

- **Cuestionario**: [Prueba de conocimientos](PENDIENTE_FORMULARIO_CUESTIONARIO) (10 preguntas, una por lección)
- **Documentación oficial**: [Tutoriales de Java de Oracle](https://docs.oracle.com/javase/tutorial/)
- Compartir: #JavaBeginners

**¡Gracias por completar el curso!**

---

## 👥 Elaboración

Universidad Peruana de Ciencias Aplicadas  
Carrera de Ingeniería de Software  
Período 202620  
1ASI0729 Desarrollo de Aplicaciones Open Source  
NRC 7750  

**Nombre del equipo**: AndesHeavyTech  
**Líder del equipo**: Cespedes Lezcano, Carlos Gabriel  
**Integrantes del equipo**: Cespedes Lezcano, Carlos Gabriel; Tantalean Granda, Nicolas; Castillo Guevara, Mathias Alejandro; Gutiérrez Lizarbe, Wilmer Sebastián; Fuentes Alvarez, Angiela Stephany  
**Fecha de entrega**: PENDIENTE  

### Resumen de la elaboración en equipo

El curso se planificó y elaboró de forma colaborativa en el repositorio público del curso. Cada integrante tuvo a su cargo lecciones completas (código inicial, solución, guion y video), y todos los aportes quedaron registrados como commits en GitHub.

| Integrante | Lecciones y responsabilidades | Evidencia |
|---|---|---|
| Cespedes Lezcano, Carlos Gabriel | Coordinación, plan del curso, lecciones 9 y 10, edición final | PENDIENTE: enlace a commits |
| Tantalean Granda, Nicolas | Lecciones 1 y 2 | PENDIENTE: enlace a commits |
| Castillo Guevara, Mathias Alejandro | Lecciones 3 y 4 | PENDIENTE: enlace a commits |
| Gutiérrez Lizarbe, Wilmer Sebastián | Lecciones 5 y 6 | PENDIENTE: enlace a commits |
| Fuentes Alvarez, Angiela Stephany | Lecciones 7 y 8 | PENDIENTE: enlace a commits |
