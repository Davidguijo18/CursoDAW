package U1.tarea5;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.println("Intoduce un numero");
            numero = teclado.nextInt();

        if(numero > 0){
            System.out.println("El numero es mayor que 0");
        }else{
            System.out.println("El numero es menor que 0");
        }
    }
}
