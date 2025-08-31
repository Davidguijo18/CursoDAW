package U3.tarea2;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String mensajeFinal = "";

        System.out.println("Introduce tu nombre para mostrarlo sin las vocales");
        String mensaje = teclado.nextLine();

        for (int i = 0; i < mensaje.length(); i++) {
            char caracter = mensaje.charAt(i);

            String comparar = Character.toString(caracter);

            if (!comparar.equalsIgnoreCase("a") && !comparar.equalsIgnoreCase("e") && !comparar.equalsIgnoreCase("i")
                    && !comparar.equalsIgnoreCase("o") && !comparar.equalsIgnoreCase("u")) {

                mensajeFinal = mensajeFinal.concat(comparar);
            }
        }

        System.out.println("Tu nombre sin vocales es: " + mensajeFinal);
    }
}
