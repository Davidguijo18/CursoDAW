package U5.EjerciciosRepaso.Examen_21_22;

import java.util.Comparator;

public class OrdenarPorAutor implements Comparator<AgrupacionOficial> {
    @Override
    public int compare(AgrupacionOficial ao1, AgrupacionOficial ao2) {
        if (ao1 == null && ao2 == null) {
            return 0;
        } else if (ao1 == null) {
            return 1;
        } else if (ao2 == null) {
            return -1;
        }
        return ao1.getAutor().compareTo(ao2.getAutor());
    }
}
