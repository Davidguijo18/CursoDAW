package U1.tarea2;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Introduce el primer numero");
            num1 = teclado.nextInt();

        System.out.println("Introduce el segundo numero");
            num2 = teclado.nextInt();

        int resultado = num1/num2;

        System.out.println("El resultado de la division es "+resultado);
    }
}
