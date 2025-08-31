package U1.tarea5b;
import java.util.Scanner;
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int hora;

        System.out.println("Introduzca la hora actual en formato digital");
        hora = teclado.nextInt();

        if(hora >= 6 && hora <= 12){
            System.out.println("Buenos dias");
        }

        if(hora >= 13 && hora <= 20){
            System.out.println("Buenas tardes");
        }

        if(hora >= 21 || hora <= 5){
            System.out.println("Buenas noches");
        }
    }
}
