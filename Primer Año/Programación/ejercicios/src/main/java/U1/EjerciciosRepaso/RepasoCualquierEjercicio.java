package U1.EjerciciosRepaso;

import java.util.Scanner;

public class RepasoCualquierEjercicio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int darVueltaNumero = 0;
        int darVueltaOtro = 0;
        int numBienNumero;
        int numBienOtro;
        int numPar = 0;
        int numImpar = 0;

        System.out.print("Introduce un numero: ");
        int numero = teclado.nextInt();

        System.out.print("Introduce otro numero: ");
        int otro = teclado.nextInt();

        while (numero > 0 && otro > 0) {
            darVueltaNumero = numero % 10 + darVueltaNumero * 10;
            darVueltaOtro = otro % 10 + darVueltaOtro * 10;
            numero /= 10;
            otro /= 10;
        }

        while (darVueltaNumero > 0 && darVueltaOtro > 0) {
            numBienNumero = darVueltaNumero % 10;
            numBienOtro = darVueltaOtro % 10;

            if (numBienNumero % 2 == 0) {
                numPar = numPar * 10 + numBienNumero;
            } else {
                numImpar = numImpar * 10 + numBienNumero;
            }

            if (numBienOtro % 2 == 0) {
                numPar = numPar * 10 + numBienOtro;
            } else {
                numImpar = numImpar * 10 + numBienOtro;
            }

            darVueltaNumero /= 10;
            darVueltaOtro /= 10;
        }

        System.out.println("El numero formado por los digitos pares es: " + numPar);
        System.out.println("El numero formado por los digitos impares es: " + numImpar);
    }
}
