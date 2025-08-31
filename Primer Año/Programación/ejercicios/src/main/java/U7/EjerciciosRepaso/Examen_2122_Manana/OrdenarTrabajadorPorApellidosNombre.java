package U7.EjerciciosRepaso.Examen_2122_Manana;

import java.io.Serializable;
import java.util.Comparator;

public class OrdenarTrabajadorPorApellidosNombre implements Comparator<Trabajador>, Serializable {
    @Override
    public int compare(Trabajador o1, Trabajador o2) {
        if (o1.getApellidos().equalsIgnoreCase(o2.getApellidos())) {
            return o1.getNombre().compareTo(o2.getNombre());
        }

        return o1.getApellidos().compareTo(o2.getApellidos());
    }
}
