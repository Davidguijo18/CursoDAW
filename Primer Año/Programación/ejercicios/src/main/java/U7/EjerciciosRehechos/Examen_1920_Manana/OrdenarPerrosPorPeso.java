package U7.EjerciciosRehechos.Examen_1920_Manana;

import java.util.Comparator;

public class OrdenarPerrosPorPeso implements Comparator<Perro> {
    public int compare(Perro o1, Perro o2) {
        if (o1.getPeso() > o2.getPeso()) {
            return 1;
        } else if (o1.getPeso() < o2.getPeso()) {
            return -1;
        }
        return 0;
    }
}
