package U7.tarea3.Ejercicio4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Traductor {
    private static Map<String, String> diccionario = new HashMap<>();

    public Traductor(String archivo) {
        diccionario = new HashMap<>();

        String texto = "";
        try {
            BufferedReader in = new BufferedReader(new FileReader("C:\\ficheros\\" + archivo));
            String linea = in.readLine();
            while (linea != null) {
                texto += linea + "\n";
                String[] partes = linea.split(",");
                diccionario.put(partes[0], partes[1]);
                linea = in.readLine();
            }
            in.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void traduccionPalabra(String palabra) {
        System.out.println("La traduccion de " + palabra + " es: " + diccionario.get(palabra));
    }
}
