// Lección 3: Operadores y entrada de datos con Scanner
// Solución de referencia.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cómo se llama tu personaje? ");
        String nombre = teclado.nextLine();

        System.out.print("¿Cuántas monedas recogió en el nivel 1? ");
        int monedasNivel1 = teclado.nextInt();

        System.out.print("¿Y en el nivel 2? ");
        int monedasNivel2 = teclado.nextInt();

        int total = monedasNivel1 + monedasNivel2;
        System.out.println(nombre + " tiene " + total + " monedas en total.");

        // TODO 1: división entera, se descartan los decimales.
        int precioPocion = 7;
        int pociones = total / precioPocion;
        System.out.println("Puede comprar " + pociones + " pociones.");

        // TODO 2: el resto de la división.
        int sobran = total % precioPocion;
        System.out.println("Le sobran " + sobran + " monedas.");

        // TODO 3: += suma y guarda en la misma variable.
        total += 5;
        System.out.println("Con el bonus ahora tiene " + total + " monedas.");

        // Extra: si quieres decimales, al menos un número debe ser double.
        double promedio = (monedasNivel1 + monedasNivel2) / 2.0;
        System.out.println("Promedio por nivel: " + promedio);

        teclado.close();
    }
}
