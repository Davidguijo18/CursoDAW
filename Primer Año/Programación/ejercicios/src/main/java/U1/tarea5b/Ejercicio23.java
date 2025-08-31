package U1.tarea5b;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float precioInicial = 0;
        float precio = 0;
        String sabor;
        String tipoTarta = " ";
        String tipoChocolate = " ";
        String anadeNata;
        String contieneNata = " ";
        String contieneNombre = " ";
        String anadeNombre;

        System.out.println("Elija un sabor para su tarta (manzana, fresa o chocolate)");
        sabor = teclado.nextLine();

        if (sabor.equals("chocolate")) {
            System.out.println("Elija el tipo de chocolate que quiere (negro o blanco)");
            tipoTarta = "chocolate";
            tipoChocolate = teclado.nextLine();

            if (tipoChocolate.equals("negro")) {
                precioInicial = 14;

            } else if (tipoChocolate.equals("blanco")) {
                precioInicial = 15;

            } else {
                System.out.println("Debe elegir chocalate negro o blanco");
            }
        }

        if (sabor.equals("manzana")) {
            precioInicial = 18;
            tipoTarta = "manzana";
        }

        if (sabor.equals("fresa")) {
            tipoTarta = "fresa";
            precioInicial = 16;
        }

        System.out.println("¿Desea anadir nata? (si o no)");
        anadeNata = teclado.nextLine();

        precio = precioInicial;

        if (anadeNata.equals("si")) {
            precio = precio + 2.50F;
            contieneNata = "Con nata: 2,50€";
        } else if (anadeNata.equals("no")) {

        } else {
            System.out.println("Debe introducir si o no");
        }

        System.out.println("¿Desea anadir un nombre? (si o no)");
        anadeNombre = teclado.nextLine();

        if (anadeNombre.equals("si")) {
            precio = precio + 2.75F;
            contieneNombre = "Con nombre: 2,75€";
        } else if (anadeNombre.equals("no")) {

        } else {
            System.out.println("Debe introducir si o no");
        }


        System.out.println(" ");
        System.out.println("TICKET DE COMPRA");
        System.out.println("Tarta de " + tipoTarta + " " + tipoChocolate + " : " + precioInicial + " €");
        System.out.println(contieneNata);
        System.out.println(contieneNombre);
        System.out.println("TOTAL ---> " + precio + " €");
    }
}
