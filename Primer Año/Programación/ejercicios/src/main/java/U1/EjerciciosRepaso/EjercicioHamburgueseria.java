package U1.EjerciciosRepaso;

import java.util.Scanner;

public class EjercicioHamburgueseria {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int precioBurguerNormal = 3;
        int precioBurguerGourment = 5;
        int numGourmetMartes = 0;
        int total;
        int totalConDescuento = 0;
        int descuento = 0;

        System.out.print("Introduzca el numero de hamburguesas basicas: ");
        int numBasicas = teclado.nextInt();

        System.out.print("Introduzca el numero de hamburguesas gourmet: ");
        int numGourmet = teclado.nextInt();

        teclado.nextLine();

        System.out.print("Introduzca el dia de la semana: ");
        String dia = teclado.nextLine();

        System.out.print("Pertenece al club Fanegas? (s/n): ");
        String perteneceClub = teclado.nextLine();

        if (dia.equalsIgnoreCase("martes")) {
            while (numGourmet > 1) {
                numGourmetMartes = numGourmet / 2;
                numGourmet = numGourmet - 2;
            }
            total = numGourmetMartes * 9 + numGourmet * precioBurguerGourment + numBasicas * precioBurguerNormal;

        } else if (dia.equalsIgnoreCase("miercoles")) {
            precioBurguerNormal = 2;
            total = numGourmet * precioBurguerGourment + numBasicas * precioBurguerNormal;
        } else {
            total = numGourmet * precioBurguerGourment + numBasicas * precioBurguerNormal;
        }


        if (perteneceClub.equalsIgnoreCase("s")) {
            descuento = total * 12 / 100;
            totalConDescuento = total - descuento;
        }

        System.out.println("\nAqui tiene su pedido.Gracias por su compra");
        System.out.println("Hamburguesas basicas: " + numBasicas);
        System.out.println("Hamburguesas gourmet: " + numGourmet);
        System.out.println("Total: " + total + " €");
        System.out.println("Descuento: " + descuento + " €");
        if (perteneceClub.equalsIgnoreCase("s")) {
            System.out.println("A pagar: " + totalConDescuento + " €");
        } else {
            System.out.println("A pagar: " + total);
        }
    }
}
