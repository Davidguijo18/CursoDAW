package U1.tarea7;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        char numero;
        String letra;

        numero = (char) (Math.random() * (122 - 97 + 1) + 97);
        letra = Character.toString(numero);

        System.out.println("La letra aleatoria es " + letra);
    }
}
