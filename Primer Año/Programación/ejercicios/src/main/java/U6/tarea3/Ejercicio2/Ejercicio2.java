package U6.tarea3.Ejercicio2;

import U5.tarea2.Ejercicio2.Cliente;
import U6.tarea3.Ejercicio1.ExcepcionEdad;
import U6.tarea3.Ejercicio1.ExcepcionMenorEdad;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre, dni;
        int edad = 0;
        double saldo;

        System.out.println("Introduce el nombre: ");
        nombre = teclado.nextLine();

        System.out.println("Introduce el dni: ");
        dni = teclado.nextLine();

        try {
            System.out.println("Introduce la edad");
            edad = teclado.nextInt();
            verificarEdad(edad, dni);
            verificarMayorEdad(edad, dni);
        } catch (ExcepcionEdad | ExcepcionMenorEdad ee) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\ficheros\\ficherosexcepciones.txt"))) {
                bw.write(ee.getMessage());
                bw.newLine();
            } catch (IOException e) {
                System.out.println("Error al escribir el fichero");
            }
        }

        System.out.println("Introduce el saldo: ");
        saldo = teclado.nextDouble();

        Cliente cliente = new Cliente(nombre, dni, edad, saldo);
        System.out.println(cliente);
    }

    static void verificarEdad(int edad, String dni) throws ExcepcionEdad {
        LocalDateTime locaDate = LocalDateTime.now();
        LocalDateTime fecha = LocalDateTime.now();
        int horas = locaDate.getHour();
        int minutos = locaDate.getMinute();
        int segundos = locaDate.getSecond();

        if (edad > 100 || edad < 0) {
            String mensaje = fecha.getDayOfMonth() + "/" + fecha.getMonthValue() + "/" + fecha.getYear() + " " + horas + ":" + minutos + ":" + segundos + " - " +
                    "EX001 - ExcepcionEdad: Imposible crear el usuario con dni " + dni + ". La edad no puede ser negativa o mayor de 100 (Edad indicada: " + edad + ")";
            throw new ExcepcionEdad(mensaje);
        }
    }

    static void verificarMayorEdad(int edad, String dni) throws ExcepcionMenorEdad {
        LocalDateTime locaDate = LocalDateTime.now();
        LocalDateTime fecha = LocalDateTime.now();
        int horas = locaDate.getHour();
        int minutos = locaDate.getMinute();
        int segundos = locaDate.getSecond();

        if (edad < 18) {
            String mensaje = fecha.getDayOfMonth() + "/" + fecha.getMonthValue() + "/" + fecha.getYear() + " " + horas + ":" + minutos + ":" + segundos + " - " +
                    "\"EX002 - ExcepcionMenorEdad: Imposible crear el usuario con dni " + dni + " El cliente no  puede ser menor de edad (Edad indicada: " + edad + ")";
            throw new ExcepcionMenorEdad(mensaje);
        }
    }
}
