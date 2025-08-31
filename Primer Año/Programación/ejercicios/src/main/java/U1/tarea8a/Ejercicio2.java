package U1.tarea8a;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int edad;
        int cantidadAlumnos = 0;
        int mayoresEdad = 0;
        int sumaEdad = 0;
        int media = 0;

        do {
            System.out.println("Introduce la edad del alumno");
            edad = teclado.nextInt();

            if (edad >= 0) {
                cantidadAlumnos++;
                sumaEdad = edad + sumaEdad;
                media = sumaEdad / cantidadAlumnos;

                if (edad >= 18) {
                    mayoresEdad++;
                }
            }
        } while (edad > 0);

        System.out.println("La suma de todas las edades es: " + sumaEdad);
        System.out.println("La media de edad es: " + media);
        System.out.println("El numero de usuarios que han introcido su edad es: " + cantidadAlumnos);
        System.out.println("La cantidad de alumnos mayores de edad es: " + mayoresEdad);
    }
}
