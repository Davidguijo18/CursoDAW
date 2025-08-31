package U3.EjerciciosRepaso.Entregable20_21_Tarde;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[][] array = new String[4][4];

        System.out.println("Bienvenido al juego del buscaminas");
        System.out.println("Este es el esquema del juego: ");

        definirMinas(array);
        mostrarMinas(array);

        System.out.print("Introduce una posición x (1-4): ");
        int posicion1 = teclado.nextInt();
        posicion1 = posicion1 - 1;

        System.out.print("\nIntroduce una posición y (1-4): ");
        int posicion2 = teclado.nextInt();
        posicion2 = posicion2 - 1;

        comprobarMinas(array, posicion1, posicion2);
    }

    public static void definirMinas(String[][] array) {
        int esMina;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                esMina = (int) (Math.random() * 2);

                if (esMina == 1) {
                    array[i][j] = "X";
                } else if (esMina == 0) {
                    array[i][j] = "-";
                }
            }
        }
    }

    public static void mostrarMinas(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void comprobarMinas(String[][] array, int posicion1, int posicion2) {
        int contadorMinas = 0;
        int posCorrecta1 = posicion1 + 1, posCorrecta2 = posicion2 + 1;

        for (int i = posicion1 - 1; i <= posicion1 + 1; i++) {
            for (int j = posicion2 - 1; j <= posicion2 + 1; j++) {
                // Verificar si la posición está dentro de los límites del array
                if (i >= 0 && i < array.length && j >= 0 && j < array[i].length) {
                    // Verificar si hay una mina en la posición actual
                    if (array[i][j].equalsIgnoreCase("X")) {
                        contadorMinas++;
                    }
                }
            }
        }

        if (array[posicion1][posicion2].equalsIgnoreCase("X")) {
            System.out.println("La posición " + posCorrecta1 + "," + posCorrecta2 + " tiene una bomba. Has perdido");
        } else if (array[posicion1][posicion2].equalsIgnoreCase("-")) {
            System.out.println("La posición " + posCorrecta1 + "," + posCorrecta2 + " tiene " + contadorMinas + " bombas en los alrededores");
        }
    }
}