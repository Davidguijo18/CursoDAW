package U3.tarea2;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador = 0;

        System.out.println("Introduzca un mensaje para ver los espacios en blanco que contiene");
        String mensaje = teclado.nextLine();

        for(int i = 0; i < mensaje.length();i++){
            char caracter = mensaje.charAt(i);

            if(caracter == ' '){
                contador++;
            }
        }

        System.out.println("El numero de espacios en blanco que contiene el mensaje son: "+contador);
    }
}
