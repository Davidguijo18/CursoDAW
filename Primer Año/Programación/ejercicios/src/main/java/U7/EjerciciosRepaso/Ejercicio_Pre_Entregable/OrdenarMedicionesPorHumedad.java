package U7.EjerciciosRepaso.Ejercicio_Pre_Entregable;

import java.util.Comparator;

public class OrdenarMedicionesPorHumedad implements Comparator<Medicion> {
    @Override
    public int compare(Medicion m1, Medicion m2) {
        if (m1.getHumedad() > m2.getHumedad()) {
            return -1;
        } else if (m1.getHumedad() < m2.getHumedad()) {
            return 1;
        }
        return 0;
    }
}
