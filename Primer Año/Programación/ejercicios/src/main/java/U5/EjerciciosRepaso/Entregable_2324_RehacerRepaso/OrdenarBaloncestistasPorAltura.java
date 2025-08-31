package U5.EjerciciosRepaso.Entregable_2324_RehacerRepaso;

import java.util.Comparator;

public class OrdenarBaloncestistasPorAltura implements Comparator<Baloncestistas> {
    @Override
    public int compare(Baloncestistas baloncestista1, Baloncestistas baloncestista2) {
        if (baloncestista1.getAltura() > baloncestista2.getAltura()) {
            return 1;
        } else if (baloncestista1.getAltura() < baloncestista2.getAltura()) {
            return -1;
        } else {
            return 0;
        }
    }
}
