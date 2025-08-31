package U5.tarea1.Ejercicio9;

import java.util.Comparator;

public class CompararPrecioFinalLavadora implements Comparator<Lavadora> {
    @Override
    public int compare(Lavadora lavadora1, Lavadora lavadora2) {
        if (lavadora1.getPrecioFinal() > lavadora2.getPrecioFinal()){
            return 1;
        } else if (lavadora1.getPrecioFinal() < lavadora2.getPrecioFinal()) {
            return -1;
        }
        return 0;
    }
}
