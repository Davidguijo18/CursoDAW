package U1.tarea3;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        short anoNacimento;
        short anoActual;
        int edad;

        System.out.println("Introduce tu año de nacimiento");
            anoNacimento = teclado.nextShort();

        System.out.println("Introduce el año actual");
            anoActual = teclado.nextShort();

        edad = anoActual - anoNacimento;

        System.out.println("Tienes "+edad+" años");
    }
}
