// Lección 10: Errores comunes y buenas prácticas
// ¡Este programa tiene 5 errores a propósito! Encuéntralos y corrígelos.
// Pista: lee con calma el mensaje de error de la consola, indica la línea.

public class Main {
    public static void main(String[] args) {
        string saludo = "Hola, programador";
        System.out.println(saludo)

        int[] puntos = {40, 75, 90};
        for (int i = 0; i <= puntos.length; i++) {
            System.out.println("Puntaje: " + puntos[i]);
        }

        int total = 40 + 75 + 90;
        double promedio = total / 3;
        System.out.println("Promedio: " + promedio);

        String clave = new String("java");
        if (clave == "java") {
            System.out.println("Clave correcta");
        }
    }
}
