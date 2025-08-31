package U1.tarea8a;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;
        int contadorImpares = 0;
        int producto = 0;
        int contadorNumero;

        do {
            System.out.println("Introduce un numero");
            numero = teclado.nextInt();

            if (numero % 2 == 0) {
                System.out.println("El numero es par, por lo tanto no cuenta para hacer el producto de 10 numeros impares");
                System.out.println(" ");
            } else {
                System.out.println("El numero es impar");
                System.out.println("Le quedan " + (9 - contadorImpares) + " numeros impares para mostrar el resultado del producto");
                System.out.println(" ");
                contadorImpares++;
                contadorNumero = numero;
                producto = contadorNumero * producto;
            }

        } while (contadorImpares < 10);
        System.out.println("El producto de los 10 numeros impares es: " + producto);
    }
}
