package U7.tarea1.Ejercicio7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> listaNombres = new ArrayList<>();
        String nombre = "";

        do {
            if (nombre.equalsIgnoreCase("fin")) {
                System.out.println("Has finalizado el programa");
            } else {
                System.out.println("Introduce un nombre");
                nombre = teclado.nextLine();

                if (!listaNombres.contains(nombre) && !nombre.equalsIgnoreCase("fin")) {
                    listaNombres.add(nombre);
                    Collections.sort(listaNombres);
                }
            }
        } while (!nombre.equalsIgnoreCase("fin"));

        System.out.print("Lista: ");
        System.out.print(listaNombres);
    }
}
