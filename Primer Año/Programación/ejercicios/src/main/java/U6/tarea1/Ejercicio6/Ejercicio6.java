package U6.tarea1.Ejercicio6;

import java.io.*;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        String texto = "";

        System.out.println("----  MENU PRINCIPAL  ----");
        System.out.println("1 - Mostrar libro de firmas");
        System.out.println("2 - Insertar nombre");
        System.out.println("3 - Salir");


        do {
            System.out.println("Introduce una opcion: ");
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    texto = "";
                    try {
                        BufferedReader in = new BufferedReader(new FileReader("C:\\ficheros\\firmas.txt"));
                        String linea = in.readLine();
                        while (linea != null) {
                            texto += linea;
                            linea = in.readLine();
                        }
                        in.close();
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println(texto);
                    break;

                case 2:
                    texto = "";
                    try {
                        BufferedReader in = new BufferedReader(new FileReader("C:\\ficheros\\firmas.txt"));
                        String linea = in.readLine();
                        while (linea != null) {
                            texto += linea;
                            linea = in.readLine();
                        }
                        in.close();
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }

                    System.out.println("Introduce un nombre: ");
                    String nombre = teclado.nextLine();

                    try {
                        BufferedWriter out = new BufferedWriter(new FileWriter("C:\\ficheros\\firmas.txt"));
                        out.write(texto);
                        out.newLine();
                        out.write(nombre);
                        out.close();
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    System.out.println("Has finalizado el programa");
                    break;

                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (opcion != 3);
    }
}
