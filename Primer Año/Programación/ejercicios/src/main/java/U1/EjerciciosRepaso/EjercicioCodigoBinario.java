package U1.EjerciciosRepaso;

import java.util.Scanner;

public class EjercicioCodigoBinario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int darVuelta = 0;
        int numBien = 0;

        System.out.println("Introduce un numero para traducirlo a binario");
        int numero = teclado.nextInt();

        while (numero > 0) {
            darVuelta = numero % 10 + darVuelta * 10;
            numero /= 10;
        }

        while (darVuelta > 0) {
            numBien = darVuelta % 10;

            for (int i = 1; i <= numBien; i++) {
                System.out.print("*");
            }
            System.out.print("-");
            darVuelta /= 10;
        }
    }
}
