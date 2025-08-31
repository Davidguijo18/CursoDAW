package U1.tarea5b;
import java.util.Scanner;
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float nota1;
        float nota2;
        float nota3;
        float media;

        System.out.println("Introduce la nota 1");
        nota1 = teclado.nextFloat();

        System.out.println("Introduce la nota 2");
        nota2 = teclado.nextFloat();

        System.out.println("Introduce la nota 3");
        nota3 = teclado.nextFloat();

        media = (nota1 + nota2 + nota3)/3;

        System.out.println("La media aritmetica de las notas es "+media);

        if(media < 5 && media >=0){
            System.out.println("Insuficiente");
        }

        if(media >= 5 && media < 6){
            System.out.println("Suficiente");
        }

        if(media >= 6 && media < 7){
            System.out.println("Bien");
        }

        if(media >= 7 && media < 9){
            System.out.println("Notable");
        }

        if(media > 9 && media <= 10){
            System.out.println("Sobresaliente");
        }
    }
}
