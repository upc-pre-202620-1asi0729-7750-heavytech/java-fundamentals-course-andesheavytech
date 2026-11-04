// Lección 4: Tomar decisiones con if, else if y else
// Solución de referencia.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuántos puntos hiciste en la partida? ");
        int puntos = teclado.nextInt();

        // TODO 1: las condiciones se revisan de arriba hacia abajo.
        if (puntos >= 100) {
            System.out.println("¡Medalla de oro!");
        } else if (puntos >= 50) {
            System.out.println("¡Medalla de plata!");
        } else {
            System.out.println("Sigue practicando.");
        }

        // TODO 2: && significa "y"; las dos condiciones deben cumplirse.
        System.out.print("¿Cuántas vidas te quedan? ");
        int vidas = teclado.nextInt();

        if (vidas > 0 && puntos > 100) {
            System.out.println("¡Desbloqueaste el nivel secreto!");
        } else if (vidas == 0) {
            System.out.println("Game over. ¡Inténtalo otra vez!");
        } else {
            System.out.println("Consigue más de 100 puntos para el nivel secreto.");
        }

        teclado.close();
    }
}
