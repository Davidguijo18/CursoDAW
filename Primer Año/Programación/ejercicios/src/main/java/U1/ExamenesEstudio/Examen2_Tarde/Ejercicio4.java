package U1.ExamenesEstudio.Examen2_Tarde;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Por favor, introduce un numero positivo: ");
        int numero = teclado.nextInt();

        for (int i = numero; i <= numero + 4; i++) {
            boolean esPrimo = true;

            if (i <= 1) {
                esPrimo = false;
            } else {
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        esPrimo = false;
                        break;
                    }
                }
            }

            if (esPrimo) {
                System.out.println(i + " es primo");
            } else {
                System.out.println(i + " no es primo");
            }
        }
    }
}
