package U1.tarea4;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float nota1;
        float nota2;
        float nota3;
        float mediaAritmetica;

        System.out.println("Introduce la nota 1");
        nota1 = teclado.nextFloat();

        System.out.println("Introduce la nota 2");
        nota2 = teclado.nextFloat();

        System.out.println("Introduce la nota 3");
        nota3 = teclado.nextFloat();

        mediaAritmetica = (nota1 + nota2 + nota3)/3;

        System.out.println("La media aritmetica de las notas es "+mediaAritmetica);
    }
}
