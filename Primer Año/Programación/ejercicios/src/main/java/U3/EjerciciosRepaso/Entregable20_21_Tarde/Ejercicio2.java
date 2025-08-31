package U3.EjerciciosRepaso.Entregable20_21_Tarde;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numReves = 0;
        int numBien;
        String mensajeFinal = " ";

        System.out.print("Introduce un numero para traducirlo a morse: ");
        int numero = teclado.nextInt();
        int numeroIncial = numero;

        while (numero > 0) {
            numReves = numero % 10 + numReves * 10;
            numero /= 10;
        }

        while (numReves > 0) {
            numBien = numReves % 10;
            mensajeFinal = mensajeFinal.concat(convierteEnMorse(numBien));

            numReves /= 10;
        }

        System.out.println("El numero " + numeroIncial + " en codigo morse es: " + mensajeFinal);
    }


    public static String convierteEnMorse(int n) {
        String morse = "";
        if (n == 1) {
            morse = ". _ _ _ _ ";
        } else if (n == 2) {
            morse = ". . _ _ _ ";
        } else if (n == 3) {
            morse = ". . . _ _ ";
        } else if (n == 4) {
            morse = ". . . . _ ";
        } else if (n == 5) {
            morse = ". . . . . ";
        } else if (n == 6) {
            morse = "_ . . . . ";
        } else if (n == 7) {
            morse = "_ _ . . . ";
        } else if (n == 8) {
            morse = "_ _ _ . . ";
        } else if (n == 9) {
            morse = "_ _ _ _ . ";
        } else if (n == 0) {
            morse = "_ _ _ _ _ ";
        }

        return morse;
    }
}
