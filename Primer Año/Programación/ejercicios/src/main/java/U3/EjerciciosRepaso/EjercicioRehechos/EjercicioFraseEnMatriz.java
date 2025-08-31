package U3.EjerciciosRepaso.EjercicioRehechos;

import java.util.Scanner;

public class EjercicioFraseEnMatriz {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = teclado.nextLine();

        System.out.println();

        char[][] matriz = matrizFrase(frase);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static char[][] matrizFrase(String frase) {
        frase = frase.trim();
        int filas = frase.length() / 5;
        int contador = 0;
        char[][] array = new char[filas][5];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < 5; j++) {
                if (contador < frase.length()) {
                    array[i][j] = frase.charAt(contador);
                    contador++;
                } else {
                    array[i][j] = ' ';
                }
            }
        }
        return array;
    }
}
