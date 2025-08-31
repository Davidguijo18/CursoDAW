package U7.tarea3.Ejercicio3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Map<Integer, String> mapa = new HashMap<>();
        String nombre;
        String dni;

        do {
            System.out.println("Introduce un nombre: ");
            nombre = teclado.nextLine();

            System.out.println("Introduce un DNI: ");
            dni = teclado.nextLine();

            if (mapa.containsKey(calcularClave(dni))) {
                System.out.println("La clave " + calcularClave(dni) + " esta asociada al nombre " + mapa.get(calcularClave(dni)));
            } else {
                mapa.put(calcularClave(dni), nombre);
                System.out.println(mapa);
                System.out.println("La clave " + calcularClave(dni) + " esta asociada al nombre " + mapa.get(calcularClave(dni)));
            }

        } while (!dni.equalsIgnoreCase("0"));
        System.out.println("Finalizaste el programa");
    }

    public static Integer calcularClave(String dni) {
        int suma = 0;
        for (int i = 0; i < 8; i++) {
            suma += dni.charAt(i) - 48;
        }
        return suma;
    }
}
