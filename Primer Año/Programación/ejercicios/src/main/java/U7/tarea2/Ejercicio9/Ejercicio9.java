package U7.tarea2.Ejercicio9;

import java.util.Set;
import java.util.TreeSet;

public class Ejercicio9 {
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

        Set<Integer> cojuntoFinal = union(conjunto1, conjunto2);
        System.out.println(cojuntoFinal);
    }

    public static Set<Integer> union(Set<Integer> conjunto1, Set<Integer> conjunto2) {

        conjunto1.addAll(conjunto2);
        return conjunto1;
    }
}
