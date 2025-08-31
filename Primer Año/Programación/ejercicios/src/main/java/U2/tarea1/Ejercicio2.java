package U2.tarea1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int i, num;

        System.out.println("Introduce un numero");
        num = teclado.nextInt();

        //Modifico el codigo para que se muestren los 10 numeros posteriores de manera correcta
        System.out.println("Mostrando los 10 numeros posteriores del numero" + num);
        i = num + 1;

        //El error es que el simbolo ">" deberia de ser "<", ya si i > num + 10 no entra en el bucle
        while (i < num + 11) {
            System.out.println("Numero posterior " + i);
            i++;
        }
    }
}
