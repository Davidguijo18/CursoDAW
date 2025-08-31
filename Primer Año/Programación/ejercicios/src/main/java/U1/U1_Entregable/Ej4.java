package U1.U1_Entregable;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numDosCifras = 0;
        int numVuelta = 0;
        int numero = 0;

        System.out.println("Introduce un numero");
        numero = teclado.nextInt();

        while (numero > 0) {
            numVuelta = (numVuelta * 100) + (numero % 100);
            numero /= 100;
        }

        while (numVuelta > 0) {
            numDosCifras = (numDosCifras * 100) + (numVuelta % 100);
            numVuelta /= 100;

            System.out.println();

            for (int i = 2; i <= numDosCifras; i += 2) {
                if (numDosCifras % i == 0) {
                    System.out.println(numDosCifras + " no es un numero primo");
                    break;
                } else {
                    System.out.println(numDosCifras + " es un numero primo");
                    break;
                }
            }

            numDosCifras = 0;
        }
    }
}
