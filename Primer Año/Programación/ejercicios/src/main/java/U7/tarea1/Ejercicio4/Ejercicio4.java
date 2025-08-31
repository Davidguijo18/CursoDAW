package U7.tarea1.Ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ArrayList<String> listaPalabras = new ArrayList<>();
        ArrayList<String> palabrasRepetidas = new ArrayList<>();
        ArrayList<String> palabrasNoRepetidas = new ArrayList<>();

        System.out.println("Introduce una frase: ");
        String frase = teclado.nextLine();

        String[] palabras = frase.split(" ");

        for (String palabra : palabras) {
            if (listaPalabras.contains(palabra)) {
                if (!palabrasRepetidas.contains(palabra)) {
                    palabrasRepetidas.add(palabra);
                }
            } else {
                listaPalabras.add(palabra);
                palabrasNoRepetidas.add(palabra);
            }
        }

        System.out.println("Palabras repetidas: " + palabrasRepetidas);
        System.out.println("Palabras no repetidas: " + palabrasNoRepetidas);

    }
}
