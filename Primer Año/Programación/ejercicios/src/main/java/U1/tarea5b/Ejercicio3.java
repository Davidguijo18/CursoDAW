package U1.tarea5b;
import java.util.Scanner;
public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.println("Introduce un numero correspondiente al dia de la semana");
        numero = teclado.nextInt();

        if(numero == 1){
            System.out.println("Este dia corresponde al Lunes");
        }

        if(numero == 2){
            System.out.println("Este dia corresponde al Martes");
        }

        if(numero == 3){
            System.out.println("Este dia corresponde al Miercoles");
        }

        if(numero == 4){
            System.out.println("Este dia corresponde al Jueves");
        }

        if(numero == 5){
            System.out.println("Este dia corresponde al Viernes");
        }

        if(numero == 6){
            System.out.println("Este dia corresponde al Sabado");
        }

        if(numero == 7){
            System.out.println("Este dia corresponde al Domingo");
        }
    }
}
