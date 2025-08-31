package U4.tarea2.Ejercicio2;

import java.util.Arrays;

public class PilaTabla {

    private Integer[] pilaTabla;
    private int indice;

    public PilaTabla() {
        pilaTabla = new Integer[0];
    }

    public PilaTabla(Integer capacidad) {
        pilaTabla = new Integer[capacidad];
    }

    public void mostrarPila() {
        for (int i = 0; i < pilaTabla.length; i++) {
            System.out.print(pilaTabla[i] + " ");
        }
    }

    public void apilar(int numero) {
        if (indice >= pilaTabla.length) {
            pilaTabla = Arrays.copyOf(pilaTabla, pilaTabla.length + 1);
        }
        pilaTabla[indice] = numero;
        indice++;
    }

    public void desapilar() {
        pilaTabla = Arrays.copyOf(pilaTabla, pilaTabla.length - 1);
        indice--;
    }

    public Integer cima() {
        return pilaTabla[pilaTabla.length - 1];
    }
}
