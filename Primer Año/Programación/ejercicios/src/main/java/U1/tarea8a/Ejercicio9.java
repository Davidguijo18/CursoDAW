package U1.tarea8a;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int altura;
        int alturaMaxima = 0;
        int contadorArbolMaximo = 0;
        int contadorArbol = 1;

        do {
            System.out.println("Introduce la altura del arbol en centimetros");
            altura = teclado.nextInt();

            if (altura != -1) {
                System.out.println("Arbol " + contadorArbol + " ----> " + altura + " cm");
                System.out.println(" ");

                if (altura > alturaMaxima) {
                    alturaMaxima = altura;
                    contadorArbolMaximo = contadorArbol;
                }
            } else {
                System.out.println("Has finalizado el programa");
                break;
            }
            contadorArbol++;

        } while (altura != -1);
        System.out.println("La altura mas alta es la del arbol " + contadorArbolMaximo + " con una altura de " + alturaMaxima + " centimetros");
    }
}