package U1.U1_Entregable;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numVuelta = 0;
        int numOcurrencias = 0;
        int posicion = 1;
        boolean posicionBoolean = false;
        int numBien;

        System.out.println("Introduce un numero");
        int numero = teclado.nextInt();

        System.out.println("Introduce una cifra");
        int cifra = teclado.nextInt();

        System.out.println("\nResultado :\n");
        System.out.print("Posiciones del numero: ");

        while (numero > 0) {
            numVuelta = (numVuelta * 100) + (numero % 100);
            numero /= 100;
        }


        while (numVuelta > 0) {
            numBien = (numVuelta % 10);

            if (numBien == cifra) {
                numOcurrencias++;

                if (numOcurrencias > 0) {
                    System.out.print(posicion + " - ");
                }
            }
            posicion++;
            numero /= 10;
        }


        if (numOcurrencias > 0) {
            System.out.println();
            System.out.println(numOcurrencias + " ocurrencias");
        } else {
            System.out.print("Ninguna");
            System.out.println();
            System.out.println("0 ocurrencias");
        }
    }
}
