package U1.Examen;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        long num_final = sc.nextLong();
        int salto = 0;

        do {
            System.out.println("Introduzca el salto: ");
            salto = sc.nextInt();
        } while (salto < 0 || salto > 2);

        long cociente = num_final;
        long invertido = 0;

        // Primeramente invertimos el número
        while (cociente != 0) {
            invertido = invertido * 10 + cociente % 10;
            cociente = cociente / 10;
        }

        num_final = 0;
        int contador = 0;

        // Luego, vamos a ir sacando las cifras por el final,
        // ...y dando saltos según corresponda.
        while (invertido != 0) {
            if (contador == 0) {
                num_final = num_final * 10 + invertido % 10;
                contador = salto;
            } else {
                contador--;
            }
            invertido = invertido / 10;
        }

        System.out.println("Resultado = " + num_final);
    }
}
