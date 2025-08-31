package U5.EjerciciosRepaso.Examen_1920_Turno_Manana;

import java.util.Comparator;

public class OrdenarPersonajesPorAtaque implements Comparator<Personajes> {
    public int compare(Personajes personaje1, Personajes personaje2) {
        if (personaje1.getCapacidadAtaque() > personaje2.getCapacidadAtaque()) {
            return 1;
        } else if (personaje1.getCapacidadAtaque() < personaje2.getCapacidadAtaque()) {
            return -1;
        } else {
            return 0;
        }
    }
}
