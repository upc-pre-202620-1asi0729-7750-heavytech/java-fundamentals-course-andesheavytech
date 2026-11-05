// Lección 8: Encapsulación, getters, setters y arreglos de objetos
// Solución de referencia.

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

    // TODO 1
    public int getEnergia() {
        return energia;
    }

    // Setter: permite CAMBIAR un atributo, pero con reglas.
    public void setEnergia(int energia) {
        // TODO 2: la clase protege sus propios datos.
        if (energia >= 0 && energia <= 100) {
            this.energia = energia;
        } else {
            System.out.println("Valor no válido: " + energia + ". La energía va de 0 a 100.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Mascota toby = new Mascota("Toby");
        toby.setEnergia(80);
        System.out.println(toby.getNombre() + " está lista para jugar.");

        // Prueba del TODO 2: este valor debería ser rechazado.
        toby.setEnergia(500);
        System.out.println("Energía de " + toby.getNombre() + ": " + toby.getEnergia());

        // Un arreglo guarda varios objetos del mismo tipo.
        Mascota[] equipo = new Mascota[3];
        equipo[0] = toby;
        equipo[1] = new Mascota("Michi");
        equipo[2] = new Mascota("Rocky");

        // TODO 3: las posiciones van de 0 a length - 1.
        for (int i = 0; i < equipo.length; i++) {
            String nombre = equipo[i].getNombre();
            System.out.println(nombre.toUpperCase() + " tiene " + nombre.length()
                    + " letras y " + equipo[i].getEnergia() + " de energía.");
        }
    }
}
