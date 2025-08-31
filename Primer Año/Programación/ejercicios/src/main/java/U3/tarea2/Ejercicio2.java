package U3.tarea2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String mensaje;
        String mensajeFinal = "";

        do {
            System.out.println("Introduce letras para formar una palabra");
            System.out.println("La formacion de la palabra terminara cuando introduzcas 'fin'");
            mensaje = teclado.nextLine();

            if (!mensaje.equalsIgnoreCase("fin")) {
                mensajeFinal = mensajeFinal.concat(" " + mensaje);
            }

        } while (!mensaje.equalsIgnoreCase("fin"));

        System.out.println("El mensaje final es " + mensajeFinal);
    }
}
