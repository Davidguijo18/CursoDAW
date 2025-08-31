package U1.EjerciciosRepaso;

import java.util.Scanner;

public class EjercicioContarFrase {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int contadorA = 0;
        int contadorE = 0;
        int contadorO = 0;
        int contadorEspacios = 0;
        int contadorH = 0;

        System.out.print("Introduce una frase: ");
        String frase = teclado.nextLine();

        frase = frase.toLowerCase();

        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);

            if (caracter == 'a') {
                contadorA++;
            } else if (caracter == 'e') {
                contadorE++;
            } else if (caracter == 'o') {
                contadorO++;
            } else if (caracter == ' ') {
                contadorEspacios++;
            } else if (caracter == 'h') {
                contadorH++;
            }
        }

        int total = contadorA + contadorE + contadorO + contadorH + contadorEspacios;

        System.out.println("El total de vocales abiertas, h y espacios es de " + total);
    }
}
