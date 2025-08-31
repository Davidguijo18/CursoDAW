package U7.tarea6;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//HECHO CON CHATGPT
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Map<String, Double> mapa = new HashMap<>();
        Map<String, Integer> carrito = new HashMap<>();
        String producto;
        double total = 0;

        leerFichero(mapa);
        do {
            System.out.print("Introduce el producto que deseas comprar (o 'fin' para salir): ");
            producto = teclado.nextLine();

            if (!producto.equalsIgnoreCase("fin")) {
                System.out.print("Introduce la cantidad de " + producto + " que deseas comprar: ");
                int cantidadProducto = teclado.nextInt();
                teclado.nextLine();

                if (mapa.containsKey(producto)) {
                    if (carrito.containsKey(producto)) {
                        carrito.put(producto, carrito.get(producto) + cantidadProducto);
                    } else {
                        carrito.put(producto, cantidadProducto);
                    }
                } else {
                    System.out.println("El producto \"" + producto + "\" no existe en el supermercado.");
                }
            }
        } while (!producto.equalsIgnoreCase("fin"));

        System.out.print("Introduzca código de descuento (INTRO si no tiene ninguno): ");
        String codigoDescuento = teclado.nextLine();

        for (String prod : carrito.keySet()) {
            int cantidad = carrito.get(prod);
            double precioUnitario = mapa.get(prod);
            total += precioUnitario * cantidad;
            System.out.println("Producto: " + prod);
            System.out.println("Cantidad: " + cantidad);
        }

        if (codigoDescuento.equals("ECODTO")) {
            total *= 0.9;
        }

        System.out.println("\n| Producto    | Precio      | Cantidad | Subtotal |");
        System.out.println("| ----------- | ----------- | -------- | -------- |");
        for (String prod : carrito.keySet()) {
            int cantidad = carrito.get(prod);
            double precioUnitario = mapa.get(prod);
            double subtotal = precioUnitario * cantidad;
            System.out.printf("| %-12s| %-12.2f| %-9d| %-9.2f|\n", prod, precioUnitario, cantidad, subtotal);
        }
        System.out.println("---------------------------------------------------");
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

