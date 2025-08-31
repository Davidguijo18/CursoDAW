package U5.EjerciciosRepaso.Examen_21_22_RehacerRepaso;

import U5.Entregable.Pais;

import java.util.Arrays;

public abstract class AgrupacionOficial extends Agrupacion {

    private int contador;
    private Integrante[] integrantes = new Integrante[0];


    @Override
    public void cantar_la_presentacion() {
    }

    @Override
    public void hacer_tipo() {
    }

    public abstract void caminito_del_falla();

    public abstract int getPuntosObtenidos();

    public abstract String getNombre();

    public abstract String getAutor();

    public void insertar_integrante(Integrante integrante) {
        integrantes = Arrays.copyOf(integrantes, integrantes.length + 1);
        integrantes[contador] = integrante;
        contador++;
    }

    public void eliminar_integrante(Integrante integrante) {
        int posicion = 0;
        for (int i = 0; i < contador; i++) {
            if (integrantes[i].getNumParticipante() == integrante.getNumParticipante()) {
                posicion = i;
            }
        }
        Integrante[] copia_integrante = Arrays.copyOfRange(integrantes, posicion + 1, integrantes.length);
        if (integrantes.length == contador) {
            integrantes = Arrays.copyOf(integrantes, integrantes.length - 1);
        }
        for (int i = 0; i < copia_integrante.length; i++) {
            integrantes[posicion] = copia_integrante[i];
            posicion++;
        }
        contador--;
    }

    @Override
    public String toString() {
        return "AgrupacionOficial{" +
                "integrantes=" + Arrays.toString(integrantes) +
                '}';
    }
}
