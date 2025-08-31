package U7.tarea2.Ejercicio12;

import java.util.Set;
import java.util.TreeSet;

public class Ejercicio12 {
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

        boolean esIncluido = incluido(conjunto1, conjunto2);
        if (esIncluido) {
            System.out.println("Todos los elementos del primer conjunto estan en el segundo");
        } else {
            System.out.println("En el segundo conjunto no estan todos los elementos del primero");
        }

    }

    public static boolean incluido(Set conjunto1, Set conjunto2) {
        if (conjunto2.containsAll(conjunto1)) {
            return true;
        }
        return false;
    }
}
