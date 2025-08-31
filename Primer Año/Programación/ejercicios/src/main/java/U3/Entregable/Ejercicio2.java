package U3.Entregable;

import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la longitud del array: ");
        int longitud = teclado.nextInt();

        int[] array = new int[longitud];
        rellenarArray(array);
        mostrarArrayOriginal(array);

        System.out.println();

        if (duplicados(array)) {
            System.out.println("\nEl array tiene elementos duplicados.");
        } else {
            System.out.println("\nEl array no tiene elementos duplicados.");
        }

        System.out.print("\nEl array sin numeros repetidos es: ");
        int[] arraySinRepetidos = eliminaDuplicados(array);
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

    public static void mostrarArrayOriginal(int[] array) {
        System.out.print("Array original: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static boolean duplicados(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int[] eliminaDuplicados(int[] array) {
        int[] arraySinRepetidos = new int[0];
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            if (!estaRepetido(arraySinRepetidos, array[i])) {
                arraySinRepetidos = Arrays.copyOf(arraySinRepetidos, arraySinRepetidos.length + 1);
                arraySinRepetidos[contador] = array[i];
                contador++;
            }
        }
        return arraySinRepetidos;
    }

    public static boolean estaRepetido(int[] array, int numero) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                return true;
            }
        }
        return false;
    }
}