package U1.tarea5b;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.println("Introduce un numero");
        numero = teclado.nextInt();

        if (numero % 2 == 0) {
            if (numero % 5 == 0) {
                System.out.println("El numero es par y es divisible entre 5");
            } else {
                System.out.println("El numero es par pero no es divisible entre 5");
            }

        } else {

            if (numero % 5 == 0) {
                System.out.println("El numero no es par pero es divisible entre 5");
            } else {
                System.out.println("El numero no es par y tampoco es divisible entre 5");
            }
        }
    }
}
