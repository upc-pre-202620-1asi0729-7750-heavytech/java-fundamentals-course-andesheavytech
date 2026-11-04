// Lección 10: Errores comunes y buenas prácticas
// Solución de referencia con los 5 errores corregidos.

public class Main {
    public static void main(String[] args) {
        // Error 1: Java distingue mayúsculas y minúsculas. Es String, no string.
        String saludo = "Hola, programador";
        // Error 2: faltaba el punto y coma al final de la instrucción.
        System.out.println(saludo);

        int[] puntos = {40, 75, 90};
        // Error 3: las posiciones van de 0 a length - 1. Se usa <, no <=.
        for (int i = 0; i < puntos.length; i++) {
            System.out.println("Puntaje: " + puntos[i]);
        }

        int total = 40 + 75 + 90;
        // Error 4: int / int descarta los decimales. Dividimos entre 3.0.
        double promedio = total / 3.0;
        System.out.println("Promedio: " + promedio);

        String clave = new String("java");
        // Error 5: los textos se comparan con equals, no con ==.
        if (clave.equals("java")) {
            System.out.println("Clave correcta");
        }
    }
}
