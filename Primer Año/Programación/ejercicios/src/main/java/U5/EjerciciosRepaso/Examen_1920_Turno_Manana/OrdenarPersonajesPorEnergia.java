package U5.EjerciciosRepaso.Examen_1920_Turno_Manana;

import java.util.Comparator;

public class OrdenarPersonajesPorEnergia implements Comparator<Personajes> {
    @Override
    public int compare(Personajes personaje1, Personajes personaje2) {
        if (personaje1.getEnergia() > personaje2.getEnergia()) {
            return -1;
        } else if (personaje1.getEnergia() < personaje2.getEnergia()) {
            return 1;
        } else {
            return 0;
        }
    }
}
