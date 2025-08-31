package U3.EjerciciosRepaso.Entregable20_21_Tarde;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la dimension del array: ");
        int dimension = teclado.nextInt();

        int[][] array = new int[dimension][dimension];

        //Lleno el array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 101) + 100;
            }
        }

        //Muestro el array original
        System.out.println("Array original:");
        mostrarArray(array);

        int[][] arrayRotado = rotarArray90Grados(array);

        // Mostrar el array rotado
        System.out.println("\nArray rotado 90 grados:");
        mostrarArray(arrayRotado);
    }

    //Metodo para mostrar los 2 arrays
    private static void mostrarArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Metodo para rotar el array
    private static int[][] rotarArray90Grados(int[][] array) {
        int filas = array.length;
        int columnas = array[0].length;
        int[][] arrayRotado = new int[columnas][filas];

        for (int i = 0; i < arrayRotado.length; i++) {
            for (int j = 0; j < arrayRotado[i].length; j++) {
                arrayRotado[j][filas - 1 - i] = array[i][j];
            }
        }

        return arrayRotado;
    }
}
