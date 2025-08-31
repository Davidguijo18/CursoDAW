package U1.tarea8a;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.println("Introduce un numero");
        numero = teclado.nextInt();

        for (int n = 1; n <= numero; n++) {
            System.out.println("Numeros: " + n);
        }
    }
}
