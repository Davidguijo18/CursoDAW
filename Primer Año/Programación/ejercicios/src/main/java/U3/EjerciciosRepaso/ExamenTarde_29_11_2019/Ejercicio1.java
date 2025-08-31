package U3.EjerciciosRepaso.ExamenTarde_29_11_2019;

import java.util.Arrays;

public class Ejercicio1 {
    public static void main(String[] args) {

        int[][] array = new int[9][9];
        rellenarArray(array);
        mostrarArray(array);

        int[] arrayDiagonal = mostrarDiagonal(array);

        System.out.println("\nLos numeros que van desde la esquina inferior izquierda a la esquina superior derecha son: ");
        for (int i = arrayDiagonal.length - 1; i >= 0; i--) {
            System.out.print(arrayDiagonal[i] + " ");
        }

        int mayor = numeroMayor(arrayDiagonal);
        System.out.println("\nEl numero mayor de la diagonal es: " + mayor);

        int menor = numeroMenor(arrayDiagonal);
        System.out.println("El numero menor de la diagonal es: " + menor);

        double media = mediaDiagonal(arrayDiagonal);
        System.out.println("La media de la diagonal es: " + media);
    }

    public static void rellenarArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 400) + 501;
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

    public static int[] mostrarDiagonal(int[][] array) {
        int[] arrayDiagonales = new int[0];
        int altura = array.length;
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i + j == altura - 1) {
                    arrayDiagonales = Arrays.copyOf(arrayDiagonales, arrayDiagonales.length + 1);
                    arrayDiagonales[contador] = array[i][j];
                    contador++;
                }
            }
        }
        return arrayDiagonales;
    }

    public static int numeroMayor(int[] array) {
        int numMayor = array[0];
        for (int i = 0; i < array.length; i++) {
            if (numMayor <= array[i]) {
                numMayor = array[i];
            }
        }
        return numMayor;
    }

    public static int numeroMenor(int[] array) {
        int numMenor = array[0];
        for (int i = 0; i < array.length; i++) {
            if (numMenor >= array[i]) {
                numMenor = array[i];
            }
        }
        return numMenor;
    }

    public static double mediaDiagonal(int[] array) {
        double media = 0;
        for (int i = 0; i < array.length; i++) {
            media = media + array[i];
        }

        media = media / array.length;
        return media;
    }
}
