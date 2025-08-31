package U1.tarea2;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int millas;
        int metros;
        int equivalenciaMetros = 1609;

        System.out.println("Introduzca un numero de millas");
            millas = teclado.nextInt();

        metros = millas * equivalenciaMetros;

        System.out.println(millas+" millas equivalen a "+metros+" metros");
    }
}
