package U1.ExamenesEstudio.Examen1_Azul;
import java.util.Scanner;

public class Ejercicio4{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String respuesta;
        int contador = 0;

        System.out.println("TEST DE INFIDELIDAD");
        System.out.println("Responda a las preguntas introduciendo V(verdadero) o F(falso)");
        System.out.println("");

        System.out.println("Tu pareja parece estar mas inquieta de lo normal sin ningun motivo aparente.");
        respuesta = teclado.nextLine();
        if (respuesta.equals("V")) {
            contador = contador + 3;
        }

        System.out.println("Ha aumentado sus gastos de vestuario");
        respuesta = teclado.nextLine();
        if (respuesta.equals("V")) {
            contador = contador + 3;
        }

        System.out.println("Ha perdido el interes que mostraba anteriormente por ti");
        respuesta = teclado.nextLine();
        if (respuesta.equals("V")) {
            contador = contador + 3;
        }

        System.out.println("Ahora se afeita y se asea con mas frecuencia (si es hombre) o ahora se arregla el pelo y se asea con mas frecuencia (si es mujer)");
        respuesta = teclado.nextLine();
        if (respuesta.equals("V")) {
            contador = contador + 3;
        }

        System.out.println("No te deja que mires la agenda de su teléfono movil");
        respuesta = teclado.nextLine();
        if (respuesta.equals("V")) {
            contador = contador + 3;
        }

        System.out.println("A veces tiene llamadas que dice no querer contestar cuando estas tu delante");
        respuesta = teclado.nextLine();
        if (respuesta.equals("V")) {
            contador = contador + 3;
        }

        System.out.println("Ultimamente se preocupa mas en cuidar la línea y/o estar bronceado/a");
        respuesta = teclado.nextLine();
        if (respuesta.equals("V")) {
            contador = contador + 3;
        }

        System.out.println("Muchos dias viene tarde despues de trabajar porque dice tener mucho mas trabajo");
        respuesta = teclado.nextLine();
        if (respuesta.equals("V")) {
            contador = contador + 3;
        }

        System.out.println("Has notado que ultimamente se perfuma mas");
        respuesta = teclado.nextLine();
        if (respuesta.equals("V")) {
            contador = contador + 3;
        }

        System.out.println("Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
        respuesta = teclado.nextLine();
        if (respuesta.equals("V")) {
            contador = contador + 3;
        }

        System.out.println(" ");

        if (contador <= 10) {
            System.out.println("Enhorabuena, tu pareja parece ser totalmente fiel");
        }

        if (contador >= 11 && contador <= 22) {
            System.out.println("Quizas exista el peligro de otra persona en su vida o en su mente, aunque seguramente sera algo sin importancia. No bajes la guardia.");
        }

        if (contador > 22) {
            System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco mas y averigues que es lo que esta pasando por su cabeza.");
        }
    }
}
