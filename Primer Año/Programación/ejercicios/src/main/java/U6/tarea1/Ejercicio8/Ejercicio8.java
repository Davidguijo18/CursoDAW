package U6.tarea1.Ejercicio8;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Ejercicio8 {
    public static void main(String[] args) {
        String texto = "";
        String texto2 = "";
        int contadorNombres = 0;
        String[] arrayNombres = new String[6];

        try {
            BufferedReader in = new BufferedReader(new FileReader("C:\\ficheros\\perso1.txt"));
            String linea = in.readLine();
            while (linea != null) {
                texto += linea;

                arrayNombres[contadorNombres] = linea;
                contadorNombres++;
                linea = in.readLine();
            }
            in.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fichero perso1: " + texto);

        try {
            BufferedReader in = new BufferedReader(new FileReader("C:\\ficheros\\perso2.txt"));
            String linea = in.readLine();
            while (linea != null) {
                texto2 += linea;

                arrayNombres[contadorNombres] = linea;
                contadorNombres++;
                linea = in.readLine();

            }
            in.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Fichero perso2: " + texto2);

        System.out.println("Array inicial: " + Arrays.toString(arrayNombres));
        Arrays.sort(arrayNombres);
        System.out.println("Array ordenado: " + Arrays.toString(arrayNombres));

        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("C:\\ficheros\\todos.txt"));
            for (int i = 0; i < arrayNombres.length;i++){
                out.write(arrayNombres[i]);
                out.newLine();
            }
            out.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
