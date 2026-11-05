// Lección 7: Clases y objetos
// Una clase es un molde. Un objeto es algo creado con ese molde.

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

    // TODO 1: crea un método comer() que sume 30 a la energía y muestre un mensaje.

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

        // TODO 2: después de crear comer(), haz que miMascota coma y muestra su estado.

        // TODO 3: crea una segunda mascota (por ejemplo, un gato llamado "Michi")
        //         y demuestra que cada objeto tiene su propia energía.
    }
}
