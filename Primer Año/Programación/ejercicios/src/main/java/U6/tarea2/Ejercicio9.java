package U6.tarea2;

import U4.tarea1.Ejercicio9.Maquinaria.Tren;

import java.io.*;

public class Ejercicio9 {
    public static void main(String[] args) {

        Tren tren1 = new Tren();
        Tren tren2 = new Tren();
        Tren tren3 = new Tren();
        Tren tren4 = new Tren();

        Tren[] trenes = {tren1, tren2, tren3, tren4};

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\ficheros\\trenes.bin"))) {
            for (Tren tren : trenes) {
                oos.writeObject(tren);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\ficheros\\trenes.bin"))) {
            System.out.println("Trenes: ");
            Object obj;
            while ((obj = ois.readObject()) != null) {
                if (obj instanceof Tren) {
                    System.out.println(obj);
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
