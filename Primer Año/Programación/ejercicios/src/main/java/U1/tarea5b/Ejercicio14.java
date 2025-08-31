package U1.tarea5b;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String caracter;
        String direccion;

        System.out.println("Introduce una opcion para rellenar el caracter (*, +, -, $, &,etc)");
        caracter = teclado.nextLine();

        System.out.println("Introduce para donde esta apuntando la piramide");
        System.out.println("A --> Arriba");
        System.out.println("B --> Abajo");
        System.out.println("D --> Derecha");
        System.out.println("I --> Izquierda");
        System.out.println(" ");
        System.out.print("Tu opcion es: ");
        direccion = teclado.nextLine();
        System.out.println(" ");

        switch (direccion) {
            case "A":
                System.out.println("  " + caracter + "   ");
                System.out.println(" " + caracter + caracter + caracter + " ");
                System.out.println(caracter + caracter + caracter + caracter + caracter);
                break;

            case "B":
                System.out.println(caracter + caracter + caracter + caracter + caracter);
                System.out.println(" " + caracter + caracter + caracter + " ");
                System.out.println("  " + caracter + "   ");
                break;

            case "D":
                System.out.println(caracter);
                System.out.println(caracter + caracter);
                System.out.println(caracter + caracter + caracter);
                System.out.println(caracter + caracter);
                System.out.println(caracter);
                break;

            case "I":
                System.out.println("  " + caracter);
                System.out.println(" " + caracter + caracter);
                System.out.println(caracter + caracter + caracter);
                System.out.println(" " + caracter + caracter);
                System.out.println("  " + caracter);
                break;

            default:
                System.out.println("Esa posicion no existe");
                break;
        }
    } 
}
