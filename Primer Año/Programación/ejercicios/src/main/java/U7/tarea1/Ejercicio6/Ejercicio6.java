package U7.tarea1.Ejercicio6;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio6 {
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
                }
            }
        } while (!nombre.equalsIgnoreCase("fin"));

        System.out.print("Lista: ");
        System.out.print(listaNombres);
    }
}
