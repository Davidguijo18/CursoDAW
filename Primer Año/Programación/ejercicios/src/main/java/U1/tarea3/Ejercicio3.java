package U1.tarea3;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double num1;
        double num2;
        double resultado;

        System.out.println("Introduzca el primer numero");
            num1 = teclado.nextDouble();

        System.out.println("Introduzca el segundo numero");
            num2 = teclado.nextDouble();

        resultado = num1 / num2;

        System.out.println("La division de los numeros reales es "+resultado);
    }
}
