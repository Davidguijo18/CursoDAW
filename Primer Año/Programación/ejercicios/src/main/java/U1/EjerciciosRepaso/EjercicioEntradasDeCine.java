package U1.EjerciciosRepaso;

import java.util.Scanner;

public class EjercicioEntradasDeCine {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int precioEntradas = 8;
        int precioPareja = 11;
        double total = 0;
        double descuento = 0;
        double pagar = 0;

        System.out.println("Venta de entradas CineCampa");
        System.out.print("Introduce el numero de entradas: ");
        int numEntradas = teclado.nextInt();

        teclado.nextLine();

        System.out.print("Introduce el dia de la semana: ");
        String dia = teclado.nextLine();

        System.out.print("¿Tiene tarjeta del CineCampa (si/no): ");
        String tarjeta = teclado.nextLine();

        if (dia.equalsIgnoreCase("miercoles")) {
            precioEntradas = 5;
            total = precioEntradas * numEntradas;

            if (tarjeta.equalsIgnoreCase("si")) {
                descuento = (total / 100) * 10;
                pagar = total - descuento;
            } else {
                pagar = total;
            }

        } else if (dia.equalsIgnoreCase("jueves")) {
            if (numEntradas % 2 == 0) {
                numEntradas = numEntradas / 2;
                total = numEntradas * precioPareja;

                if (tarjeta.equalsIgnoreCase("si")) {
                    descuento = (total / 100) * 10;
                    pagar = total - descuento;
                } else {
                    pagar = total;
                }

            } else {
                numEntradas = numEntradas / 2 + 1;
                total = numEntradas * precioPareja + precioEntradas;

                if (tarjeta.equalsIgnoreCase("si")) {
                    descuento = (total / 100) * 10;
                    pagar = total - descuento;
                } else {
                    pagar = total;
                }

            }

        } else {
            total = numEntradas * precioEntradas;

            if (tarjeta.equalsIgnoreCase("si")) {
                descuento = (total / 100) * 10;
                pagar = total - descuento;
            } else {
                pagar = total;
            }
        }

        System.out.println("\nAqui tiene sus entradas. Gracias por su compra");
        if (dia.equalsIgnoreCase("miercoles")) {
            System.out.println("Entradas indiviales: " + numEntradas);
            System.out.println("Precio por entrada individual: " + precioEntradas + " €");
        } else if (dia.equalsIgnoreCase("jueves")) {
            System.out.println("Entradas de pareja: " + numEntradas);
            System.out.println("Precio por entrada de pareja: " + precioPareja + " €");
        } else {
            System.out.println("Entradas individuales: " + numEntradas);
            System.out.println("Precio por entrada individual: " + precioEntradas + " €");
        }
        System.out.println("Total: " + total + " €");
        System.out.println("Descuento: " + descuento + " €");
        System.out.println("A pagar: " + pagar + " €");
    }
}
