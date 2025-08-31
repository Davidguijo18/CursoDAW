package U5.EjerciciosRepaso.Examen2021_Turno_Manana;

import java.util.Arrays;

public class Caja {
    private Prendas[] prendas = new Prendas[0];
    private final int MAX_PRENDAS_POR_CAJA = 5;
    private int contador = 0;
    private static int id = 1;

    public Caja() {
        id++;
    }

    public void anadirPrendaCaja(Prendas prenda) {
        if (prendas.length >= MAX_PRENDAS_POR_CAJA) {
            System.out.println("Esta caja ya esta llena");
        } else {
            prendas = Arrays.copyOf(prendas, prendas.length + 1);
            prendas[contador] = prenda;
            contador++;
        }
    }

    public void borrarPrendasCaja(Prendas prenda) {
        int posicion = 0;
        for (int i = 0; i < contador; i++) {
            if (prendas[i].equals(prenda)) {
                posicion = i;
            }
        }
        Prendas[] copia_prenda = Arrays.copyOfRange(prendas, posicion + 1, prendas.length);
        if (prendas.length == contador) {
            prendas = Arrays.copyOf(prendas, prendas.length - 1);
        }
        for (int i = 0; i < copia_prenda.length; i++) {
            prendas[posicion] = copia_prenda[i];
            posicion++;
        }
        contador--;
    }

    @Override
    public String toString() {
        return "Caja{" +
                "prendas=" + Arrays.toString(prendas) +
                '}';
    }
}
