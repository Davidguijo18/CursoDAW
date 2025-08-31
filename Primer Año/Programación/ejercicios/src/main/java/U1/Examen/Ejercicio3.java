package U1.Examen;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int totalBurguerBasicas;
        int totalBurguerGourmet;
        double descuento = 0;
        double pago = 0;
        double total = 0;

        System.out.println("Pedidos Pitanza Feliz");
        System.out.print("Introduzca el numero de hamburguesas basicas: ");
        int burguerBasicas = teclado.nextInt();
        int numBas = burguerBasicas;

        System.out.print("Introduzca el numero de hamburguesas gormuet: ");
        int burguerGourmet = teclado.nextInt();
        int numGour = burguerGourmet;

        teclado.nextLine();

        System.out.print("Introduzca el dia de la semana (Con letras): ");
        String diaSemana = teclado.nextLine();

        System.out.print("Pertence al club Fanegas (s/n): ");
        String club = teclado.nextLine();

        if (diaSemana.equalsIgnoreCase("miercoles")) {
            total = (burguerBasicas * 2) + (burguerGourmet * 5);

            if (club.equalsIgnoreCase("s")) {
                descuento = (total * 12) / 100;
                pago = total - descuento;
            } else {
                pago = total;
            }


        } else if (diaSemana.equalsIgnoreCase("martes")) {

            if (burguerGourmet % 2 == 0) {
                burguerGourmet = 8 * (burguerGourmet / 2 + 1);
            } else {
                burguerGourmet = 8 * (burguerGourmet / 2) + 6;
            }

            total = burguerGourmet + burguerBasicas * 3;

            if (club.equalsIgnoreCase("s")) {
                descuento = (total * 12) / 100;
                pago = total - descuento;
            } else {
                pago = total;
            }

        } else {
            total = (burguerBasicas * 3) + (burguerGourmet * 5);

            if (club.equalsIgnoreCase("s")) {
                descuento = (total * 12) / 100;
                pago = total - descuento;
            } else {
                pago = total;
            }
        }

        System.out.println("\nAqui tiene su pedido. Gracias por su compra");
        System.out.println("Numero de hamburguesas basicas: " + numBas);
        System.out.println("Numero de hamburguesas gourmet: " + numGour);
        System.out.println("Total: " + total + " €");
        System.out.println("Descuento: " + descuento + " €");
        System.out.println("A pagar: " + pago + " €");
    }
}
