package U6.tarea2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero con decimales: ");
        double numero = teclado.nextDouble();

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\ficheros\\ficherodouble.bin"))) {
            oos.writeDouble(numero);
            oos.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
