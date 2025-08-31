package U3.tarea3;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int arrayBidimensional[][] = new int[5][5];

        for (int i = 0; i < arrayBidimensional.length; i++) {
            for (int j = 0; j < arrayBidimensional[i].length; j++) {
                arrayBidimensional[i][j] = i + j;
                System.out.print(arrayBidimensional[i][j] + " ");
            }
            System.out.println();
        }
    }
}
