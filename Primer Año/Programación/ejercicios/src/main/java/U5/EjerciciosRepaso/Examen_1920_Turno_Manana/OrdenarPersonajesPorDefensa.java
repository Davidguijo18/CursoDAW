package U5.EjerciciosRepaso.Examen_1920_Turno_Manana;

import java.util.Comparator;

public class OrdenarPersonajesPorDefensa implements Comparator<Personajes> {
    public int compare(Personajes personaje1, Personajes personaje2) {
        if (personaje1.getCapacidadDefensa() > personaje2.getCapacidadDefensa()) {
            return 1;
        } else if (personaje1.getCapacidadDefensa() < personaje2.getCapacidadDefensa()) {
            return -1;
        } else {
            return 0;
        }
    }
}
