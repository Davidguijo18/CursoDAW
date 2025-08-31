package U3.tarea1;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero para saber si es primo o no");
        int numero = teclado.nextInt();

        if (esPrimo(numero)) {
            System.out.println("El numero " + numero + " es primo");
            int cantidadDivisoresPrimos = contarDivisoresPrimos(numero);
            System.out.println("Tiene " + cantidadDivisoresPrimos + " divisores primos.");
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


    public static int contarDivisoresPrimos(int numero) {
        int contador = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0 && esPrimo(i)) {
                contador++;
            }
        }
        return contador;
    }
}
