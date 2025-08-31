package U3.tarea1;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero para saber si es primo o no");
        int numero = teclado.nextInt();

        if (esPrimo(numero)) {
            System.out.println("El numero " + numero + " es primo");
        } else {
            System.out.println("El numero " + numero + " no es primo");
        }
    }


    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        if (numero <= 3) {
            return true;
        }

        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}

