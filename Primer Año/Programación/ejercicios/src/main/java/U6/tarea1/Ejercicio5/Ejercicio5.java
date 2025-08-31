package U6.tarea1.Ejercicio5;

import java.io.*;
import java.util.Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {

        String texto = "";

        //Leo el fichero
        try {
            BufferedReader in = new BufferedReader(new FileReader("C:\\ficheros\\numeros.txt"));
            String linea = in.readLine();
            while (linea != null) {
                texto += linea;
                linea = in.readLine();
            }
            in.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Numeros sin ordenar: " + texto);

        //Creo un array con los numeros del fichero y lo ordeno
        int[] array = new int[texto.length()];
        for (int i = 0; i < texto.length(); i++) {
            array[i] = texto.charAt(i) - 48;
        }
        Arrays.sort(array);
        System.out.println("Numeros ordenados: " + Arrays.toString(array));


        //Reescribo el fichero con los numeros ya ordenados
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("C:\\ficheros\\numeros.txt"));
            for (int i = 0; i < array.length; i++) {
                out.write(array[i] + "\n");
            }
            out.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
