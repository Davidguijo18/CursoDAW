package U3.Entregable;

import java.util.Scanner;

public class Ejercicio3 {
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el tamaño de la matriz (n x n): ");
        int n = scanner.nextInt();
        int[][] array = new int[6][6];

        constuirMostrarArray(array);
        boolean sonIgualesFilas = sumarFilas(array);
        boolean sonIgualesColumnas = sumarColumnas(array);
        boolean resultado;
        if (sonIgualesColumnas && sonIgualesFilas) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        int[][] matriz = new int[n][n];

        System.out.println("Ingrese los elementos de la matriz:");

        // Obtener la matriz del usuario
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Matriz[" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Verificar si la suma de filas y columnas es igual
        if (verificarSumaFilasColumnasIguales(matriz, n)) {
            System.out.println("La suma de todos los números en cada fila y columna es igual.");
        } else {
            System.out.println("La suma de todos los números en cada fila y columna NO es igual.");
        }

        scanner.close();
    }

    // Método para verificar si la suma de filas y columnas es igual
    private static boolean verificarSumaFilasColumnasIguales(int[][] matriz, int n) {
        // Verificar filas
        for (int i = 0; i < n; i++) {
            int sumaFila = 0;
            for (int j = 0; j < n; j++) {
                sumaFila += matriz[i][j];
            }
            if (sumaFila != matriz[0][0]) {
                return false;
            }
        }

        // Verificar columnas
        for (int j = 0; j < n; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < n; i++) {
                sumaColumna += matriz[i][j];
            }
            if (sumaColumna != matriz[0][0]) {
                return false;
            }
        }

        return true;
    }*/
}
