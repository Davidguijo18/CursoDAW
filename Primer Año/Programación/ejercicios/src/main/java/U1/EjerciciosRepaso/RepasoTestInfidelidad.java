package U1.EjerciciosRepaso;

import java.util.Scanner;

public class RepasoTestInfidelidad {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String respuesta = "";
        int contador = 0;
        System.out.println("TEST DE INFIDELIDAD");

        System.out.println("Debes responder cada pregunta con si/no . Cada pregunta verdadera contara 3 puntos");

        System.out.println("1-Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente");
        respuesta = teclado.nextLine();

        if (respuesta.equalsIgnoreCase("si")) {
            contador = contador + 3;
        } else if (respuesta.equalsIgnoreCase("no")) {
            contador = contador + 0;
        }


        System.out.println("2-Ha aumentado sus gastos de vestuario");
        respuesta = teclado.nextLine();

        if (respuesta.equalsIgnoreCase("si")) {
            contador = contador + 3;
        } else if (respuesta.equalsIgnoreCase("no")) {
            contador = contador + 0;
        }

        System.out.println("3-Ha perdido el interés que mostraba anteriormente por ti");
        respuesta = teclado.nextLine();

        if (respuesta.equalsIgnoreCase("si")) {
            contador = contador + 3;
        } else if (respuesta.equalsIgnoreCase("no")) {
            contador = contador + 0;
        }

        System.out.println("4-Ahora se afeita y se asea con más frecuencia (si es hombre) o se arregla el pelo y se asea con más frecuencia (si es mujer)");
        respuesta = teclado.nextLine();

        if (respuesta.equalsIgnoreCase("si")) {
            contador = contador + 3;
        } else if (respuesta.equalsIgnoreCase("no")) {
            contador = contador + 0;
        }

        System.out.println("5-No te deja que mires la agenda de su teléfono móvil");
        respuesta = teclado.nextLine();

        if (respuesta.equalsIgnoreCase("si")) {
            contador = contador + 3;
        } else if (respuesta.equalsIgnoreCase("no")) {
            contador = contador + 0;
        }

        System.out.println("6-A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
        respuesta = teclado.nextLine();

        if (respuesta.equalsIgnoreCase("si")) {
            contador = contador + 3;
        } else if (respuesta.equalsIgnoreCase("no")) {
            contador = contador + 0;
        }

        System.out.println("7-Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
        respuesta = teclado.nextLine();

        if (respuesta.equalsIgnoreCase("si")) {
            contador = contador + 3;
        } else if (respuesta.equalsIgnoreCase("no")) {
            contador = contador + 0;
        }

        System.out.println("8-Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
        respuesta = teclado.nextLine();

        if (respuesta.equalsIgnoreCase("si")) {
            contador = contador + 3;
        } else if (respuesta.equalsIgnoreCase("no")) {
            contador = contador + 0;
        }

        System.out.println("9-Has notado que últimamente se perfuma más");
        respuesta = teclado.nextLine();

        if (respuesta.equalsIgnoreCase("si")) {
            contador = contador + 3;
        } else if (respuesta.equalsIgnoreCase("no")) {
            contador = contador + 0;
        }

        System.out.println("10-Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
        respuesta = teclado.nextLine();

        if (respuesta.equalsIgnoreCase("si")) {
            contador = contador + 3;
        } else if (respuesta.equalsIgnoreCase("no")) {
            contador = contador + 0;
        }

        System.out.println();
        
        if (contador <= 10) {
            System.out.println(" ¡Enhorabuena! tu pareja parece ser totalmente fiel.");
        } else if (contador >= 11 && contador <= 22) {
            System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
        } else if (contador >= 23 && contador <= 30) {
            System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
        }
    }
}
