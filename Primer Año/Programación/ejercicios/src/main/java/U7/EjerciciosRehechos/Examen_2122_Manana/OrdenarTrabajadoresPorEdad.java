package U7.EjerciciosRehechos.Examen_2122_Manana;

import java.util.Comparator;

public class OrdenarTrabajadoresPorEdad implements Comparator<Trabajador> {
    @Override
    public int compare(Trabajador t1, Trabajador t2) {
        if (t1.getEdad() == t2.getEdad()) {
            return t1.getNombre().compareTo(t2.getNombre());
        } else {
            if (t1.getEdad() > t2.getEdad()) {
                return 1;
            } else if (t1.getEdad() < t2.getEdad()) {
                return -1;
            }
            return 0;
        }
    }
}
