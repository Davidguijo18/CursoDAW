package EjerciciosRepaso;

import java.util.Scanner;

public class EjercicioDigitosQueAparecen {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numReves = 0;
        int numBien = 0;
        int numerosAparecen = 0;
        int numerosNoAparecen = 0;

        System.out.print("Introduce un numero entero: ");
        int numero = teclado.nextInt();

        while (numero > 0) {
            numReves = numero % 10 + numReves * 10;
            numero /= 10;
        }

        while (numReves > 0) {
            numBien = numReves % 10;
            for (int i = 1; i <= 9; i++) {
                if (numBien == i) {
                    System.out.print("Numeros que aparecen: " + i + ", ");
                }

                if (numBien != i) {
                    System.out.print("Numeros que no aparecen: " + i + ", ");
                }

            }
            numReves /= 10;
        }
    }
}
