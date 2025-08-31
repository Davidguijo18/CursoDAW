package U5.tarea3.Ejercicio1;

import java.util.Random;

public class Numero {
    private int valor;

    public Numero(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public static Numero generarNumeroAleatorio() {
        Random random = new Random();
        return new Numero(random.nextInt(100) + 1);
    }

    @Override
    public String toString() {
        return Integer.toString(valor);
    }
}
