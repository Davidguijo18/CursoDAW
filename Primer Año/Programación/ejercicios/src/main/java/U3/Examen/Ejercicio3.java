package U3.Examen;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce las filas del array: ");
        int fila = teclado.nextInt();

        System.out.print("Introduce las columnas del array: ");
        int columna = teclado.nextInt();

        int[][] array = new int[fila][columna];
        rellenarMostrarArray(array);

        int[] pares = arrayPares(array);
        System.out.println("\nPares: ");
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i] + " ");
        }

        int[] impares = arrayImpares(array);
        System.out.println("\nImpares: ");
        for (int i = 0; i < impares.length; i++) {
            System.out.print(impares[i] + " ");
        }

        variosCalculos(pares, impares);
    }

    public static void rellenarMostrarArray(int[][] array) {
        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 65) + 14;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] arrayPares(int[][] array) {
        int[] pares = new int[0];
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    pares = Arrays.copyOf(pares, pares.length + 1);
                    pares[contador] = array[i][j];
                    contador++;
                }
            }
        }
        return pares;
    }

    public static int[] arrayImpares(int[][] array) {
        int[] impares = new int[0];
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 == 1 && j % 2 == 1) {
                    impares = Arrays.copyOf(impares, impares.length + 1);
                    impares[contador] = array[i][j];
                    contador++;
                }
            }
        }
        return impares;
    }

    public static void variosCalculos(int[] pares, int[] impares) {
        int sumaPares = 0;
        int sumaImpares = 0;

        for (int i = 0; i < pares.length; i++) {
            sumaPares = sumaPares + pares[i];
        }

        for (int i = 0; i < impares.length; i++) {
            sumaImpares = sumaImpares + impares[i];
        }

        double mediaPares = (double) sumaPares / pares.length;
        double mediaImpares = (double) sumaImpares / impares.length;

        int minimoPares = pares[0];
        for (int i = 0; i < pares.length; i++) {
            if (minimoPares >= pares[i]) {
                minimoPares = pares[i];
            }
        }

        int maximoPares = pares[0];
        for (int i = 0; i < pares.length; i++) {
            if (maximoPares <= pares[i]) {
                maximoPares = pares[i];
            }
        }

        int minimoImpares = impares[0];
        for (int i = 0; i < impares.length; i++) {
            if (minimoImpares >= impares[i]) {
                minimoImpares = impares[i];
            }
        }

        int maximoImpares = impares[0];
        for (int i = 0; i < impares.length; i++) {
            if (maximoImpares <= impares[i]) {
                maximoImpares = impares[i];
            }
        }

        System.out.println("\n\nSuma de pares: " + sumaPares);
        System.out.println("Suma de impares: " + sumaImpares);
        System.out.println("Media de pares: " + mediaPares);
        System.out.println("Media de impares: " + mediaImpares);
        System.out.println("Maximo de pares: " + maximoPares);
        System.out.println("Minimo de pares: " + minimoPares);
        System.out.println("Maximo de impares: " + maximoImpares);
        System.out.println("Minimo de impares: " + minimoImpares);
    }
}
