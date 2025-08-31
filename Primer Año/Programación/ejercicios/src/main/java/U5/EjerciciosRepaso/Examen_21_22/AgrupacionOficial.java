package U5.EjerciciosRepaso.Examen_21_22;

import java.util.Arrays;

public abstract class AgrupacionOficial extends Agrupacion {
    private Integrante[] integrantes = new Integrante[0];
    private int contador = 0;


    public abstract void caminito_del_falla();

    public abstract int getPuntos();

    public abstract String getNombre();

    public abstract String getAutor();

    @Override
    public void cantar_la_presentacion() {
    }

    @Override
    public void hacer_tipo() {
    }

    public void insertar_integrante(Integrante integrante) {
        integrantes = Arrays.copyOf(integrantes, integrantes.length + 1);
        integrantes[contador] = integrante;
        contador++;
    }

    public boolean eliminar_integrante(Integrante integrante) {
        int posicion = 0;
        for (int i = 0; i < contador; i++) {
            if (integrantes[i].getNumParticipante() == (integrante.getNumParticipante())) {
                posicion = i;
            }
        }
        Integrante[] copia_lista = Arrays.copyOfRange(integrantes, posicion + 1, integrantes.length);
        if (integrantes.length == contador) {
            integrantes = Arrays.copyOf(integrantes, integrantes.length - 1);
        }
        for (Integrante value : copia_lista) {
            integrantes[posicion] = value;
            posicion++;
        }
        contador--;

        return true;
    }
}
