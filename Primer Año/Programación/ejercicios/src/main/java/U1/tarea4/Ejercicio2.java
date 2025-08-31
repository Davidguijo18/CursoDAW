package U1.tarea4;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float nota1;
        float nota2;
        float mediaAritmetica;

        System.out.println("Introduce la nota 1");
            nota1 = teclado.nextFloat();

        System.out.println("Introduce la nota 2");
            nota2 = teclado.nextFloat();

        mediaAritmetica = (nota1 + nota2)/2;

        System.out.println("La media aritmetica de las notas es "+mediaAritmetica);
    }
}
