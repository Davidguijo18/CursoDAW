package U3.tarea3;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int darVuelta = 0;
        int finalNumero;

        System.out.print("Introduce los digitos de la clave secreta: ");
        int digitos = teclado.nextInt();

        System.out.print("Introduce una clave para intentar adivinarla (La clave esta formadada por numeros del 1 al 5): ");
        int clave = teclado.nextInt();

        while (clave > 0) {
            darVuelta = clave % 10 + darVuelta * 10;
            clave /= 10;
        }

        while (darVuelta > 0) {
            finalNumero = darVuelta % 10;

            int[] array = new int[digitos];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 4) + 1;

                if (array[i] > finalNumero) {
                    System.out.println("El numero introducido (" + finalNumero + ") es menor");
                    break;
                } else if (array[i] < finalNumero) {
                    System.out.println("El numero introducido (" + finalNumero + ") es mayor");
                    break;
                } else if (array[i] == finalNumero) {
                    System.out.println("El numero introducido (" + finalNumero + ") es igual");
                }
            }
            darVuelta /= 10;
        }
    }
}
