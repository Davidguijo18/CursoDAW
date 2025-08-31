package U1.EjerciciosRepaso;

import java.util.Scanner;

public class EjercicioPosicionInicialFinal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numReves = 0;
        int numBien = 0;
        int contador = 0;

        System.out.print("Introduce un numero: ");
        int numero = teclado.nextInt();

        System.out.print("Introduce la posicion inicial: ");
        int posInicial = teclado.nextInt();

        System.out.print("Introduce la posicion final: ");
        int posFinal = teclado.nextInt();

        while (numero > 0) {
            numReves = numero % 10 + numReves * 10;
            numero /= 10;
        }

        while (numReves > 0) {
            if (contador < posInicial || contador > posFinal) {
                numBien = numReves % 10 + numBien * 10;
            }
            contador++;
            numReves /= 10;
        }

        System.out.println("El numero final es " + numBien);
    }
}
