package U3.tarea1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la altura");
        int altura = teclado.nextInt();

        System.out.println("Introduce el area de la base");
        int base = teclado.nextInt();

        System.out.println("Introduzca un numero (1 para el area o 2 para el calculo del volumen)");
        int numero = teclado.nextInt();

        if (numero == 1) {
            System.out.print("El area del cuadrado es: ");
            calculoArea(altura, base);
        } else if (numero == 2) {
            System.out.print("El volumen del cuadrado es: ");
            calculoVolumen(altura, base);
        } else {
            System.out.println("Esta opcion no es correcta");
        }
    }

    public static void calculoArea(int altura, int base) {
        double resultado = 2 * 3.14 * base * (base + altura);

        System.out.println(resultado);
    }

    public static void calculoVolumen(int altura, int base) {
        double resultado = 3.14 * base * base * altura;

        System.out.println(resultado);
    }
}
