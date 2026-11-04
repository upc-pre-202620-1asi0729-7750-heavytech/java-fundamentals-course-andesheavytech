// Lección 9: Proyecto final — Juego de adivinanzas con clases
// El programa piensa un número del 1 al 50 y tú tienes 7 intentos para adivinarlo.

import java.util.Random;
import java.util.Scanner;

class Jugador {
    private String nombre;
    private int partidasGanadas;

    Jugador(String nombre) {
        this.nombre = nombre;
        this.partidasGanadas = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPartidasGanadas() {
        return partidasGanadas;
    }

    public void sumarVictoria() {
        partidasGanadas++;
    }
}

class JuegoAdivinanza {
    private int numeroSecreto;
    private int maxIntentos;

    JuegoAdivinanza(int maximo, int maxIntentos) {
        Random azar = new Random();
        this.numeroSecreto = azar.nextInt(maximo) + 1; // de 1 a maximo
        this.maxIntentos = maxIntentos;
    }

    // Devuelve true si el jugador adivinó.
    public boolean jugar(Scanner teclado) {
        for (int intento = 1; intento <= maxIntentos; intento++) {
            System.out.print("Intento " + intento + " de " + maxIntentos + ". Tu número: ");
            int numero = teclado.nextInt();

            // TODO 1: si numero es igual a numeroSecreto, felicita al jugador y devuelve true.

            // TODO 2: si no, da una pista: "Es más alto" o "Es más bajo".
        }
        System.out.println("Se acabaron los intentos. El número era " + numeroSecreto + ".");
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cómo te llamas? ");
        Jugador jugador = new Jugador(teclado.nextLine());

        String respuesta = "s";
        while (respuesta.equals("s")) {
            JuegoAdivinanza juego = new JuegoAdivinanza(50, 7);

            // TODO 3: llama a juego.jugar(teclado). Si devuelve true, suma una victoria al jugador.

            System.out.print("¿Jugar otra vez? (s/n): ");
            respuesta = teclado.next();
        }

        // TODO 4: muestra el nombre del jugador y cuántas partidas ganó.

        teclado.close();
    }
}
