package U1.tarea8a;
import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;
        int contadorNumPrim = 0;
        boolean primo;

        System.out.println("Introduce un numero");
        numero= teclado.nextInt();

        System.out.println("Los numeros que hay entre 1 y "+numero+" son");
        for (int i = 2; i <= numero; i++) {
            primo = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                contadorNumPrim++;
                System.out.println(i + "-> Primo");
            } else {
                System.out.println(i + "-> No primo");
            }
        }
        System.out.println(" ");
        System.out.println("Entre 1 y " + numero + " hay " + contadorNumPrim + " numeros primos.");
    }
}