package U3.EjerciciosRepaso.EjercicioRehechos;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySinRepetidos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("\nIntroduce la longitud del array: ");
        int longitud = teclado.nextInt();

        int[] array = new int[longitud];
        rellenarArray(array);
        mostrarArray(array);

        int[] arraySinRepetidos = arraySinRepetidos(array);
        System.out.print("\n\nArray sin repetidos: ");
        for (int i = 0; i < arraySinRepetidos.length; i++) {
            System.out.print(arraySinRepetidos[i] + " ");
        }
    }

    public static void rellenarArray(int[] array) {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            int numero = i + 1;
            System.out.print("Introduce el numero " + numero + ": ");
            array[i] = teclado.nextInt();
        }
    }

    public static void mostrarArray(int[] array) {
        System.out.print("Array normal: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] arraySinRepetidos(int[] array) {
        int[] arraySinRepetidos = new int[0];
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            if (noEstaDuplicado(arraySinRepetidos, array[i])) {
                arraySinRepetidos = Arrays.copyOf(arraySinRepetidos, arraySinRepetidos.length + 1);
                arraySinRepetidos[contador] = array[i];
                contador++;
            }
        }
        return arraySinRepetidos;
    }

    public static boolean noEstaDuplicado(int[] array, int numero) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                return false;
            }
        }
        return true;
    }
}
