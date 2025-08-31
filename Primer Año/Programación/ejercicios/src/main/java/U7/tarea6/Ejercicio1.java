package U7.tarea6;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Map<String, Double> mapa = new HashMap<>();
        String producto;
        double total = 0;

        leerFichero(mapa);
        do {
            System.out.print("Introduce el producto que deseas comprar: ");
            producto = teclado.nextLine();

            if (!producto.equalsIgnoreCase("fin")) {
                System.out.print("Introduce la cantidad de " + producto + " que deseas comprar: ");
                int cantidadProducto = teclado.nextInt();
                teclado.nextLine();

                Double precio = mapa.get(producto);
                if (precio != null) {
                    double subtotal = precio * cantidadProducto;
                    total += subtotal;
                    System.out.println("  Producto   Precio  Cantidad  Subtotal");
                    System.out.println("| " + producto + "\t| " + precio + "\t| " + cantidadProducto + "\t\t| " + subtotal + "\t\t|");
                } else {
                    System.out.println("El producto \"" + producto + "\" no existe en el supermercado.");
                }
            }
        } while (!producto.equalsIgnoreCase("fin"));

        System.out.println("Total: " + total);
    }

    public static void leerFichero(Map<String, Double> mapa) {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\ficheros\\precioSupermecado.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                String producto = partes[0].trim();
                double precio = Double.parseDouble(partes[1].trim());
                mapa.put(producto, precio);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}

