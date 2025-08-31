package U3.EjerciciosRepaso.EjerciciosInternet;

import java.util.Scanner;

public class EjercicioAnadirLetras {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] array = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String mensaje = "";

        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce una posicion: ");
            int posicion = teclado.nextInt();

            if (posicion == -1) {
                break;
            }

            mensaje = mensaje.concat(array[posicion]);
        }

        System.out.println("\nEl mensaje final es: " + mensaje);
    }
}
