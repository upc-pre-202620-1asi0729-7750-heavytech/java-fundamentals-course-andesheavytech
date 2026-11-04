// Lección 3: Operadores y entrada de datos con Scanner
// Escribe tus respuestas en la consola cuando el programa te las pida.

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

        // TODO 1: cada poción cuesta 7 monedas. Calcula cuántas pociones puede
        //         comprar usando la división entera ( / ) y muéstralo.

        // TODO 2: calcula cuántas monedas le sobran usando el operador resto ( % ).

        // TODO 3: suma 5 monedas de bonus usando el operador += y muestra el nuevo total.

        teclado.close();
    }
}
