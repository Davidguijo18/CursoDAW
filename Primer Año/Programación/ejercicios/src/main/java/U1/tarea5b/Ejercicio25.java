package U1.tarea5b;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String comida;
        String bebida;
        float precio = 0;
        String opcionPitufo;
        String opcionComida = " ";
        String opcionBebida = " ";

        System.out.println("Que ha tomado de comer?");
        comida = teclado.nextLine();

        if (!comida.equals("palmera") && !comida.equals("pitufo") && !comida.equals("donut")) {
            System.out.println("La comida que has introducido no existe");
        } else {

            if (comida.equals("palmera")) {
                precio = 1.40F;
                String mostrarPalmera = "Palmera : 1,40€";
                opcionComida = mostrarPalmera;
            }

            if (comida.equals("donut")) {
                precio = 1;
                String mostrarDonut = "Donut : 1€";
                opcionComida = mostrarDonut;
            }

            if (comida.equals("pitufo")) {
                System.out.println("Con que se ha tomado el pitufo");
                opcionPitufo = teclado.nextLine();

                if (!opcionPitufo.equals("aceite") && !opcionPitufo.equals("tortilla")) {
                    System.out.println("El pitufo no puede tener ese ingrediente");

                } else {
                    if (opcionPitufo.equals("aceite")) {
                        precio = 1.20F;
                        String mostrarPitAceite = "Pitufo con aceite : 1.20€";
                        opcionComida = mostrarPitAceite;
                    }

                    if (opcionPitufo.equals("tortilla")) {
                        precio = 1.60F;
                        String mostrarPitTortilla = "Pitufo con tortilla : 1.60€";
                        opcionComida = mostrarPitTortilla;
                    }
                }
            }
        }

        System.out.println("Que ha tomado de beber?");
        bebida = teclado.nextLine();

        if (!bebida.equals("zumo") && !bebida.equals("cafe")) {
            System.out.println("No ofrecemos esa bebida");
        } else {
            if (bebida.equals("zumo")) {
                precio = precio + 1.50F;
                String mostrarZumo = "Zumo : 1.50€";
                opcionBebida = mostrarZumo;
            }

            if (bebida.equals("cafe")) {
                precio = precio + 1.20F;
                String mostrarCafe = "Cafe : 1.50.€";
                opcionBebida = mostrarCafe;
            }
        }
        System.out.println();
        System.out.println("---TICKET---");
        System.out.println(opcionComida);
        System.out.println(opcionBebida);
        System.out.println("Total desayuno : " + precio + "€");

    }
}
