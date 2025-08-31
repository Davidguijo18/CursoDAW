package U5.EjerciciosRepaso.Entregable_2122_Manana;

import java.util.Comparator;

public class OrdenarPorSuperficie implements Comparator<Propiedad> {

    @Override
    public int compare(Propiedad propiedad1, Propiedad propiedad2) {
        if (propiedad1.getMetrosCuadrados() > propiedad2.getMetrosCuadrados()){
            return 1;
        }else if (propiedad1.getMetrosCuadrados() < propiedad2.getMetrosCuadrados()){
            return -1;
        }else {
            return 0;
        }
    }
}
