package U1.RepasoExamen;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;
        int binario;

        System.out.println("Introduce un numero");
        numero = teclado.nextInt();

        while (numero > 0) {
            binario = numero % 10;
            numero /= 10;

            for (int i = 1; i <= binario; i++) {
                System.out.print("*");
            }

            System.out.print("-");
        }
    }
}
