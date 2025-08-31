package U6.tarea2;

import java.io.*;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introduce un numero: ");
            numero = teclado.nextInt();

            if (numero > 0) {
                try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\ficheros\\enterospositivos.bin",true))) {
                    oos.writeInt(numero);
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        } while (numero > 0);

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\ficheros\\enterospositivos.bin"))){
            while (true){
                System.out.println("Los numeros del fichero son: "+ois.readInt());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
