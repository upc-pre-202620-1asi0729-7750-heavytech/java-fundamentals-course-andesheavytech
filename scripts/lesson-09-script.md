# Lección 9: Proyecto final: juego de adivinanzas con clases

- **Duración estimada:** 6:50 (ajustar con la duración real después de la edición).
- **Objetivo:** Integrar variables, Scanner, decisiones, bucles, métodos, clases y encapsulación en un juego completo.
- **Editor:** OnlineGDB, lenguaje Java. JDoodle sirve como alternativa.
- **Práctica:** [`starter-files/lesson-09/Main.java`](../starter-files/lesson-09/Main.java)
- **Solución:** [`completed-examples/lesson-09/Main.java`](../completed-examples/lesson-09/Main.java)
- **Narración:** [`lesson-09-guion-tts.txt`](lesson-09-guion-tts.txt)

## Guion de producción

| Tiempo | Acción en pantalla |
|---|---|
| 00:00–00:45 | Gancho: jugar una partida con la solución. **El número es aleatorio**: grabar la partida primero y adaptar la narración a los números que salgan. |
| 00:45–01:55 | Diagrama de las dos clases (`Jugador`, `JuegoAdivinanza`) y sus responsabilidades. Explicar `Random`. |
| 01:55–03:30 | TODO 1 y 2 dentro de `jugar`. Animación del `return` que corta el `for`. |
| 03:30–03:40 | **Pausa de práctica**. |
| 03:40–04:55 | `main`: `while`, `equals` y TODO 3 y 4. Flechas entre los dos objetos. |
| 04:55–05:35 | **Pausa de práctica**. Animación de la búsqueda binaria (la recta 1–50 se parte en mitades). |
| 05:35–06:50 | Mapa del curso con cada concepto marcado, ideas para ampliar, pregunta rápida y despedida. |

## Texto en pantalla

- `Jugador → quién juega y sus victorias`
- `JuegoAdivinanza → una partida`
- `return termina el método`
- `Estrategia: prueba siempre el número del medio`

## Resultado esperado

Un juego funcional con pistas, siete intentos, varias partidas y conteo de victorias.

## Mini reto

Agregar niveles de dificultad o una tabla de récords con un arreglo de `Jugador`.

## Pregunta rápida (cierre del video)

¿Qué pasa cuando se ejecuta `return true` dentro de `jugar`? (el método termina y devuelve true)

## Lista de control antes de publicar

- [ ] Fuente del editor de 18 px o más y zoom en el código cuando se escribe.
- [ ] Sin nombres de integrantes, logos ni marcas del equipo en el video ni en el código.
- [ ] Subtítulos en español cargados en YouTube.
- [ ] Descripción con el enlace directo a la práctica en OnlineGDB y al repositorio.
- [ ] Video subido como **no listado**.
