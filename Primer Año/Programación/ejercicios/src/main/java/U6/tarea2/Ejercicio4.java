package U6.tarea2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero n: ");
        int n = teclado.nextInt();

        double[] array = new double[n];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce el numero" + i + 1 + ": ");
            double numero = teclado.nextDouble();
            array[i] = numero;
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\ficheros\\arratDoubles.bin"))) {

            oos.writeObject(array);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
