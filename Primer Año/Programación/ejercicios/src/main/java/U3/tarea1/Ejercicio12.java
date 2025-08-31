package U3.tarea1;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero para calcular su factorial: ");
        int numero = teclado.nextInt();

        long factorial = calcularFactorial(numero);
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }

    public static long calcularFactorial(int numero) {
        if (numero == 0) {
            return 1;
        }
        return numero * calcularFactorial(numero - 1);
    }
}
