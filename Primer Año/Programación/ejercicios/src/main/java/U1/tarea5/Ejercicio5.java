package U1.tarea5;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1;
        int num2;
        int num3;

        System.out.println("Introduce el primer numero");
        num1 = teclado.nextInt();

        System.out.println("Introduce el segundo numero");
        num2 = teclado.nextInt();

        System.out.println("Introduce el tercer numero");
        num3 = teclado.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println("El numero mayor es el primero ("+num1+")");
        }

        if(num2 > num1 && num2 > num3){
            System.out.println("El numero mayor es el segundo ("+num2+")");
        }

        if(num3 > num2 && num3 > num1){
            System.out.println("El numero mayor es el tercero ("+num3+")");
        }

    }
}
