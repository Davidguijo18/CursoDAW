package U3.EjerciciosRepaso.EjerciciosInternet;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioPasarFraseAArraay {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = teclado.nextLine();

        char[] array = pasarStringArray(frase);
        System.out.println("La frase en el array es: ");
        System.out.println(Arrays.toString(array));
    }

    public static char[] pasarStringArray(String frase) {
        char[] array = new char[frase.length()];

        for (int i = 0; i < array.length; i++) {
            array[i] = frase.charAt(i);
        }
        return array;
    }
}
