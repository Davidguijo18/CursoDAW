package U1.Recuperacion;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        long resto = 0;
        long numBinario = 0;

        System.out.print("Introduce un numero: ");
        long numero = teclado.nextLong();
        int numeroOriginal = (int) numero;


        while (numero > 0) {
            resto = resto * 10 + numero % 2;
            numero /= 2;
        }

        while (resto > 0) {
            numBinario = resto % 10 + numBinario * 10;
            resto /= 10;
        }

        System.out.println("El numero " + numeroOriginal + " en binario es: " + numBinario);

        //Este metodo lo he hecho simplemente para comprobar que es correcto
        System.out.println("\n!!Mensaje de comprobacion: " + Integer.toBinaryString(numeroOriginal) + "!!");
    }
}
