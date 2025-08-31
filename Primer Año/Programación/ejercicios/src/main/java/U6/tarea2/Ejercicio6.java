package U6.tarea2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ejercicio6 {
    public static void main(String[] args) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\ficheros\\numerosdoubles.bin"))) {
            System.out.println("Leo archivo:");
            while (true) {
                double numero = ois.readDouble();
                System.out.println(numero);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}