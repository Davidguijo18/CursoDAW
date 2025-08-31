package U1.EjerciciosRepaso;

import java.util.Scanner;

public class EjercicioDigitosParImpar {
    public static void main(String[] args) {

        int darVueltaNum1 = 0;
        int numDefinitivoNum1 = 0;
        int darVueltaNum2 = 0;
        int numDefinitivoNum2 = 0;
        String digitosPares = "";
        String digitosImpares = "";

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int num1 = teclado.nextInt();

        System.out.println("Introduce otro numero");
        int num2 = teclado.nextInt();

        while (num1 > 0 && num2 > 0) {
            darVueltaNum1 = num1 % 10 + darVueltaNum1 * 10;
            darVueltaNum2 = num2 % 10 + darVueltaNum2 * 10;

            num1 /= 10;
            num2 /= 10;
        }

        while (darVueltaNum1 > 0 && darVueltaNum2 > 0) {
            numDefinitivoNum1 = darVueltaNum1 % 10;
            numDefinitivoNum2 = darVueltaNum2 % 10;

            if (numDefinitivoNum1 % 2 == 0) {
                digitosPares = digitosPares + numDefinitivoNum1 + "";
            } else {
                digitosImpares = digitosImpares + numDefinitivoNum1 + "";
            }

            if (numDefinitivoNum2 % 2 == 0) {
                digitosPares = digitosPares + numDefinitivoNum2 + "";
            } else {
                digitosImpares = digitosImpares + numDefinitivoNum2 + "";
            }

            darVueltaNum1 /= 10;
            darVueltaNum2 /= 10;
        }

        System.out.println("Los numeros pares son: " + digitosPares);
        System.out.println("Los numeros impares son: " + digitosImpares);
    }
}
