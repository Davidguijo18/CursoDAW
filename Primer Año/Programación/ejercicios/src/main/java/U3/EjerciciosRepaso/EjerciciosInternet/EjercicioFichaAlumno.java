package U3.EjerciciosRepaso.EjerciciosInternet;

import java.util.Scanner;

public class EjercicioFichaAlumno {
    public static void main(String[] args) {

        int[] notas = new int[10];
        String[] alumnos = new String[10];

        rellenarAlumnos(alumnos);
        System.out.println();
        rellenarNotas(notas);
        String[] rellenarNotasPalabras = rellenarNotasPalabras(notas);

        String[] arrayFinal = rellenarFichas(notas, alumnos, rellenarNotasPalabras);
        System.out.println("El listado de alumnos es: ");
        System.out.println("Nombre | Nota| Resultado");
        for (int i = 0; i < arrayFinal.length; i++) {
            System.out.println(arrayFinal[i]);
        }


    }

    public static void rellenarAlumnos(String[] array) {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            int alumno = i + 1;

            System.out.print("Introduce el nombre del alumno " + alumno + " : ");
            array[i] = teclado.nextLine();
        }
    }

    public static void rellenarNotas(int[] array) {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            int alumno = i + 1;

            do {
                System.out.println("Recuerde: debe de insertar una nota valida");
                System.out.print("Introduce la nota del alumno " + alumno + " : ");
                array[i] = teclado.nextInt();

            } while (array[i] < 0 || array[i] > 10);
        }
    }

    public static String[] rellenarNotasPalabras(int[] array) {
        String[] arrayLetras = new String[10];
        for (int i = 0; i < array.length; i++) {

            if (array[i] < 5) {
                arrayLetras[i] = "Suspenso";
            } else if (array[i] == 5) {
                arrayLetras[i] = "Suficiente";
            } else if (array[i] == 6) {
                arrayLetras[i] = "Bien";
            } else if (array[i] >= 7 && array[i] <= 8) {
                arrayLetras[i] = "Notable";
            } else if (array[i] >= 9) {
                arrayLetras[i] = "Sobresaliente";
            }
        }
        return arrayLetras;
    }

    public static String[] rellenarFichas(int[] notas, String[] alumnos, String[] letras) {
        String[] arrayFinal = new String[10];

        for (int i = 0; i < notas.length; i++) {
            arrayFinal[i] = alumnos[i] + " | " + notas[i] + " | " + letras[i];
        }

        return arrayFinal;
    }
}
