package U5.tarea1.Ejercicio5;

import java.util.Arrays;

public abstract class Instrumento {
    public enum Notas {
        DO, RE, MI, FA, SOL, LA, SI
    }

    protected Notas[] notasMusicales;
    protected int contador;

    public Instrumento() {
        notasMusicales = new Notas[100];
        contador = 0;
    }

    public void add(Notas notas) {
        notasMusicales[contador] = notas;
        contador++;
    }

    public abstract void interpretar();
}

