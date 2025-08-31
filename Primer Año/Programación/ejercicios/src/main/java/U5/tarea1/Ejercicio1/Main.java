package U5.tarea1.Ejercicio1;

import U5.tarea1.Ejercicio3.HoraExacta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        /*int hora, minutos;

        do {
            System.out.println("Introduce una hora: ");
            hora = teclado.nextInt();
            if (hora < 0 || hora > 23) {
                System.out.println("La hora que has introducido no es correcta");
            }
        } while (hora < 0 || hora > 23);

        System.out.println("Introduce los minutos: ");
        minutos = teclado.nextInt();

        Hora horas = new Hora(hora, minutos);
        System.out.println(horas);

        horas.incrementar();

        System.out.println(horas);
         */

        HoraExacta horaExacta = new HoraExacta(12,59,59);
        horaExacta.horaExacta();
        horaExacta.inc();
        horaExacta.horaExacta();
        horaExacta.setSegundos(45);
        horaExacta.horaExacta();
    }
}
