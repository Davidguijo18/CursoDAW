package U3.tarea2;

import java.sql.SQLOutput;

public class Ejercicio9 {
    public static void main(String[] args) {

        StringBuilder string = new StringBuilder("Alabi Alixar");

        System.out.println("El StringBuilder es " + string);
        System.out.println("Capacidad inicial = " + string.capacity());
        System.out.println("Longitud inicial = " + string.length());
        System.out.println(string.replace(0, string.length(), "Chicharrones"));
        int numChicharrones = 500;
        String hay = "Hay";
        System.out.println((hay.substring(0, 3) + " " + numChicharrones + " " + string));
        System.out.println(string.append("  en Chiclana"));
        String ultimosCaracteres = string.substring(string.length() - 4);
        System.out.println(ultimosCaracteres);
        System.out.println("Capacidad final = " + string.capacity());
        System.out.println("Longitud final = " + string.length());

    }
}
