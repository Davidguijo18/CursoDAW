package U2.tarea1;

import java.util.Scanner;

public class Ejercicio3 {
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

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                esPrimo = false;
                //El fallo en el programa es que le falta el break, ya que el bucle se sigue ejecutando sin detenerse
                break;
            } else {
                esPrimo = true;
            }
        }
        return esPrimo;
    }
}
