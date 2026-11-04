# Guía de producción de los videos

Esta guía apunta a los criterios de la rúbrica: **C03 Enganche con el público (5 pts)** y **C04 Calidad de video (4 pts)**.

## Formato común de todas las lecciones

Todas las lecciones siguen la misma estructura para que el curso se sienta como una sola serie:

1. **Gancho (15–45 s):** una situación de videojuego o de la vida diaria y lo que se va a lograr.
2. **Concepto con animación o analogía:** cajas (variables), recetas (instrucciones), molde de galletas (clases), cajero automático (encapsulación).
3. **Código en vivo en OnlineGDB,** escrito poco a poco y no pegado de golpe.
4. **⏸ Pausa de práctica:** tarjeta a pantalla completa con los TODO y un contador de 10 s.
5. **Solución y un error provocado a propósito,** para normalizar los errores.
6. **Mini reto + pregunta rápida:** se muestra la pregunta, se esperan 5 s y luego la respuesta.
7. **Repaso en 3–4 ideas y avance de la siguiente lección.**

El hilo conductor (el personaje PixelNova, la mascota virtual y el juego final) aparece en todas las lecciones.

## Grabación de pantalla

- Resolución **1920×1080**, 30 fps. Grabar con [OBS Studio](https://obsproject.com/) (gratuito).
- En OnlineGDB, subir el tamaño de letra del editor (ícono de engranaje → *Font size* 18 o más) y el zoom del navegador al 125 %.
- Cerrar pestañas, notificaciones y marcadores. Nada personal ni del equipo en pantalla.
- Hacer zoom (en edición) sobre la línea que se explica.

## Narración (voz en off)

Hay dos opciones; se debe usar **la misma voz en las 10 lecciones**:

- **Voz grabada:** micrófono de auriculares en una habitación pequeña con cortinas o ropa alrededor. Grabar en [Audacity](https://www.audacityteam.org/) y aplicar *Reducción de ruido* y *Normalizar* a −1 dB.
- **Voz sintética (TTS):** pasar `python3 tools/limpiar_guion.py scripts/lesson-XX-guion-tts.txt` y pegar el resultado en la herramienta de voz. Elegir una voz en español latinoamericano y velocidad normal.

El guion está escrito para leerse en voz alta: el código se dice en palabras («System punto out punto println») y se evitan términos mal traducidos (ver el Anexo C del enunciado: nada de «testear», «librería» ni «aplicativo»).

## Edición

- [DaVinci Resolve](https://www.blackmagicdesign.com/products/davinciresolve) o [CapCut](https://www.capcut.com/) (versiones gratuitas).
- Música de fondo suave, sin letra y libre de derechos (Biblioteca de audio de YouTube), a −25 dB por debajo de la voz.
- Textos en pantalla con fuente sin serifa grande y con alto contraste (los textos sugeridos están en cada `lesson-XX-script.md`).
- Recortar silencios largos, pero dejar las pausas de práctica.
- Exportar en MP4 (H.264), 1080p.

## Subtítulos

1. `python3 tools/limpiar_guion.py scripts/lesson-XX-guion-tts.txt > transcripcion-XX.txt`
2. En YouTube Studio → Subtítulos → Agregar → **Sincronización automática** → pegar el texto.
3. Revisar la sincronización y corregir los términos de código.

## Lista de control final del curso

- [ ] 10 videos, cada uno de 5 a 15 minutos, total aproximado de 60 minutos.
- [ ] Todo el código se demuestra en un editor en línea.
- [ ] Texto en pantalla, anotaciones y narración en todos los videos.
- [ ] Sin nombres ni logos del equipo en los videos ni en el código.
- [ ] Videos **no listados** y agregados a una lista de reproducción.
- [ ] Cada descripción enlaza a su práctica en OnlineGDB.
- [ ] `course-plan.md` sin ningún `PENDIENTE` y exportado a PDF.
- [ ] Cada integrante tiene commits propios en el repositorio.
