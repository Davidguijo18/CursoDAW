package U3.tarea1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el primero numero");
        int num1 = teclado.nextInt();

        System.out.println("Introduce el segundo numero");
        int num2 = teclado.nextInt();

        System.out.println("Introduzco el tercer numero");
        int num3 = teclado.nextInt();

        int mayor = numeroMayor(num1, num2);
        int comParacionFinal = numeroMayor(mayor, num3);

        System.out.println("El numero mas grande es " + comParacionFinal);

    }

    public static int numeroMayor(int num1, int num2) {

        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
}
