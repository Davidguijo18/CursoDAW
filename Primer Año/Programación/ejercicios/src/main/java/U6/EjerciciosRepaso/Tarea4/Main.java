package U6.EjerciciosRepaso.Tarea4;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.print("Introduce el titulo del libro: ");
            String titulo = teclado.nextLine();

            System.out.print("Introduce el autor del libro: ");
            String autor = teclado.nextLine();

            Libro libro = new Libro(titulo,autor);

        }catch (ExcepcionStringConNumero ex){
            System.out.println(ex.getMessage());
        }


    }
}
