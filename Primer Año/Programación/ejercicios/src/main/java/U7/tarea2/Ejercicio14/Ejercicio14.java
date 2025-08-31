package U7.tarea2.Ejercicio14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String cadena = teclado.nextLine();

        List<Character> lista = leeCadena(cadena);
        System.out.println(lista);

    }

    public static List<Character> leeCadena(String cadena) {
        List<Character> lista = new ArrayList<>();
        for (int i = 0; i < cadena.length(); i++) {
            lista.add(cadena.charAt(i));
        }

        return lista;
    }
}
