package U3.Entregable;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = teclado.nextLine();

        char[][] array = matrizLetras(frase);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static char[][] matrizLetras(String frase) {
        frase = frase.trim();
        int contador = 0;
        int filas = frase.length() / 5;
        char[][] arrayCaracteres = new char[filas][5];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < 5; j++) {
                if (contador < frase.length()) {
                    arrayCaracteres[i][j] = frase.charAt(contador);
                    contador++;
                } else {
                    arrayCaracteres[i][j] = ' ';
                }
            }
        }
        return arrayCaracteres;
    }
}
