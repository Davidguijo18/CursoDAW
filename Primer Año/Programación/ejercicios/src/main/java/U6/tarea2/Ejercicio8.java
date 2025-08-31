package U6.tarea2;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la longitud de la tabla: ");
        int longitud = teclado.nextInt();

        int[] tabla = new int[longitud];
        rellenarTabla(tabla);
        Arrays.sort(tabla);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\ficheros\\arrayOrdenado.bin"))) {
            oos.writeObject(tabla);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\ficheros\\arrayOrdenado.bin"))) {
            int[] array = (int[]) ois.readObject();

            System.out.println("Contenido del array: ");
            for (int i : array) {
                System.out.print(i + " ");
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }


    public static void rellenarTabla(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }

}
