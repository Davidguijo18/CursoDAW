package U1.tarea8a;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero = 0;
        int factorial = 1;

        System.out.println("Introduce un numero para realizarle su factorial");
        numero = teclado.nextInt();

        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}
