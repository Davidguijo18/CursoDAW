package U3.Recuperacion_1t;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[][] ajedrez = new String[8][8];
        formarMostrarArray(ajedrez);

        System.out.print("\nIntroduce la posicion del rey: ");
        String posRey = teclado.nextLine();

        System.out.print("Introduce la posicion de la reina: ");
        String posReina = teclado.nextLine();

        if (jaque(posRey, posReina)) {
            System.out.println("\nEl rey esta en jaque por la reina");
        } else {
            System.out.println("\nEl rey no esta en jaque por la reina");
        }
    }

    public static void formarMostrarArray(String[][] tablero) {
        String[] letras = {"a", "b", "c", "d", "e", "f", "g", "h"};
        int[] posiciones = {8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println("Tablero de ajedrez: ");
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j <= tablero.length - 1; j++) {
                tablero[i][j] = letras[j] + "" + posiciones[i];
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean jaque(String posRey, String posReina) {
        String[] movimientosReina = new String[43];
        int contador = 0;

        int filasTablero = Character.getNumericValue(posReina.charAt(1));
        char columnasTablero = posReina.charAt(0);


        for (int i = 1; columnasTablero - i >= 'a' && filasTablero + i <= 8; i++) {
            movimientosReina[contador++] = "" + (char) (columnasTablero - i) + (filasTablero + i);
        }

        for (int i = 1; columnasTablero + i <= 'h' && filasTablero + i <= 8; i++) {
            movimientosReina[contador++] = "" + (char) (columnasTablero + i) + (filasTablero + i);
        }

        for (int i = 1; columnasTablero - i >= 'a' && filasTablero - i >= 1; i++) {
            movimientosReina[contador++] = "" + (char) (columnasTablero - i) + (filasTablero - i);
        }

        for (int i = 1; columnasTablero + i <= 'h' && filasTablero - i >= 1; i++) {
            movimientosReina[contador++] = "" + (char) (columnasTablero + i) + (filasTablero - i);
        }

        String[] arrayFinal = new String[contador];
        System.arraycopy(movimientosReina, 0, arrayFinal, 0, contador);

        for (int i = 0; i < arrayFinal.length; i++) {
            if (arrayFinal[i].equalsIgnoreCase(posRey) || posReina.charAt(0) == posRey.charAt(0) || posReina.charAt(1) == posRey.charAt(1)) {
                return true;
            }
        }

        return false;
    }
}
