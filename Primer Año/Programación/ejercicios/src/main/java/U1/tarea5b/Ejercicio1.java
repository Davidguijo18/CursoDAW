package U1.tarea5b;
import java.util.Scanner;
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String diaSemana;

        System.out.println("Introduce un dia de la semana");
        diaSemana = teclado.nextLine();

        if(diaSemana.equals("Lunes")){
            System.out.println("A primera hora toca programacion");
        }

        if(diaSemana.equals("Martes")){
            System.out.println("A primera hora toca programacion");
        }

        if(diaSemana.equals("Miercoles")){
            System.out.println("A primera hora toca FOL");
        }

        if(diaSemana.equals("Jueves")){
            System.out.println("A primera hora toca base de datos");
        }

        if(diaSemana.equals("Viernes")){
            System.out.println("A primera hora toca programacion");
        }

    }
}
