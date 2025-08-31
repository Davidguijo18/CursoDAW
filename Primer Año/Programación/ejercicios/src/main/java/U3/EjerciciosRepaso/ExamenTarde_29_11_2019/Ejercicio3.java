package U3.EjerciciosRepaso.ExamenTarde_29_11_2019;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero para traducirlo a binario: ");
        int numero = teclado.nextInt();

        String mensaje = convierteEnMorse(numero);
        System.out.println(mensaje);
    }

    public static String convierteEnMorse(int n) {
        String[] morse = {". _ _ _ _", ". . _ _ _", ". . . _ _", ". . . . _", ". . . . .", "_ . . . .", "_ _ . . .", "_ _ _ . .", "_ _ _ _ .", "_ _ _ _ _"};

        int numBien, numReves = 0;
        String binario = "";

        while (n > 0) {
            numReves = n % 10 + numReves * 10;
            n /= 10;
        }

        while (numReves > 0) {
            numBien = numReves % 10;

            if (numBien == 0) {
                binario = binario.concat("_ _ _ _ _ ");
            } else if (numBien == 1) {
                binario = binario.concat(". _ _ _ _ ");
            } else if (numBien == 2) {
                binario = binario.concat(". . _ _ _ ");
            } else if (numBien == 3) {
                binario = binario.concat(". . . _ _ ");
            } else if (numBien == 4) {
                binario = binario.concat(". . . . _ ");
            } else if (numBien == 5) {
                binario = binario.concat(". . . . . ");
            } else if (numBien == 6) {
                binario = binario.concat("_ . . . . ");
            } else if (numBien == 7) {
                binario = binario.concat("_ _ . . . ");
            } else if (numBien == 8) {
                binario = binario.concat("_ _ _ . . ");
            } else if (numBien == 9) {
                binario = binario.concat("_ _ _ _ . ");
            }
            numReves /= 10;
        }

        return "El numero introducido en codigo morse es: " + binario + " ";
    }
}
