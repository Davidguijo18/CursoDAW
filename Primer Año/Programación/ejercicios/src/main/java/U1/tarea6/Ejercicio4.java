package U1.tarea6;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        byte num1;
        byte num2;
        byte menor;
        int casoSwitch = 0;

        System.out.println("Introduce el primer numero");
        num1 = teclado.nextByte();

        System.out.println("Introduce el segundo numero");
        num2 = teclado.nextByte();

        if (num1 > num2) {
            System.out.println("El primer numero es mayor que el segundo");
            menor = num2;
            casoSwitch = 1;
        } else if (num1 < num2) {
            System.out.println("El segundo numero es mayor que el primero");
            menor = num1;
            casoSwitch = 2;
        } else {
            System.out.println("Los dos numeros son iguales");
            menor = num1;
            casoSwitch = 3;
        }

        switch (casoSwitch) {
            case 1:
                System.out.println("El numero mas pequeño es " + num2);
                break;

            case 2:
                System.out.println("El numero mas pequeño es " + num1);
                break;

            case 3:
                System.out.println("Los numeros iguales son el " + num1);
                break;
        }
    }
}
