package U3.EjerciciosRepaso.Examen2021_Tarde_GrupoB;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce las filas del array: ");
        int filas = teclado.nextInt();

        System.out.print("Introduce las columnas del array: ");
        int columnas = teclado.nextInt();

        int[][] array = new int[filas][columnas];
        rellenarArray(array);

        System.out.println();

        int[] arraySubCorteza = subcorteza(array, filas, columnas);
        System.out.print("La subcorteza del array es: ");
        for (int i = 0; i < arraySubCorteza.length; i++) {
            System.out.print(arraySubCorteza[i] + " ");
        }

    }

    public static int[] subcorteza(int[][] n, int filas, int columnas) {
        int contador = 0;
        int[] arraySubcorteza = new int[0];

        for (int j = 1; j < columnas - 2; j++) {
            arraySubcorteza = Arrays.copyOf(arraySubcorteza, arraySubcorteza.length + 1);
            arraySubcorteza[contador] = n[1][j];
            contador++;
        }

        for (int i = 1; i < filas - 2; i++) {
            arraySubcorteza = Arrays.copyOf(arraySubcorteza, arraySubcorteza.length + 1);
            arraySubcorteza[contador] = n[i][filas - 1];
            contador++;
        }

        for (int j = columnas - 2; j >= 1; j--) {
            arraySubcorteza = Arrays.copyOf(arraySubcorteza, arraySubcorteza.length + 1);
            arraySubcorteza[contador] = n[filas - 2][j];
            contador++;
        }

        for (int i = filas - 3; i > 1; i--) {
            arraySubcorteza = Arrays.copyOf(arraySubcorteza, arraySubcorteza.length + 1);
            arraySubcorteza[contador] = n[i][1];
            contador++;
        }

        return arraySubcorteza;
    }

    public static void rellenarArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 90) + 10;

                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
