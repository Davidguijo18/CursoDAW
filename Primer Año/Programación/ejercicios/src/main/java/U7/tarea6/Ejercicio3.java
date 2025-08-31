package U7.tarea6;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Map<String, String> listaPaises = new HashMap<>();
        String pais;

        do {
            System.out.print("Introduce un pais y te dire su capital: ");
            pais = teclado.nextLine().toLowerCase();

            leerFichero(listaPaises);

            if (listaPaises.containsKey(pais)) {
                System.out.println("La capital de " + pais + " es " + listaPaises.get(pais));
            } else {
                System.out.print("No conozco la respuesta. Cual es la capital de " + pais + "? : ");
                String capital = teclado.nextLine().toLowerCase();
                anadirCapitales(pais, capital);
            }

        } while (!pais.equalsIgnoreCase("salir"));
    }

    public static void leerFichero(Map<String, String> mapa) {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\ficheros\\capitales.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                String pais = partes[0].trim();
                String capital = partes[1].trim();
                mapa.put(pais, capital);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void anadirCapitales(String pais, String capital) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\ficheros\\capitales.txt", true))) {
            bw.newLine();
            bw.write(pais.concat("," + capital));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
