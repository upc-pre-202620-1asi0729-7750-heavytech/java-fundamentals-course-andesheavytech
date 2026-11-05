# Lección 8: Encapsulación, getters, setters y arreglos de objetos

- **Duración estimada:** 6:25 (ajustar con la duración real después de la edición).
- **Objetivo:** Proteger atributos con `private`, crear getters y setters con validación y recorrer un arreglo de objetos con métodos de `String`.
- **Editor:** OnlineGDB, lenguaje Java. JDoodle sirve como alternativa.
- **Práctica:** [`starter-files/lesson-08/Main.java`](../starter-files/lesson-08/Main.java)
- **Solución:** [`completed-examples/lesson-08/Main.java`](../completed-examples/lesson-08/Main.java)
- **Narración:** [`lesson-08-guion-tts.txt`](lesson-08-guion-tts.txt)

## Guion de producción

| Tiempo | Acción en pantalla |
|---|---|
| 00:00–00:45 | Gancho: retomar el problema de la energía negativa. Animación del cajero automático. |
| 00:45–01:45 | Pantalla: `private`, el error al acceder directo y `getNombre()`. TODO 1. |
| 01:45–02:55 | TODO 2: validar en `setEnergia`. Ejecutar y mostrar que 500 se rechaza. |
| 03:05–04:10 | Animación de casilleros numerados desde 0. Crear y llenar el arreglo. |
| 04:10–05:15 | TODO 3: recorrer con `for`, `toUpperCase()` y `length()`. |
| 05:15–06:25 | Comparar `length` y `length()`, mini reto, pregunta rápida y repaso. |

## Texto en pantalla

- `private = solo dentro de la clase`
- `get… lee · set… cambia con reglas`
- `Los índices empiezan en 0`
- `arreglo.length · texto.length()`

## Resultado esperado

Se rechaza 500, la energía sigue en 80 y se listan TOBY, MICHI y ROCKY con su cantidad de letras.

## Mini reto

Agregar una cuarta mascota (cambiar el tamaño del arreglo).

## Pregunta rápida (cierre del video)

En un arreglo de 5 elementos, ¿cuál es el índice del último? (4)

## Lista de control antes de publicar

- [ ] Fuente del editor de 18 px o más y zoom en el código cuando se escribe.
- [ ] Sin nombres de integrantes, logos ni marcas del equipo en el video ni en el código.
- [ ] Subtítulos en español cargados en YouTube.
- [ ] Descripción con el enlace directo a la práctica en OnlineGDB y al repositorio.
- [ ] Video subido como **no listado**.
