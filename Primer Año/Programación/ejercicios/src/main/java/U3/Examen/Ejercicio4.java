package U3.Examen;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una posicion: ");
        int posicion = teclado.nextInt();

        System.out.println("Introduce el tamaño: ");
        int tamano = teclado.nextInt();

        String[][] matriz = new String[tamano][tamano];
        String[] fila = new String[tamano];

        rellenarMostrarMatriz(matriz);
        System.out.println();
        rellenarMostrarFila(fila);

        String[][] arrayFinal = insertarFilaEnMatriz(matriz, fila, posicion);
        System.out.println("\nResultado: ");
        for (int i = 0; i < arrayFinal.length; i++) {
            for (int j = 0; j < arrayFinal[i].length; i++) {
                System.out.print(arrayFinal[i][j] + " ");
            }
        }
    }

    public static void rellenarMostrarMatriz(String[][] matriz) {
        String[] letras = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] = letras[j] + " ");
            }
            System.out.println();
        }
    }

    public static void rellenarMostrarFila(String[] fila) {
        String[] letras = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        for (int i = 0; i < fila.length; i++) {
            System.out.print(fila[i] = letras[i] + " ");
        }
    }

    public static String[][] insertarFilaEnMatriz(String[][] matriz, String[] fila, int pos) {
        int filas = matriz.length;
        int columnas = matriz.length + 1;
        int contador = 0;

        String[][] arrayFinal = new String[filas][columnas];
        for (int i = 0; i < arrayFinal.length; i++) {
            for (int j = 0; j < arrayFinal[i].length; j++) {
                arrayFinal[i][j] = matriz[i][j];
            }
        }

        return arrayFinal;
    }
}
