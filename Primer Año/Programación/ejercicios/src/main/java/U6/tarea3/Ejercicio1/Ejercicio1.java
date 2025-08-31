package U6.tarea3.Ejercicio1;

import U5.tarea2.Ejercicio2.Cliente;

import java.util.Scanner;

public class Ejercicio1 {
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
            verificarEdad(edad);
            verificarMayorEdad(edad);
        } catch (ExcepcionEdad | ExcepcionMenorEdad ee) {
            System.out.println(ee.getMessage());
        }

        System.out.println("Introduce el saldo: ");
        saldo = teclado.nextDouble();

        Cliente cliente = new Cliente(nombre, dni, edad, saldo);
        System.out.println(cliente);
    }


    static void verificarEdad(int edad) throws ExcepcionEdad {
        if (edad > 100 || edad < 0) {
            throw new ExcepcionEdad("La edad no puede ser mayor de 100 o edad negativa");
        }
    }

    static void verificarMayorEdad(int edad) throws ExcepcionMenorEdad{
        if (edad < 18){
            throw new ExcepcionMenorEdad("El usuario que has introducido es menor de edad");
        }
    }
}
