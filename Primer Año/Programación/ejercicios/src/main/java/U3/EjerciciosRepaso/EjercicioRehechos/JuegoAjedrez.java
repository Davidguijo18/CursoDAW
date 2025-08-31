package U3.EjerciciosRepaso.EjercicioRehechos;

import java.util.Scanner;

public class JuegoAjedrez {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la posicion: ");
        // String posicion = teclado.nextLine();

        String[][] ajedrez = new String[8][8];
        rellenarTablero(ajedrez);
        mostrarTablero(ajedrez);
    }

    public static void rellenarTablero(String[][] tablero) {
        String[] letras = {"a", "b", "c", "d", "e", "f", "g", "h"};

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[j][i] = letras[i] + "" + j;
            }
        }
    }

    public static void mostrarTablero(String[][] tablero) {
        for (int i = tablero.length - 1; i >= 0; i--) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static String[] posicionesDisponibles(String[][] tablero, String posicion) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j].equalsIgnoreCase(posicion)) {

                }
            }
        }
        return null;
    }
}
