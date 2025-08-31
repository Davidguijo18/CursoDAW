package U7.tarea1.Ejercicio1;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        rellenarArray(lista);

        System.out.print("Orden original: ");
        System.out.print(lista);

        System.out.print("\nOrden en sentido creciente: ");
        Collections.sort(lista);
        System.out.print(lista);
    }

    public static void rellenarArray(ArrayList<Integer> lista) {
        for (int i = 0; i < 20; i++) {
            int numero = (int) (Math.random() * 100);
            lista.add(numero);
        }
    }
}
