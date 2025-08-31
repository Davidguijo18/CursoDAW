package U5.tarea3.Ejercicio2;

public class ColaTabla {
    private final int capacidad;
    private final Integer[] tabla;
    private int primero;
    private int ultimo;
    private int tamano;

    public ColaTabla(int capacidad) {
        this.capacidad = capacidad;
        this.tabla = new Integer[capacidad];
        this.primero = 0;
        this.ultimo = -1;
        this.tamano = 0;
    }

    public boolean estaVacia() {
        return tamano == 0;
    }

    public boolean estaLlena() {
        return tamano == capacidad;
    }

    public void encolar(Integer elemento) {
        if (estaLlena()) {
            System.out.println("La cola está llena. No se puede encolar más elementos.");
            return;
        }
        ultimo = (ultimo + 1) % capacidad;
        tabla[ultimo] = elemento;
        tamano++;
    }

    public Integer desencolar() {
        if (estaVacia()) {
            System.out.println("La cola está vacía. No se puede desencolar ningún elemento.");
            return null;
        }
        Integer elementoDesencolado = tabla[primero];
        tabla[primero] = null;
        primero = (primero + 1) % capacidad;
        tamano--;
        return elementoDesencolado;
    }

    public Integer primero() {
        if (estaVacia()) {
            System.out.println("La cola está vacía. No hay un primer elemento.");
            return null;
        }
        return tabla[primero];
    }

    public Integer ultimo() {
        if (estaVacia()) {
            System.out.println("La cola está vacía. No hay un último elemento.");
            return null;
        }
        return tabla[ultimo];
    }

    public int tamano() {
        return tamano;
    }
}
