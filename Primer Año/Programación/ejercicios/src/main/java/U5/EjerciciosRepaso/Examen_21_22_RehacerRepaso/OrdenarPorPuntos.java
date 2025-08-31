package U5.EjerciciosRepaso.Examen_21_22_RehacerRepaso;

import java.util.Comparator;

public class OrdenarPorPuntos implements Comparator<AgrupacionOficial> {
    public int compare(AgrupacionOficial ao1, AgrupacionOficial ao2) {
        if (ao1.getPuntosObtenidos() > ao2.getPuntosObtenidos()) {
            return 1;
        } else if (ao1.getPuntosObtenidos() < ao2.getPuntosObtenidos()) {
            return -1;
        } else {
            return 0;
        }
    }
}
