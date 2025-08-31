package U3.tarea2;
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un mensaje");
        String mensaje = teclado.nextLine();

        if(mensaje.contains("Javalin,javalon") || mensaje.contains("javalen,len,len")){
            System.out.println("La frase esta escrita en Javalandia");
            mensaje = mensaje.replace("Javalin,javalon","");
            mensaje = mensaje.replace("javalen,len,len","");
            System.out.println("La frase sin coletilla es: "+mensaje.trim());
        }else{
            System.out.println("La frase no esta escrita en Javalandia");
            System.out.println("La frase es: "+mensaje.trim());
        }

    }
}
