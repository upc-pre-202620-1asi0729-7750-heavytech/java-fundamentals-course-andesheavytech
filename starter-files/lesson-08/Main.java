// Lección 8: Encapsulación, getters, setters y arreglos de objetos

class Mascota {
    // private: nadie fuera de la clase puede cambiar estos datos directamente.
    private String nombre;
    private int energia;

    Mascota(String nombre) {
        this.nombre = nombre;
        this.energia = 50;
    }

    // Getter: permite LEER un atributo privado.
    public String getNombre() {
        return nombre;
    }

    // TODO 1: crea el getter getEnergia().

    // Setter: permite CAMBIAR un atributo, pero con reglas.
    public void setEnergia(int energia) {
        // TODO 2: solo acepta valores entre 0 y 100.
        //         Si el valor no es válido, muestra un aviso y no lo cambies.
        this.energia = energia;
    }
}

public class Main {
    public static void main(String[] args) {
        Mascota toby = new Mascota("Toby");
        toby.setEnergia(80);
        System.out.println(toby.getNombre() + " está lista para jugar.");

        // Prueba del TODO 2: este valor debería ser rechazado.
        toby.setEnergia(500);

        // Un arreglo guarda varios objetos del mismo tipo.
        Mascota[] equipo = new Mascota[3];
        equipo[0] = toby;
        equipo[1] = new Mascota("Michi");
        equipo[2] = new Mascota("Rocky");

        // TODO 3: recorre el arreglo con un for y muestra el nombre en MAYÚSCULAS
        //         y la cantidad de letras de cada mascota.
        //         Pistas: equipo.length, getNombre().toUpperCase(), getNombre().length()
    }
}
