// Lección 7: Clases y objetos
// Solución de referencia.

class Mascota {
    // Atributos: lo que la mascota TIENE.
    String nombre;
    String especie;
    int energia;

    // Constructor: se ejecuta cuando creamos el objeto con new.
    Mascota(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
        this.energia = 50;
    }

    // Métodos: lo que la mascota HACE.
    void jugar() {
        energia -= 20;
        System.out.println(nombre + " jugó y se cansó un poco.");
    }

    // TODO 1
    void comer() {
        energia += 30;
        System.out.println(nombre + " comió y recuperó energía.");
    }

    void mostrarEstado() {
        System.out.println(nombre + " (" + especie + ") tiene " + energia + " de energía.");
    }
}

public class Main {
    public static void main(String[] args) {
        Mascota miMascota = new Mascota("Toby", "perro");
        miMascota.mostrarEstado();
        miMascota.jugar();
        miMascota.mostrarEstado();

        // TODO 2
        miMascota.comer();
        miMascota.mostrarEstado();

        // TODO 3: cada objeto guarda sus propios valores.
        Mascota otraMascota = new Mascota("Michi", "gato");
        otraMascota.jugar();
        otraMascota.jugar();
        otraMascota.mostrarEstado();
        miMascota.mostrarEstado();
    }
}
