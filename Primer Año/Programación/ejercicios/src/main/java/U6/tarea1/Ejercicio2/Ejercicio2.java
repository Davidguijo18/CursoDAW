package U6.tarea1.Ejercicio2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = teclado.nextLine();

        System.out.print("\nIntroduce tu edad: ");
        int edad = teclado.nextInt();

        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("C:\\ficheros\\datos.txt"));
            out.write("NOMBRE ---> " + nombre);
            out.newLine();
            out.write("EDAD ---> " + edad);
            out.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
