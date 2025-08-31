package U7.EjerciciosRehechos.Examen_2122_Manana;

import java.io.Serializable;
import java.util.Comparator;

public class OrdenarListaSolicitantes implements Comparator<Trabajador>, Serializable {
    @Override
    public int compare(Trabajador t1, Trabajador t2) {
        if (t1.getApellidos().equalsIgnoreCase(t2.getApellidos())) {
            return t1.getNombre().compareTo(t2.getNombre());
        }
        return t1.getApellidos().compareTo(t2.getApellidos());
    }
}
