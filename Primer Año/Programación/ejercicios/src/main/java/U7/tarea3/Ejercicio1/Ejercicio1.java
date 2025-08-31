package U7.tarea3.Ejercicio1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Map<Integer, String> mapa = new HashMap<>();

        System.out.println("Introduce un nombre: ");
        String nombre = teclado.nextLine();

        System.out.println("Introduce un DNI: ");
        String dni = teclado.nextLine();

        mapa.put(calcularClave(dni), nombre);
        System.out.println(mapa);

    }

    public static Integer calcularClave(String dni) {
        int suma = 0;
        for (int i = 0; i < 8; i++) {
            suma += dni.charAt(i) - 48;
        }
        return suma;
    }
}
