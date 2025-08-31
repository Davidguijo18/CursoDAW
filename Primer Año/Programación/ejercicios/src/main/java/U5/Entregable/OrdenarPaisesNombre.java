package U5.Entregable;

import java.util.Comparator;

public class OrdenarPaisesNombre implements Comparator<Pais> {
    @Override
    public int compare(Pais pais1, Pais pais2) {
        return pais1.getNombrePais().compareTo(pais2.getNombrePais());
    }
}
