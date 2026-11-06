// Lección 6: Métodos y parámetros
// Un método es un bloque de código con nombre que podemos reutilizar.

public class Main {

    // Método sin parámetros y sin resultado (void).
    static void mostrarTitulo() {
        System.out.println("=== AVENTURA JAVA ===");
    }

    // Método con un parámetro.
    static void saludar(String nombre) {
        System.out.println("¡Bienvenido, " + nombre + "!");
    }

    // TODO 1: crea un método calcularPuntaje(int monedas, int enemigos)
    //         que devuelva (return) monedas * 10 + enemigos * 50.

    // TODO 2: crea un método mostrarBarra(int energia) que imprima
    //         un "#" por cada 10 puntos de energía. Pista: usa un for.

    public static void main(String[] args) {
        mostrarTitulo();
        saludar("PixelNova");
        saludar("LunaByte");

        // TODO 3: llama a calcularPuntaje con 12 monedas y 3 enemigos, y muestra el resultado.

        // TODO 4: llama a mostrarBarra con 70 y luego con 30.
    }
}
