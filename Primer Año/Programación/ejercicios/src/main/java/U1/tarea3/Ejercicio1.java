package U1.tarea3;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        byte num1;
        byte num2;
        int resultado;

        System.out.println("Introduzca el primer numero");
            num1 = teclado.nextByte();

        System.out.println("Introduzca el segundo numero");
            num2 = teclado.nextByte();

        resultado = num1 + num2;

        System.out.println("La suma de los numeros es "+resultado);
    }
}
