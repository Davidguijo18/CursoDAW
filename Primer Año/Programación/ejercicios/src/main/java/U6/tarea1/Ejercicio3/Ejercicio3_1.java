package U6.tarea1.Ejercicio3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio3_1 {
    public static void main(String[] args) {
        String texto = "";

        try {
            FileReader in = new FileReader("C:\\ficheros\\original.txt");
            int c = in.read();
            while (c != -1) {
                texto += (char) c;
                c = in.read();
            }
            in.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try{
            FileWriter out = new FileWriter("C:\\ficheros\\copia.txt");
            out.write(texto);
            out.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
