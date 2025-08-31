package U3.tarea1;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el valor de a");
        double a = teclado.nextDouble();

        System.out.println("Introduce el valor de n");
        int n = teclado.nextInt();

        double resultadoIterativo = calcularPotenciaIterativa(a, n);
        System.out.println("Iterativo: " + a + " elevado a " + n + " es " + resultadoIterativo);

        double resultadoRecursivo = calcularPotenciaRecursiva(a, n);
        System.out.println("Recursivo: " + a + " elevado a " + n + " es " + resultadoRecursivo);
    }

    public static double calcularPotenciaIterativa(double a, int n) {
        double resultado = 1.0;
        for (int i = 0; i < n; i++) {
            resultado *= a;
        }
        return resultado;
    }

    public static double calcularPotenciaRecursiva(double a, int n) {
        if (n == 0) {
            return 1.0;
        } else if (n < 0) {
            return 1.0 / (a * calcularPotenciaRecursiva(a, -n - 1));
        } else {
            return a * calcularPotenciaRecursiva(a, n - 1);
        }
    }
}
