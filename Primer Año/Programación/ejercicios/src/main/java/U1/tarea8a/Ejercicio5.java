package U1.tarea8a;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int valorMinimo = 0;
        int valorMaximo = 0;
        int valor = 0;

        System.out.println("Introduce el valor maximo del rango");
        valorMaximo = teclado.nextInt();

        System.out.println("Introduce el valor minimo del rango");
        valorMinimo = teclado.nextInt();

        do {
            System.out.println("Introduce un valor");
            valor = teclado.nextInt();

            if (valor < valorMinimo || valor > valorMaximo) {
                System.out.println("El numero que has introducido no se encuentra en el rango");
                System.out.println(" ");
            } else {
                System.out.println("El numero introducido se encuentra en ese rango");
            }

        } while (valor < valorMinimo || valor > valorMaximo);
    }
}
