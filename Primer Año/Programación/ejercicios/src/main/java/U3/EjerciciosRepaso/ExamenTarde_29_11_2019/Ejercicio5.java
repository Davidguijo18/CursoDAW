package U3.EjerciciosRepaso.ExamenTarde_29_11_2019;

import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce las filas del array: ");
        int filas = teclado.nextInt();

        System.out.print("Introduce las columnas del array: ");
        int columnas = teclado.nextInt();

        int[][] array = new int[filas][columnas];
        formarArray(array);
        mostrarArray(array);
        System.out.println();

        int[] arrayCorteza = corteza(array, filas, columnas);
        for (int i = 0; i < arrayCorteza.length; i++) {
            System.out.print(arrayCorteza[i] + " ");
        }
    }


    public static void formarArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 90) + 10;
            }
        }
    }

    public static void mostrarArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] corteza(int[][] n, int filas, int columnas) {
        int contador = 0;
        int[] arrayCorteza = new int[0];
        for (int j = 0; j < columnas - 1; j++) {
            arrayCorteza = Arrays.copyOf(arrayCorteza, arrayCorteza.length + 1);
            arrayCorteza[contador] = n[0][j];
            contador++;
        }

        for (int i = 0; i < filas - 1; i++) {
            arrayCorteza = Arrays.copyOf(arrayCorteza, arrayCorteza.length + 1);
            arrayCorteza[contador] = n[i][columnas - 1];
            contador++;
        }

        for (int j = columnas - 1; j >= 1; j--) {
            arrayCorteza = Arrays.copyOf(arrayCorteza, arrayCorteza.length + 1);
            arrayCorteza[contador] = n[filas - 1][j];
            contador++;
        }

        for (int i = filas - 1; i >= 1; i--) {
            arrayCorteza = Arrays.copyOf(arrayCorteza, arrayCorteza.length + 1);
            arrayCorteza[contador] = n[i][0];
            contador++;
        }


        return arrayCorteza;
    }
}
