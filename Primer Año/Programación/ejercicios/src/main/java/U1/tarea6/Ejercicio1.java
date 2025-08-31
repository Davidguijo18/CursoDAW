package U1.tarea6;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.println("Introduce el numero del mes correspodiente");
        numero = teclado.nextInt();

        switch (numero) {
            case 1:
                System.out.println("El mes introducido es Enero");
                break;

            case 2:
                System.out.println("El mes introducido es Febrero");
                break;

            case 3:
                System.out.println("El mes introducido es Marzo");
                break;

            case 4:
                System.out.println("El mes introducido es Abril");
                break;

            case 5:
                System.out.println("El mes introducido es Mayo");
                break;

            case 6:
                System.out.println("El mes introducido es Junio");
                break;

            case 7:
                System.out.println("El mes introducido es Julio");
                break;

            case 8:
                System.out.println("El mes introducido es Agosto");
                break;

            case 9:
                System.out.println("El mes introducido es Septiembre");
                break;

            case 10:
                System.out.println("El mes introducido es Octubre");
                break;

            case 11:
                System.out.println("El mes introducido es Noviembre");
                break;

            case 12:
                System.out.println("El mes introducido es Diciembre");
                break;

            default:
                System.out.println("El numero introducido no corresponde a ningun mes");
                break;
        }
    }
}
