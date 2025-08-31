package U7.tarea2.Ejercicio10;

import java.util.Set;
import java.util.TreeSet;

public class Ejercicio10 {
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

        Set<Integer> cojuntoFinal = interseccion(conjunto1, conjunto2);
        System.out.println(cojuntoFinal);
    }

    public static Set<Integer> interseccion(Set<Integer> conjunto1, Set<Integer> conjunto2) {
        Set<Integer> cojuntoFinal = new TreeSet<>();
        cojuntoFinal.addAll(conjunto1);
        cojuntoFinal.retainAll(conjunto2);

        return cojuntoFinal;
    }
}
