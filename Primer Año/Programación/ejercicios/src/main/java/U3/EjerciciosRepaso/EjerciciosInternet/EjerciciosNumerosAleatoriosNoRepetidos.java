package U3.EjerciciosRepaso.EjerciciosInternet;

import java.util.Arrays;
import java.util.Scanner;

public class EjerciciosNumerosAleatoriosNoRepetidos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la longitud del array de origen: ");
        int longitud = teclado.nextInt();

        int[] array = new int[longitud];
        rellenarArray(array);
        int[] arraySinRepetidos = rellenarArraySinRepetidos(array);

        System.out.println("\nArray normal: " + Arrays.toString(array));
        System.out.println("Array sin repetidos: " + Arrays.toString(arraySinRepetidos));
    }

    public static void rellenarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20) + 10;
        }
    }

    public static int[] rellenarArraySinRepetidos(int[] array) {
        int[] arraySinRepetidos = new int[0];
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            if (noEstaRepetido(arraySinRepetidos, array[i])) {
                arraySinRepetidos = Arrays.copyOf(arraySinRepetidos, arraySinRepetidos.length + 1);
                arraySinRepetidos[contador] = array[i];
                contador++;
            }
        }
        return arraySinRepetidos;
    }

    public static boolean noEstaRepetido(int[] array, int numero) {
        for (int i = 0; i < array.length; i++) {
            if (numero == array[i]) {
                return false;
            }
        }
        return true;
    }
}
