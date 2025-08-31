package U3.EjerciciosRepaso.EjercicioRehechos;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioGirarArray {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la longitud de las palabras: ");
        int longitud = 5;//teclado.nextInt();

        int[][] array = new int[longitud][longitud];
        construirArray(array);
        mostrarArray(array);
        System.out.println();
        girarArray(array);

    }

    public static void construirArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 90) + 10;
            }
        }
    }

    public static void mostrarArray(int[][] array) {
        System.out.println("El array normal es: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void girarArray(int[][] array) {
        System.out.println("El array girado 90 grados es: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j >= 0; j--) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
    }
}
