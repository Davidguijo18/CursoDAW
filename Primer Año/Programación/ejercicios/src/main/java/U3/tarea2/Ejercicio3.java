package U3.tarea2;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un mensaje");
        String mensaje = teclado.nextLine();

        char caracter = mensaje.charAt(mensaje.length() / 2);

        if(caracter == ' '){
            System.out.println("El caracter del espacio central es un espacio");
        }else{
            System.out.println("El caracter del espacio central no es un espacio");
        }

    }
}
