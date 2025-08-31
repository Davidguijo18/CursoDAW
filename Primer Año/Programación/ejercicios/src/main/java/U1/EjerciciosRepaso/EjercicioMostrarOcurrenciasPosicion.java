package U1.EjerciciosRepaso;

import java.util.Scanner;

public class EjercicioMostrarOcurrenciasPosicion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numReves = 0;
        int numBien;
        int contadorOcurrencias = 0;
        int contador = 1;
        String posiciones = "";

        System.out.print("Introduce un numero: ");
        int numero = teclado.nextInt();

        System.out.print("Introduce una cifra: ");
        int cifra = teclado.nextInt();

        while (numero > 0) {
            numReves = numero % 10 + numReves * 10;
            numero /= 10;
        }

        while (numReves > 0) {
            numBien = numReves % 10;
            if (numBien == cifra) {
                contadorOcurrencias++;
                posiciones = posiciones + contador + " ";
            }
            contador++;
            numReves /= 10;
        }

        if (contadorOcurrencias > 0) {
            System.out.println("El total de ocurrencias es de " + contadorOcurrencias);
            System.out.println("Las posiciones de la variable son: " + posiciones);
        } else {
            System.out.println("No existe ninguna ocurrencia de esa cifra");
            System.out.println("No existe ninguna posicion de dicha variable");
        }
    }
}
