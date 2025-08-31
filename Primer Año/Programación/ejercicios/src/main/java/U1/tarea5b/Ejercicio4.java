package U1.tarea5b;
import java.util.Scanner;
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numHoras;
        int pagaHora = 12;
        int pagaHorasExtra = 16;
        int sueldo;

        System.out.println("Por favor, introduzca el número de horas trabajadas durante la semana");
        numHoras = teclado.nextInt();

        if(numHoras <= 40){
            sueldo = numHoras * pagaHora;

            System.out.println("El sueldo semanal que le corresponde es de "+sueldo+" euros");
        }

        if(numHoras > 40){
            numHoras = numHoras - 40;
            sueldo = numHoras * pagaHorasExtra + (40 * pagaHora);

            System.out.println("El sueldo semanal que le corresponde es de "+sueldo+" euros");
        }

    }
}
