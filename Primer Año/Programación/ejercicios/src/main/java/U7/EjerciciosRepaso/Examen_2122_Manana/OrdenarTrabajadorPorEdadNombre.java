package U7.EjerciciosRepaso.Examen_2122_Manana;

import java.util.Comparator;

public class OrdenarTrabajadorPorEdadNombre implements Comparator<Trabajador> {
    @Override
    public int compare(Trabajador o1, Trabajador o2) {
        if (o1.getEdad() > o2.getEdad()) {
            return 1;
        } else if (o1.getEdad() < o2.getEdad()) {
            return -1;
        } else {
            return o1.getNombre().compareTo(o2.getNombre());
        }
    }
}
