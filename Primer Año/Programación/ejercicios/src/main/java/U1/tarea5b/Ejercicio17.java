package U1.tarea5b;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.println("Introduce un numero de como maximo 5 cifras");
        numero = teclado.nextInt();

        if (numero < 10) {
            System.out.println("La primera cifra del numero es " + numero);
        }

        if (numero >= 10 && numero < 100) {
            System.out.println("La primera cifra del numero es " + numero / 10);
        }

        if (numero >= 100 && numero < 1000) {
            System.out.println("La primera cifra del numero es " + numero / 100);
        }

        if (numero >= 1000 && numero < 10000) {
            System.out.println("La primera cifra del numero es " + numero / 1000);
        }

        if (numero >= 10000 && numero < 100000) {
            System.out.println("La primera cifra del numero es " + numero / 10000);
        }

        if (numero >= 100000) {
            System.out.println("El numero que has introducido es mayor de 5 digitos");
        }
    }
}
