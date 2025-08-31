package U7.EjerciciosRehechos.Examen_1920_Manana;

import java.util.Comparator;

public class OrdenarPerrosPorEdad implements Comparator<Perro> {
    @Override
    public int compare(Perro o1, Perro o2) {
        if (o1.getEdad() > o2.getEdad()) {
            return 1;
        } else if (o1.getEdad() < o2.getEdad()) {
            return -1;
        }
        return 0;
    }
}
