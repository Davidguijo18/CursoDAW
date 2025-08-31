package U5.tarea3.Ejercicio4;

public class Conjunto {
    private int[] elementos;
    private int capacidad;
    private int tamano;

    public Conjunto() {
        this.capacidad = 10;
        this.elementos = new int[capacidad];
        this.tamano = 0;
    }

    public Conjunto(int capacidadInicial) {
        this.capacidad = capacidadInicial;
        this.elementos = new int[capacidad];
        this.tamano = 0;
    }

    public int tamano() {
        return tamano;
    }

    public void insertar(int numero) {
        if (!contiene(numero)) {
            if (tamano == capacidad) {
                capacidad *= 2;
                int[] nuevaTabla = new int[capacidad];
                System.arraycopy(elementos, 0, nuevaTabla, 0, tamano);
                elementos = nuevaTabla;
            }
            elementos[tamano++] = numero;
        }
    }

    public void agregar(Conjunto otroConjunto) {
        for (int i = 0; i < otroConjunto.tamano(); i++) {
            insertar(otroConjunto.elementos[i]);
        }
    }

    public void eliminar(int numero) {
        for (int i = 0; i < tamano; i++) {
            if (elementos[i] == numero) {
                eliminarEnPosicion(i);
                break;
            }
        }
    }

    public void eliminar(Conjunto otroConjunto) {
        for (int i = 0; i < otroConjunto.tamano(); i++) {
            eliminar(otroConjunto.elementos[i]);
        }
    }

    public boolean contiene(int numero) {
        for (int i = 0; i < tamano; i++) {
            if (elementos[i] == numero) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i = 0; i < tamano; i++) {
            sb.append(elementos[i]);
            if (i < tamano - 1) {
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    private void eliminarEnPosicion(int posicion) {
        for (int i = posicion; i < tamano - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        tamano--;
    }
}

