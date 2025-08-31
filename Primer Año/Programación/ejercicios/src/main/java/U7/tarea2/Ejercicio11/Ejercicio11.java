package U7.tarea2.Ejercicio11;

import java.util.Set;
import java.util.TreeSet;

public class Ejercicio11 {
    public static void main(String[] args) {
        Set<Integer> conjunto1 = new TreeSet<>();
        conjunto1.add(1);
        conjunto1.add(4);
        conjunto1.add(5);
        conjunto1.add(2);
        conjunto1.add(9);

        Set<Integer> conjunto2 = new TreeSet<>();
        conjunto2.add(8);
        conjunto2.add(5);
        conjunto2.add(4);
        conjunto2.add(7);
        conjunto2.add(9);

        System.out.println();

        Set cojuntoFinal = diferencia(conjunto1, conjunto2);
        System.out.println(cojuntoFinal);
    }

    public static Set diferencia(Set conjunto1, Set conjunto2) {
        Set<Integer> cojuntoFinal = new TreeSet<>();
        cojuntoFinal.addAll(conjunto1);
        cojuntoFinal.removeAll(conjunto2);

        return cojuntoFinal;
    }
}
