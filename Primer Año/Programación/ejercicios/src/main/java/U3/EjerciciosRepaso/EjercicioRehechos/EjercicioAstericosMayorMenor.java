package U3.EjerciciosRepaso.EjercicioRehechos;

import java.util.Scanner;

public class EjercicioAstericosMayorMenor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[][] array = new int[10][10];
        rellenarArray(array);
        mostrarArray(array);

        System.out.print("\n¿Qué quiere destacar? (1 – mínimo, 2 – máximo): ");
        int respuesta = teclado.nextInt();
        int minimo, maximo;

        if (respuesta == 1) {
            minimo = buscarMenor(array);
            System.out.println("El numero mas pequeño del array es: " + minimo);
        } else if (respuesta == 2) {
            maximo = buscarMayor(array);
            System.out.println("El numero mas grande del array es: " + maximo);
        }

    }

    public static void rellenarArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 501);
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

    public static int buscarMayor(int[][] array) {
        int maximo = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (maximo <= array[i][j]) {
                    maximo = array[i][j];
                }
            }
        }
        return maximo;
    }

    public static int buscarMenor(int[][] array) {
        int minimo = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (minimo >= array[i][j]) {
                    minimo = array[i][j];
                }
            }
        }
        return minimo;
    }
}
