package U5.tarea2.Ejercicio1;

import U5.tarea2.Ejercicio2.Cliente;

import java.util.Arrays;

public class PilaTabla implements Pila, Comparable {

    private Integer[] pilaTabla;
    private int indice;

    public PilaTabla() {
        pilaTabla = new Integer[0];
    }

    public PilaTabla(int indice) {
        this.indice = indice;
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

    @Override
    public int compareTo(Object o) {
        if (this == o || o == null) return 0;
        PilaTabla pt = (PilaTabla) o;
        if (this.indice > pt.indice) {
            return 1;
        } else if (this.indice < pt.indice) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "indice=" + indice;
    }
}
