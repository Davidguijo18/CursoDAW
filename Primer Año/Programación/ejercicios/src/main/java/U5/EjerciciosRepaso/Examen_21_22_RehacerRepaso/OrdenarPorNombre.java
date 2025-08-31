package U5.EjerciciosRepaso.Examen_21_22_RehacerRepaso;

import java.util.Comparator;

public class OrdenarPorNombre implements Comparator<AgrupacionOficial> {
    @Override
    public int compare(AgrupacionOficial ao1, AgrupacionOficial ao2) {
        return ao1.getNombre().compareTo(ao2.getNombre());
    }
}
