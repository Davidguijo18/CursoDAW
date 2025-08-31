package U1.EjerciciosRepaso;
import java.util.Scanner;

public class EjercicioNumerosAparecen {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = teclado.nextInt();

        boolean[] aparecen = new boolean[10];

        while (numero > 0) {
            int digito = numero % 10;
            aparecen[digito] = true;
            numero /= 10;
        }

        System.out.print("Números que aparecen: ");
        for (int i = 1; i < aparecen.length; i++) {
            if (aparecen[i]) {
                System.out.print(i + " ");
            }
        }

        System.out.print("\nNúmeros que no aparecen: ");
        for (int i = 1; i < aparecen.length; i++) {
            if (!aparecen[i]) {
                System.out.print(i + " ");
            }
        }
    }
}

