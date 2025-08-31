package U7.tarea1.Ejercicio8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<String> lista = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce un nombre: ");
            String palabra = teclado.nextLine();
            lista.add(palabra);
        }

        List arraySinRepetidos =  eliminaRepetidos(lista);
        System.out.println(arraySinRepetidos);

    }

    public static List eliminaRepetidos(List c) {
        List<String> arraySinRepetidos = new ArrayList<>();

        for (Object o : c) {
            if (!arraySinRepetidos.contains(o)) {
                arraySinRepetidos.add((String) o);
            }
        }
        return arraySinRepetidos;
    }
}
