package U3.EjerciciosRepaso.EjercicioRehechos;

import java.util.Scanner;

public class EjercicioPalabrasColores {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] array = new String[8];
        String[] colores = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
        String[] arrayFinal = new String[8];
        int contadorColor = 0;
        int contadorNoColor = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce una palabra: ");
            array[i] = teclado.nextLine();

            if (esColor(colores, array[i])) {
                arrayFinal[contadorColor] = array[i];
                contadorColor++;
            } else {
                arrayFinal[7 - contadorNoColor] = array[i];
                contadorNoColor++;
            }
        }

        for (int i = 0; i < arrayFinal.length; i++) {
            System.out.print(arrayFinal[i] + " ");
        }


    }

    public static boolean esColor(String[] colores, String palabra) {
        boolean esColor = false;
        for (int i = 0; i < colores.length; i++) {
            if (palabra.equalsIgnoreCase(colores[i])) {
                esColor = true;
            }
        }
        return esColor;
    }
}
