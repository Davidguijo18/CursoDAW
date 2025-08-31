package U1.Recuperacion;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        long numReves = 0;

        System.out.print("Por favor, introduce un numero entero positivo: ");
        long numero = teclado.nextLong();

        long numeroInicial = numero;

        while (numero > 0) {
            numReves = numero % 10 + numReves * 10;
            numero /= 10;
        }

        if (numeroInicial == numReves) {
            System.out.println("El " + numeroInicial + " es capicua");
        } else {
            System.out.println("El " + numeroInicial + " no es capicua");
        }
    }
}
