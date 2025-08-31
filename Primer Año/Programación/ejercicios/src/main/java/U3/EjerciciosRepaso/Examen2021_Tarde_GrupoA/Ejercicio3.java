package U3.EjerciciosRepaso.Examen2021_Tarde_GrupoA;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la altura: ");
        int alto = teclado.nextInt();

        System.out.print("Introduce el ancho: ");
        int ancho = teclado.nextInt();

        int[][] array = new int[alto][ancho];
        construirMostrarArray(array);

        int[] corteza = corteza(array);
        System.out.print("\nLa corteza del array es: ");
        for (int i = 0; i < corteza.length; i++) {
            System.out.print(corteza[i] + " ");
        }
    }

    public static void construirMostrarArray(int[][] array) {
        System.out.println("El array bidimensional es: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 90) + 10;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] corteza(int[][] n) {
        int[] subCorteza = new int[0];
        int contador = 0;

        for (int i = 0; i < n.length; i++) {
            subCorteza = Arrays.copyOf(subCorteza, subCorteza.length + 1);
            subCorteza[contador] = n[0][i];
            contador++;
        }

        for (int i = 0; i < n.length; i++) {
            subCorteza = Arrays.copyOf(subCorteza, subCorteza.length + 1);
            subCorteza[contador] = n[i][n.length];
            contador++;
        }

        for (int i = n.length - 1; i > 0 ; i--) {
            subCorteza = Arrays.copyOf(subCorteza, subCorteza.length + 1);
            subCorteza[contador] = n[n.length - 1][i];
            contador++;
        }

        for (int i = n.length - 1; i > 0; i--) {
            subCorteza = Arrays.copyOf(subCorteza, subCorteza.length + 1);
            subCorteza[contador] = n[i][0];
            contador++;
        }


        return subCorteza;
    }
}
