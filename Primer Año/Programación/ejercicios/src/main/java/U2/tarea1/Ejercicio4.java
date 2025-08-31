package U2.tarea1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;

        System.out.println("Introduce el numero");
        num = teclado.nextInt();

        if (esPrimo(num)) {
            System.out.println("El numero " + num + " es primo");
        } else {
            System.out.println("El numero " + num + " no es primo");
        }
    }

    public static boolean esPrimo(int num) {

        boolean esPrimo = true;

        //El signo ">" deberia de ser "<" para que el bucle se ejecute de forma correcta
        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                esPrimo = false;
                break;
            }
        }
        return esPrimo;
    }
}
