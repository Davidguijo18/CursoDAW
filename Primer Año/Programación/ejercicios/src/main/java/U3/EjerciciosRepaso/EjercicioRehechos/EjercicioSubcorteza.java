package U3.EjerciciosRepaso.EjercicioRehechos;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioSubcorteza {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el tamaño del array: ");
        int dimension = teclado.nextInt();

        int[][] array = new int[dimension][dimension];
        rellenarArray(array);
        mostrarArray(array);

        System.out.println();
        int[] subcorteza = subcorteza(array);
        for (int i = 0; i < subcorteza.length; i++) {
            System.out.print(subcorteza[i] + " ");
        }
    }


    public static void rellenarArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 900) + 100;
            }
        }
    }

    public static void mostrarArray(int[][] array) {
        System.out.println("\nArray normal: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] subcorteza(int[][] array) {
        int[] arraySubcorteza = new int[0];
        int contador = 0;
        int finalFilasColumnas = array.length - 1;

        for (int i = 2; i < array.length - 1; i++) {
            arraySubcorteza = Arrays.copyOf(arraySubcorteza, arraySubcorteza.length + 1);
            arraySubcorteza[contador] = array[1][i - 1];
            contador++;
        }

        for (int i = 2; i < array.length; i++) {
            arraySubcorteza = Arrays.copyOf(arraySubcorteza, arraySubcorteza.length + 1);
            arraySubcorteza[contador] = array[i - 1][finalFilasColumnas - 1];
            contador++;
        }

        for (int i = array.length - 1; i > 2; i--) {
            arraySubcorteza = Arrays.copyOf(arraySubcorteza, arraySubcorteza.length + 1);
            arraySubcorteza[contador] = array[finalFilasColumnas - 1][i - 2];
            contador++;
        }

        for (int i = array.length - 1; i > 3; i--) {
            arraySubcorteza = Arrays.copyOf(arraySubcorteza, arraySubcorteza.length + 1);
            arraySubcorteza[contador] = array[i - 2][1];
            contador++;
        }

        return arraySubcorteza;
    }
}
