package U1.Examen;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numeroReves = 0;
        int numero;

        do {

            System.out.print("Introduce un numero: ");
            numero = teclado.nextInt();

        } while (numero <= 99999);

        while (numero > 0) {
            numeroReves = numero % 1000 + numeroReves * 1000;
            numero /= 1000;
        }

        while (numeroReves > 0) {
            int numBien = numeroReves % 1000;

            for (int i = 2; i < numBien; i++) {

                if (numBien % i == 0) {
                    System.out.println(numBien + " no es un numero primo");
                    break;
                } else {
                    System.out.println(numBien + " es un numero primo");
                    break;
                }
            }

            numeroReves /= 1000;
        }
    }
}
