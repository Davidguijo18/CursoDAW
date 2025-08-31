package U7.tarea2.Ejercicio15;

import java.util.Comparator;

public class EnterosCrecientes implements Comparator<Integer> {
    @Override
    public int compare(Integer i1, Integer i2) {
        return i1 - i2;
    }
}