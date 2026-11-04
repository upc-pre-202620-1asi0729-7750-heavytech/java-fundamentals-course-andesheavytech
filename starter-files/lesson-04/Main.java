// Lección 4: Tomar decisiones con if, else if y else

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuántos puntos hiciste en la partida? ");
        int puntos = teclado.nextInt();

        if (puntos >= 100) {
            System.out.println("¡Medalla de oro!");
        } else {
            System.out.println("Sigue practicando.");
        }

        // TODO 1: agrega un "else if" para dar medalla de plata si puntos >= 50.

        // TODO 2: pregunta cuántas vidas le quedan al jugador.
        //         Si tiene más de 0 vidas Y más de 100 puntos, muestra "¡Desbloqueaste el nivel secreto!".
        //         Pista: el operador Y se escribe &&.

        teclado.close();
    }
}
