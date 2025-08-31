package U1.tarea5;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.println("Introduce el numero 12");
            numero = teclado.nextInt();

        if(numero == 12){
            System.out.println("Has introducido el numero 12");
        }else{
            System.out.println("El numero que has introducido no es el numero 12");
        }
    }
}
