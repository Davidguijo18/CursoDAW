package U1.tarea5b;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int mes;
        int dia;

        System.out.println("Introduzca su dia de nacimento");
        dia = teclado.nextInt();

        System.out.println("Introduzca su mes de nacimiento de forma numerica");
        mes = teclado.nextInt();

        if (dia > 31 || dia < 0 && mes > 12 || mes < 0) {

            System.out.println("El dia o mes introducido no existe");

        } else {

            switch (mes) {
                case 1:
                    if (dia < 21) {
                        System.out.println("Tu signo del zodiaco es Capricornio");
                    } else {
                        System.out.println("Tu signo del zodiaco es Acuario");
                    }
                    break;

                case 2:
                    if (dia < 20) {
                        System.out.println("Tu signo del zodiaco es Acuario");
                    } else {
                        System.out.println("Tu signo del zodiaco es Piscis");
                    }
                    break;

                case 3:
                    if (dia < 21) {
                        System.out.println("Tu signo del zodiaco es Piscis");
                    } else {
                        System.out.println("Tu signo del zodiaco es Aries");
                    }
                    break;

                case 4:
                    if (dia < 21) {
                        System.out.println("Tu signo del zodiaco es Aries");
                    } else {
                        System.out.println("Tu signo del zodiaco es Tauro");
                    }
                    break;

                case 5:
                    if (dia < 20) {
                        System.out.println("Tu signo del zodiaco es Tauro");
                    } else {
                        System.out.println("Tu signo del zodiaco es Geminis");
                    }
                    break;

                case 6:
                    if (dia < 22) {
                        System.out.println("Tu signo del zodiaco es Geminis");
                    } else {
                        System.out.println("Tu signo del zodiaco es Cancer");
                    }
                    break;

                case 7:
                    if (dia < 22) {
                        System.out.println("Tu signo del zodiaco es Cancer");
                    } else {
                        System.out.println("Tu signo del zodiaco es Leo");
                    }
                    break;

                case 8:
                    if (dia < 24) {
                        System.out.println("Tu signo del zodiaco es Leo");
                    } else {
                        System.out.println("Tu signo del zodiaco es Virgo");
                    }
                    break;

                case 9:
                    if (dia < 23) {
                        System.out.println("Tu signo del zodiaco es Virgo");
                    } else {
                        System.out.println("Tu signo del zodiaco es Libra");
                    }
                    break;

                case 10:
                    if (dia < 23) {
                        System.out.println("Tu signo del zodiaco es Libra");
                    } else {
                        System.out.println("Tu signo del zodiaco es Escorpio");
                    }
                    break;

                case 11:
                    if (dia < 23) {
                        System.out.println("Tu signo del zodiaco es Escorpio");
                    } else {
                        System.out.println("Tu signo del zodiaco es Sagitario");
                    }
                    break;

                case 12:
                    if (dia < 21) {
                        System.out.println("Tu signo del zodiaco es Sagitario");
                    } else {
                        System.out.println("Tu signo del zodiaco es Capricornio");
                    }
                    break;

                default:
                    System.out.println("Error. Mes incorrecto");
                    break;
            }
        }
    }
}
