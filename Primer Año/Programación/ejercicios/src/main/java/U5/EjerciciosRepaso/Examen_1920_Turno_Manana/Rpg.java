package U5.EjerciciosRepaso.Examen_1920_Turno_Manana;

import U5.Entregable.Pais;

import java.util.Arrays;

public class Rpg {
    private Personajes[] personajes = new Personajes[0];
    private final int NUM_MAXIMO_PERSONAJES = 10;
    private int contador = 0;

    public void anadirPersonajes(Personajes personaje) {
        if (personajes.length < NUM_MAXIMO_PERSONAJES) {
            personajes = Arrays.copyOf(personajes, personajes.length + 1);
            personajes[contador] = personaje;
            contador++;
        } else {
            System.out.println("No se pueden anadir mas personajes");
        }
    }

    public void borrarMuertos(Personajes personaje) {
        int posicion = 0;
        for (int i = 0; i < contador; i++) {
            if (personajes[i].equals(personaje)) {
                posicion = i;
            }
        }
        Personajes[] copia_personaje = Arrays.copyOfRange(personajes, posicion + 1, personajes.length);
        if (personajes.length == contador) {
            personajes = Arrays.copyOf(personajes, personajes.length - 1);
        }
        for (int i = 0; i < copia_personaje.length; i++) {
            personajes[posicion] = copia_personaje[i];
            posicion++;
        }
        contador--;
    }

    public void mostrarEstado() {
        Arrays.sort(personajes, new OrdenarPersonajesPorEnergia());
        System.out.println(Arrays.toString(personajes));
    }

    public void mostrarAtaque() {
        Arrays.sort(personajes, new OrdenarPersonajesPorAtaque());
        System.out.println(Arrays.toString(personajes));
    }

    public void mostrarDefensa() {
        Arrays.sort(personajes, new OrdenarPersonajesPorDefensa());
        System.out.println(Arrays.toString(personajes));
    }

    public void hayGanador() {
        if (personajes.length > 1) {
            System.out.println("Aun hay mas de un personaje con vida");
        } else {
            System.out.print("Personaje ganador: ");
            System.out.println(Arrays.toString(personajes));
            System.out.println("Felicidades!!!");
        }
    }
}
