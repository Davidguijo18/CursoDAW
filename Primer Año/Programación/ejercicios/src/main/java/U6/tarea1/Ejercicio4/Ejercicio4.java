package U6.tarea1.Ejercicio4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio4 {
    public static void main(String[] args) throws FileNotFoundException {
        String texto = "";
        int contadorLineas = 0;
        int contadorPalaras = 0;
        try {
            BufferedReader in = new BufferedReader(new FileReader("C:\\ficheros\\carta.txt"));
            String linea = in.readLine();
            while (linea != null) {
                texto += linea + "\n";
                linea = in.readLine();
                contadorLineas++;
            }
            in.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == ' ') {
                contadorPalaras++;
            }
        }

        System.out.println(texto);
        System.out.println("Lineas --> " + contadorLineas);
        System.out.println("Palabras --> " + contadorPalaras);
        System.out.println("Caracteres --> " + texto.length());
    }
}

