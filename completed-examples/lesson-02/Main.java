// Lección 2: Variables y tipos de datos
// Solución de referencia.

public class Main {
    public static void main(String[] args) {
        String nombre = "PixelNova"; // texto
        int nivel = 1;               // número entero
        double energia = 75.5;       // número con decimales
        boolean tieneEscudo = false; // verdadero o falso

        System.out.println("Personaje: " + nombre);
        System.out.println("Nivel: " + nivel);

        // TODO 1
        System.out.println("Energía: " + energia);
        System.out.println("¿Tiene escudo?: " + tieneEscudo);

        // TODO 2
        int monedas = 10;
        System.out.println("Monedas: " + monedas);

        // TODO 3: una variable puede cambiar de valor, pero no de tipo.
        nivel = 2;
        System.out.println("¡Subiste de nivel! Ahora eres nivel " + nivel);

        // Extra: un char guarda un solo carácter y va entre comillas simples.
        char inicial = 'P';
        System.out.println("Inicial del personaje: " + inicial);
    }
}
