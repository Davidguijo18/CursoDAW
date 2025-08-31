package U7.EjerciciosRepaso.Examen_2122_Manana;

import java.io.Serializable;
import java.util.Comparator;

public class OrdenarOfertaPorNumTrabajadores implements Comparator<Oferta>, Serializable {
    @Override
    public int compare(Oferta o1, Oferta o2) {
        return o2.getListaTrabajadores().size() - o1.getListaTrabajadores().size();
    }
}
