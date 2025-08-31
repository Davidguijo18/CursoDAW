package U3.tarea3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numReves = 0;
        int numLoteria = 0;

        int[] combinacion = new int[6];
        for (int i = 0; i < combinacion.length; i++) {
            combinacion[i] = (int) (Math.random() * 9) + 1;
        }

        /*
        for(int i = 0; i < combinacion.length;i++){
            System.out.print(combinacion[i]);
        }
        */

        System.out.println("El numero de aciertos depende de las coindidencias, es decir, debe de coincidir los numeros de cada posicion");
        System.out.println("EL numero de la loteria tiene 6 digitos");

        do {
            System.out.print("Introduce el numero de la loteria: ");
            numLoteria = teclado.nextInt();
        } while (numLoteria <= 99999 || numLoteria > 999999);

        while (numLoteria > 0) {
            numReves = numLoteria % 10 + numReves * 10;
            numLoteria /= 10;
        }

        int[] apuesta = new int[6];
        for (int i = 0; i < apuesta.length; i++) {
            apuesta[i] = numReves % 10;
            numReves /= 10;
        }

        System.out.println("El numero de aciertos es de: " + numAciertos(combinacion, apuesta));

    }

    public static int numAciertos(int[] apuesta, int[] combinacion) {

        int numAciertos = 0;
        for (int i = 0; i < apuesta.length; i++) {
            if (apuesta[i] == combinacion[i]) {
                numAciertos++;
            }
        }

        return numAciertos;
    }
}
