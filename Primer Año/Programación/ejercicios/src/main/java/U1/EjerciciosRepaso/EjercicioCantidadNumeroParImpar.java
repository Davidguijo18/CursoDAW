package U1.EjerciciosRepaso;

import java.util.Scanner;

public class EjercicioCantidadNumeroParImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int numero = teclado.nextInt();

        int numeroInicial = numero;
        int numReves = 0;
        int numBien;
        int numPares = 0;
        int numImpares = 0;

        while (numero > 0) {
            numReves = numero % 10 + numReves * 10;
            numero /= 10;
        }

        while (numReves > 0) {
            numBien = numReves % 10;

            if (numBien % 2 == 0) {
                numPares++;
            } else {
                numImpares++;
            }

            numReves /= 10;
        }

        System.out.println("El numero " + numeroInicial + " tiene un total de " + numPares + " digitos pares y " + numImpares + " digitos impares");
    }
}
