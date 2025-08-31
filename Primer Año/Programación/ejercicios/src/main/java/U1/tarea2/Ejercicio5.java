package U1.tarea2;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double gCentigrados;
        double gFarenheit;

        System.out.println("Introduce los grados centigrados");
            gCentigrados = teclado.nextInt();

            gFarenheit = 9 * gCentigrados/5+32;

        System.out.println(gCentigrados+" grados centigrados equivalen a "+gFarenheit+" grados farenheit");
    }
}
