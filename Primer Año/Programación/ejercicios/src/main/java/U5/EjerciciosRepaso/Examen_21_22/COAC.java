package U5.EjerciciosRepaso.Examen_21_22;

import java.util.Arrays;

public class COAC {
    private int contador = 0;
    private AgrupacionOficial[] agrupacion = new AgrupacionOficial[0];


    public void inscribir_agrupacion(AgrupacionOficial agrupacionOficial) {
        agrupacion = Arrays.copyOf(agrupacion, agrupacion.length + 1);
        agrupacion[contador] = agrupacionOficial;
        contador++;
    }

    public boolean eliminar_agrupacion(AgrupacionOficial agrupacion) {
        for (int i = 0; i < contador; i++) {
            if (this.agrupacion[i].equals(agrupacion)) {
                for (int j = i; j < contador - 1; j++) {
                    this.agrupacion[j] = this.agrupacion[j + 1];
                }
                this.agrupacion[contador - 1] = null;
                contador--;
                return true;
            }
        }
        return false;
    }

    public void mostrarAgrupaciones() {
        for (AgrupacionOficial agrupacion : this.agrupacion) {
            System.out.println(agrupacion.getNombre());
        }
    }

    public int numeroAgrupacionesOficiales() {
        return agrupacion.length;
    }

    public void ordenar_por_puntos() {
        Arrays.sort(agrupacion, new OrdenarPorPuntos());
    }

    public void ordenar_por_nombre() {
        Arrays.sort(agrupacion, new OrdenarPorNombre());
    }

    public void ordenar_por_autor() {
        Arrays.sort(agrupacion, new OrdenarPorAutor());
    }
}
