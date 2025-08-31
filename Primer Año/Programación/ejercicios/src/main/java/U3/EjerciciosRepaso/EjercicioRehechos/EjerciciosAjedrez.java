package U3.EjerciciosRepaso.EjercicioRehechos;

import java.util.Scanner;

public class EjerciciosAjedrez {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la posicion del alfil:  ");
        String posicion = teclado.nextLine();

        String[][] tablero = new String[8][8];
        formarMostrarArray(tablero);
        buscarPosiblesMovimientos(posicion, tablero);

    }

    public static void formarMostrarArray(String[][] tablero) {
        String[] letras = {"a", "b", "c", "d", "e", "f", "g", "h"};
        int[] posiciones = {8, 7, 6, 5, 4, 3, 2, 1};

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j <= tablero.length - 1; j++) {
                tablero[i][j] = letras[j] + "" + posiciones[i];
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void buscarPosiblesMovimientos(String posicion, String[][] array) {
        int coordendaX = 0;
        int coordendaY = 0;
        String posiciones = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (posicion.equalsIgnoreCase(array[i][j])) {
                    coordendaX = i + 1;
                    coordendaY = j + 1;
                }
            }
        }
        
        System.out.println("\nLa posicion de " + posicion + " es: " + coordendaX + "," + coordendaY);
        System.out.println("Las posicones a las que puede moverse son: " + posiciones);
    }
}
