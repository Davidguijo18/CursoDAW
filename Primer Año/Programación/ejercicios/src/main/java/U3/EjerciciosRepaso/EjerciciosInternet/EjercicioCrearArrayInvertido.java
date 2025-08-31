package U3.EjerciciosRepaso.EjerciciosInternet;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioCrearArrayInvertido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la longitud del array: ");
        int longitud = teclado.nextInt();

        int[] array = new int[longitud];
        rellenarArray(array);
        System.out.println("El array normal es: " + Arrays.toString(array));

        int[] arrayInvertido = arrayDadoVuelta(array);
        System.out.println("El array invertido es: " + Arrays.toString(arrayInvertido));

    }

    public static void rellenarArray(int[] array) {
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            int numero = i + 1;
            System.out.print("Introduce el numero " + numero + " : ");
            array[i] = teclado.nextInt();
        }
    }

    public static int[] arrayDadoVuelta(int[] array) {
        int[] arrayInvertido = new int[array.length];
        int contador = 0;

        for (int i = array.length - 1; i >= 0; i--) {
            arrayInvertido[contador] = array[i];
            contador++;
        }

        return arrayInvertido;
    }
}
