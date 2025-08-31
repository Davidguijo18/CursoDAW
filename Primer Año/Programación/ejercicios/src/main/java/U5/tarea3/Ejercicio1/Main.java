package U5.tarea3.Ejercicio1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Numero[] numeros = new Numero[20];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Numero.generarNumeroAleatorio();
        }

        System.out.println("Tabla antes de ordenar:");
        System.out.println(Arrays.toString(numeros));

        Arrays.sort(numeros, new CompararNumeros());

        System.out.println("\nTabla ordenada en orden decreciente:");
        System.out.println(Arrays.toString(numeros));
    }
}
