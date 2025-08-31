package U3.EjerciciosRepaso.EjercicioRehechos;

import java.util.Scanner;

public class EjercicioBuscaminas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la dimension del tablero del buscaminas: ");
        int dimension = teclado.nextInt();

        String[][] tablero = new String[dimension][dimension];
        construirTablero(tablero);

        System.out.print("Introduce la coordenada x (1-" + dimension + "): ");
        int coordenadaX = teclado.nextInt();
        coordenadaX = coordenadaX - 1;

        System.out.print("Introduce la coordenada y (1-" + dimension + "): ");
        int coordenadaY = teclado.nextInt();
        coordenadaY = coordenadaY - 1;

        comprobarMinas(tablero, coordenadaX, coordenadaY);

    }

    public static void construirTablero(String[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                int numero = (int) (Math.random() * 2);

                if (numero == 0) {
                    tablero[i][j] = "X";
                } else {
                    tablero[i][j] = "-";
                }

                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void comprobarMinas(String[][] tablero, int coordenadaX, int coordenadaY) {
        int x = coordenadaX + 1;
        int y = coordenadaY + 1;
        int contadorMinas = 0;

        for (int i = coordenadaX - 1; i <= coordenadaX + 1; i++) {
            for (int j = coordenadaY - 1; j < coordenadaY + 1; j++) {
                if (i >= 0 && j >= 0 && i < tablero.length && j < tablero.length) {
                    contadorMinas++;
                }
            }
        }
        if (tablero[coordenadaX][coordenadaY].equalsIgnoreCase("X")) {
            System.out.println("En la posicion " + x + "," + y + " hay una mina, has  muerto");
        } else if (tablero[coordenadaX][coordenadaY].equalsIgnoreCase("-")) {
            System.out.println("En la posicion " + x + "," + y + " hay " + contadorMinas + " minas alrededor");
        }

    }
}
