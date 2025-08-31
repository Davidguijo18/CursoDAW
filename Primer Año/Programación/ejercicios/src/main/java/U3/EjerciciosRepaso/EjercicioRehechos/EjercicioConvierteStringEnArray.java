package U3.EjerciciosRepaso.EjercicioRehechos;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioConvierteStringEnArray {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = teclado.nextLine();

        char[] fraseArray = pasarStringArray(frase);
        System.out.println(Arrays.toString(fraseArray));
    }

    public static char[] pasarStringArray(String frase) {
        if (frase.isEmpty()) {
            return new char[0];
        }

        char[] fraseArray = new char[frase.length()];
        for (int i = 0; i < fraseArray.length; i++) {
            fraseArray[i] = frase.charAt(i);
        }
        return fraseArray;
    }
}
