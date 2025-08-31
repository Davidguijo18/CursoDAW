package U1.tarea5b;
import java.util.Scanner;
public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float a;
        float b;
        float c;
        float x;

        System.out.println("Operacion de primer grado (ax2 + bx + c = 0)");

        System.out.println("Introduce el valor de a");
        a = teclado.nextFloat();

        System.out.println("Introduce el valor de b");
        b = teclado.nextFloat();

        System.out.println("Introduce el valor de c");
        c = teclado.nextFloat();

        x = -b / (2 * a);

        System.out.println("El valor de x es "+x);
    }
}
