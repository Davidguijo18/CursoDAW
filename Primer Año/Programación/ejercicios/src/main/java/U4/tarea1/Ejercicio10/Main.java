package U4.tarea1.Ejercicio10;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Hora hora = new Hora();

        System.out.println("Introduce las horas: ");
        int horas = teclado.nextInt();

        System.out.println("Introduce los minutos: ");
        int minutos = teclado.nextInt();

        System.out.println("Introduce los segundos: ");
        int segundos = teclado.nextInt();

        System.out.println("Introduce un numero: ");
        int numero = teclado.nextInt();

        hora.setHoras(horas);
        hora.setMinutos(minutos);
        hora.setSegundos(segundos);
        hora.sumarSegundos(numero);

        if (hora.getHoras() >= 24) {
            System.out.println("La hora no puede marcar 24 o superior");
        } else {
            System.out.println("\nHora: " + hora.getHoras() + " Minutos: " + hora.getMinutos() + " Segundos: " + hora.getSegundos());
        }
    }
}
