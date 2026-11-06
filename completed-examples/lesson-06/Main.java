// Lección 6: Métodos y parámetros
// Solución de referencia.

public class Main {

    // Método sin parámetros y sin resultado (void).
    static void mostrarTitulo() {
        System.out.println("=== AVENTURA JAVA ===");
    }

    // Método con un parámetro.
    static void saludar(String nombre) {
        System.out.println("¡Bienvenido, " + nombre + "!");
    }

    // TODO 1: un método que devuelve un valor indica su tipo en lugar de void.
    static int calcularPuntaje(int monedas, int enemigos) {
        return monedas * 10 + enemigos * 50;
    }

    // TODO 2
    static void mostrarBarra(int energia) {
        System.out.print("Energía: ");
        for (int i = 0; i < energia / 10; i++) {
            System.out.print("#");
        }
        System.out.println(" " + energia + "%");
    }

    public static void main(String[] args) {
        mostrarTitulo();
        saludar("PixelNova");
        saludar("LunaByte");

        // TODO 3: guardamos el valor devuelto en una variable.
        int puntaje = calcularPuntaje(12, 3);
        System.out.println("Puntaje final: " + puntaje);

        // TODO 4: el mismo método, distintos valores.
        mostrarBarra(70);
        mostrarBarra(30);
    }
}
