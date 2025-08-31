package U3.Recuperacion_1t;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce las filas del array: ");
        int filas = teclado.nextInt();

        System.out.print("Introduce las columnas del array: ");
        int columnas = teclado.nextInt();

        int[][] array = new int[filas][columnas];
        construirArray(array);
        mostrarArray(array);

        System.out.print("\nIntroduce una posicion para mostrar el numero: ");
        int posicion = teclado.nextInt();

        int numero = nEsimo(array, posicion);
        System.out.println("El numero contenido en esa posicion es: " + numero);
    }

    public static void construirArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 91) + 10;
            }
        }
    }

    public static void mostrarArray(int[][] array) {
        System.out.println("\nArray: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static int nEsimo(int[][] n, int posicion) {
        int contador = 0;
        int numero = 0;

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                contador++;

                if (posicion + 1 == contador) {
                    numero = n[i][j];

                    break;
                }
            }
        }
        if (posicion + 1 > contador || posicion < 0) {
            return -1;
        }

        return numero;
    }
}
