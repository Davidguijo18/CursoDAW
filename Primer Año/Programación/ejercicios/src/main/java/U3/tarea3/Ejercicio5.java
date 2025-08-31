package U3.tarea3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] primerArray = new int[6];
        int[] segundoArray = new int[6];
        int[] tercerArray = new int[12];

        for (int i = 0; i < primerArray.length; i++) {
            System.out.print("Introduce un numero del primer array: ");
            primerArray[i] = teclado.nextInt();
        }

        for (int i = 0; i < segundoArray.length; i++) {
            System.out.print("Introduce un numero del segundo array: ");
            segundoArray[i] = teclado.nextInt();
        }

        Arrays.sort(primerArray);
        Arrays.sort(segundoArray);

        System.out.print("\nEl contenido del primer array ordenado es: ");
        for (int i = 0; i < primerArray.length; i++) {
            System.out.print(primerArray[i] + " ");
        }

        System.out.println();

        System.out.print("\nEl contenido del segundo array ordenado es: ");
        for (int i = 0; i < segundoArray.length; i++) {
            System.out.print(segundoArray[i] + " ");
        }

        int i = 0;
        int j = 0;
        int k = 0;
        
        while (i < primerArray.length && j < segundoArray.length) {
            if (primerArray[i] < segundoArray[j]) {
                tercerArray[k++] = primerArray[i++];
            } else {
                tercerArray[k++] = segundoArray[j++];
            }
        }

        while (i < primerArray.length) {
            tercerArray[k++] = primerArray[i++];
        }

        while (j < segundoArray.length) {
            tercerArray[k++] = segundoArray[j++];
        }

        System.out.println();

        System.out.print("\nEl contenido del tercer array fusionado y ordenado es: ");
        for (int t = 0; t < tercerArray.length; t++) {
            System.out.print(tercerArray[t] + " ");
        }
    }
}
