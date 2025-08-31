package U3.EjerciciosRepaso.Examen2021_Tarde_GrupoA;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] numeros = new int[5][6];

        System.out.println("Introduce 20 números enteros:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Número en la posición [" + (i + 1) + "][" + (j + 1) + "]: ");
                numeros[i][j] = scanner.nextInt();
            }
        }

        calcularSumas(numeros);
        mostrarArray(numeros);
    }

    private static void calcularSumas(int[][] array) {
        int filas = array.length;
        int columnas = array[0].length;

        for (int i = 0; i < filas; i++) {
            int sumaFila = 0;
            for (int j = 0; j < columnas - 1; j++) {
                sumaFila += array[i][j];
            }
            array[i][columnas - 1] = sumaFila;
        }

        for (int j = 0; j < columnas - 1; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < filas - 1; i++) {
                sumaColumna += array[i][j];
            }
            array[filas - 1][j] = sumaColumna;
        }

        int sumaTotal = 0;
        for (int i = 0; i < filas - 1; i++) {
            for (int j = 0; j < columnas - 1; j++) {
                sumaTotal += array[i][j];
            }
        }
        array[filas - 1][columnas - 1] = sumaTotal;
    }

    private static void mostrarArray(int[][] array) {
        int filas = array.length;
        int columnas = array[0].length;

        System.out.println("\nArray:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
