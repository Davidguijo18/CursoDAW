package U7.tarea1.Ejercicio5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio5 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        rellenarArray(lista);
        System.out.println(lista);
    }

    public static void rellenarArray(ArrayList<Integer> lista) {
        for (int i = 0; i < 20; i++) {
            int numero = (int) (Math.random() * 100);

            if (!lista.contains(numero)) {
                lista.add(numero);
                Collections.sort(lista);
                Collections.reverse(lista);
            }
        }
    }
}
