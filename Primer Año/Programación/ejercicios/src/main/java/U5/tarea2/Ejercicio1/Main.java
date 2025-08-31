package U5.tarea2.Ejercicio1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Pila[] p = new PilaTabla[10];

        PilaTabla pilaTabla1 = new PilaTabla(65);
        PilaTabla pilaTabla2 = new PilaTabla(12);
        PilaTabla pilaTabla3 = new PilaTabla(43);
        PilaTabla pilaTabla4 = new PilaTabla(66);
        PilaTabla pilaTabla5 = new PilaTabla(75);
        PilaTabla pilaTabla6 = new PilaTabla(21);
        PilaTabla pilaTabla7 = new PilaTabla(34);
        PilaTabla pilaTabla8 = new PilaTabla(59);
        PilaTabla pilaTabla9 = new PilaTabla(95);
        PilaTabla pilaTabla10 = new PilaTabla(83);

        p[0] = pilaTabla1;
        p[1] = pilaTabla2;
        p[2] = pilaTabla3;
        p[3] = pilaTabla4;
        p[4] = pilaTabla5;
        p[5] = pilaTabla6;
        p[6] = pilaTabla7;
        p[7] = pilaTabla8;
        p[8] = pilaTabla9;
        p[9] = pilaTabla10;

        Arrays.sort(p);
        System.out.println(Arrays.toString(p));

    }
}
