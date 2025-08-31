package U1.tarea5;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1;
        int num2;
        int cantidadPares = 0;

        System.out.println("Introduce el primer numero");
            num1 = teclado.nextInt();

        System.out.println("Introduce el segundo numero");
            num2 = teclado.nextInt();

        if (num1 % 2 == 0){
            cantidadPares = cantidadPares + 1;
        }

        if (num2 % 2 == 0){
            cantidadPares = cantidadPares + 1;
        }

        System.out.println("La cantidad de numeros pares es: "+cantidadPares);
    }
}
