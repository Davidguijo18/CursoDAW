package U7.tarea5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;

        IntroducirAspirantes introducirAspirantes = new IntroducirAspirantes();
        CalificacionPruebas calificacionPruebas = new CalificacionPruebas();
        Aprobados aprobados = new Aprobados();

        System.out.println("--- MENU PRINCIPAL ---");
        System.out.println("1 - Introducir datos de aspirantes");
        System.out.println("2 - Calificar prueba");
        System.out.println("3 - Aprobados");
        System.out.println("4 - Salir");
        do {
            System.out.print("Introduce una opcion: ");
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    introducirAspirantes.insertarAspirante();
                    introducirAspirantes.guardarFicheros();
                    break;

                case 2:
                    calificacionPruebas.introducirNotas();
                    calificacionPruebas.guardarFichero();
                    break;

                case 3:
                    aprobados.cargarDatos();
                    aprobados.calcularCalificacionesMedias();
                    aprobados.generarInforme();
                    break;

                case 4:
                    System.out.println("\nFinalizaste el programa");
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        }while (opcion !=4);
    }
}
