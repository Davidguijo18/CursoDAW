package U6.tarea2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ejercicio5 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\ficheros\\arratDoubles.bin"))) {
            double[] numeros = (double[]) ois.readObject();

            System.out.print("Array: ");
            for (double numero : numeros) {
                System.out.print(numero + " ");
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
