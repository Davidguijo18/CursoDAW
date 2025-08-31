package U1.EjerciciosRepaso;

import java.util.Scanner;

public class EjercicioInsertarNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numReves = 0;
        int numBien = 0;
        int contador = 1;

        System.out.println("Introduce un numero");
        int numero = teclado.nextInt();

        System.out.println("Introduce el numero que quiere insertar");
        int insertar = teclado.nextInt();

        System.out.println("Introduce la posicion donde quiere insertar el numero");
        int posicion = teclado.nextInt();

        while (numero > 0) {
            numReves = numero % 10 + numReves * 10;
            numero /= 10;
        }

        while (numReves > 0) {
            numBien = numReves % 10 + numBien * 10;
            if (posicion == contador) {
                numBien = numBien * 10 + insertar;
            }
            contador++;
            numReves /= 10;
        }

        System.out.println("El numero final es: " + numBien);
    }
}
