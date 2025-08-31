package U7.tarea1.Ejercicio3;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        System.out.println("Proceso de creacion y ordenacion de los numeros: ");
        rellenarArray(lista);

        System.out.println("\n------------------------------------------------------------");
        System.out.print("Array en sentido decreciente: ");
        System.out.println(lista);
    }

    public static void rellenarArray(ArrayList<Integer> lista) {
        for (int i = 0; i < 20; i++) {
            int numero = (int) (Math.random() * 10);

            lista.add(numero);
            Collections.sort(lista);
            Collections.reverse(lista);

            System.out.println(lista);
        }
    }
}
