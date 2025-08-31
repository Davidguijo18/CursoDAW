package U3.tarea1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un solo caracter (letras): ");
        String mensaje = teclado.nextLine();

        mensaje = mensaje.toLowerCase();

        if (comprobar_Caracter(mensaje)) {
            System.out.println("El caracter es una vocal");
        } else {
            System.out.println("El caracter no es una vocal");
        }
    }

    public static boolean comprobar_Caracter(String caracter) {
        if (caracter.equals("a") || caracter.equals("e") || caracter.equals("i") || caracter.equals("o") || caracter.equals("u")) {
            return true;
        } else {
            return false;
        }
    }
}
