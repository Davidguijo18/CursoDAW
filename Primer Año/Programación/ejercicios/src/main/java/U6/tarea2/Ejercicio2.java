package U6.tarea2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ejercicio2 {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\ficheros\\ficherodouble.bin"))){
            double numero = ois.readDouble();
            System.out.println(numero);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
