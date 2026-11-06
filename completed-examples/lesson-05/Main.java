// Lección 5: Repetir con bucles for y while
// Solución de referencia.

public class Main {
    public static void main(String[] args) {
        // Cuenta regresiva con for: inicio; condición; cambio
        for (int i = 3; i >= 1; i--) {
            System.out.println(i + "...");
        }
        System.out.println("¡Comienza la partida!");

        // TODO 1: for cuando sabemos cuántas veces repetir.
        for (int ronda = 1; ronda <= 5; ronda++) {
            System.out.println("Ronda " + ronda);
        }

        // TODO 2: while cuando repetimos mientras se cumpla una condición.
        int monedas = 0;
        while (monedas < 100) {
            monedas += 15;
            System.out.println("Monedas: " + monedas);
        }
        System.out.println("¡Ya puedes comprar la espada!");

        // Extra: un for dentro de otro dibuja figuras.
        for (int fila = 1; fila <= 3; fila++) {
            for (int col = 1; col <= fila; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
