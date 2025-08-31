package U1.tarea5b;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int dia;
        int hora;
        int minutos;
        int horaInicial = 15;
        int diaInicial = 5;
        int minutoInicial = 0;


        System.out.println("Introduce el dia de la semana en forma numerica");
        dia = teclado.nextInt();

        System.out.println("Introduce la hora");
        hora = teclado.nextInt();

        System.out.println("Introduce los minutos");
        minutos = teclado.nextInt();

        for (int i = 0; i > 15; i++) {
            hora = hora - 15;
            dia = dia - 1;
        }

        for (int i = 0; i >= 60; i++) {
            minutos = minutos - 60;
            hora++;
        }

        System.out.println("Para que viernes quedan " + dia + " dias, " + hora + " horas y " + minutos + " minutos");

    }
}






