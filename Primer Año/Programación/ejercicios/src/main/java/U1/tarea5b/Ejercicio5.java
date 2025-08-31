package U1.tarea5b;
import java.util.Scanner;
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float a;
        float b;
        float x;

        System.out.println("Operacion de primer grado (ax+b=0)");

        System.out.println("Introduce el valor de a");
        a = teclado.nextFloat();

        System.out.println("Introduce el valor de b");
        b = teclado.nextFloat();

        x = -b/a;
        System.out.println("El valor de x es "+x);

    }
}
