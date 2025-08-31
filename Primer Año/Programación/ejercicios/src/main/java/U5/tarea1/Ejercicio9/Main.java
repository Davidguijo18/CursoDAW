package U5.tarea1.Ejercicio9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Electrodomestico[] electrodomesticos = new Electrodomestico[10];

        electrodomesticos[0] = new Television(1200, Electrodomestico.Color.NEGRO, Electrodomestico.ConsumoEnergetico.C, 10, false, 50.2);
        electrodomesticos[1] = new Television(4000, Electrodomestico.Color.BLANCO, Electrodomestico.ConsumoEnergetico.A, 25, true, 70.5);
        electrodomesticos[2] = new Electrodomestico(300, Electrodomestico.Color.GRIS, Electrodomestico.ConsumoEnergetico.D, 6);
        electrodomesticos[3] = new Electrodomestico(150, Electrodomestico.Color.NEGRO, Electrodomestico.ConsumoEnergetico.B, 9);
        electrodomesticos[4] = new Lavadora(300, Electrodomestico.Color.GRIS, Electrodomestico.ConsumoEnergetico.C, 20, 14);
        electrodomesticos[5] = new Lavadora(700, Electrodomestico.Color.NEGRO, Electrodomestico.ConsumoEnergetico.A, 25, 17);
        electrodomesticos[6] = new Lavadora(200, Electrodomestico.Color.BLANCO, Electrodomestico.ConsumoEnergetico.C, 20, 10);
        electrodomesticos[7] = new Television(280, Electrodomestico.Color.NEGRO, Electrodomestico.ConsumoEnergetico.F, 10, true, 40);
        electrodomesticos[8] = new Electrodomestico(12000, Electrodomestico.Color.NEGRO, Electrodomestico.ConsumoEnergetico.A, 30);
        electrodomesticos[9] = new Electrodomestico();

        System.out.println(Arrays.toString(electrodomesticos));

        Lavadora[] lavadoras = new Lavadora[4];
        lavadoras[0] = new Lavadora(500, Electrodomestico.Color.NEGRO, Electrodomestico.ConsumoEnergetico.B, 10, 15);
        lavadoras[1] = new Lavadora(390, Electrodomestico.Color.AZUL, Electrodomestico.ConsumoEnergetico.D, 10, 9);
        lavadoras[2] = new Lavadora(1200, Electrodomestico.Color.BLANCO, Electrodomestico.ConsumoEnergetico.A, 25, 20);
        lavadoras[3] = new Lavadora(534, Electrodomestico.Color.AZUL, Electrodomestico.ConsumoEnergetico.B, 12);

        Arrays.sort(lavadoras);
        System.out.println(Arrays.toString(lavadoras));

        Arrays.sort(lavadoras, new CompararPrecioFinalLavadora());
        System.out.println(Arrays.toString(lavadoras));
    }
}
