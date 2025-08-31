package U5.EjerciciosRepaso.Examen_21_22_RehacerRepaso;

import java.util.Arrays;

public class COAC {

    private int contador = 0;
    private AgrupacionOficial[] agrupacionOficials = new AgrupacionOficial[0];

    public void inscribir_agrupacion(AgrupacionOficial agrupacionOficial) {
        agrupacionOficials = Arrays.copyOf(agrupacionOficials, agrupacionOficials.length + 1);
        agrupacionOficials[contador] = agrupacionOficial;
        contador++;
    }

    public void eliminar_agrupacion(AgrupacionOficial agrupacionOficial) {
        int posicion = 0;
        for (int i = 0; i < contador; i++) {
            if (agrupacionOficials[i].equals(agrupacionOficial)) {
                posicion = i;
            }
        }
        AgrupacionOficial[] copia_agrupacionOficial = Arrays.copyOfRange(agrupacionOficials, posicion + 1, agrupacionOficials.length);
        if (agrupacionOficials.length == contador) {
            agrupacionOficials = Arrays.copyOf(agrupacionOficials, agrupacionOficials.length - 1);
        }
        for (int i = 0; i < copia_agrupacionOficial.length; i++) {
            agrupacionOficials[posicion] = copia_agrupacionOficial[i];
            posicion++;
        }
        contador--;
    }

    public void ordenar_por_puntos() {
        Arrays.sort(agrupacionOficials, new OrdenarPorPuntos());
        System.out.println(Arrays.toString(agrupacionOficials));
    }

    public void ordenar_por_nombre() {
        Arrays.sort(agrupacionOficials, new OrdenarPorNombre());
        System.out.println(Arrays.toString(agrupacionOficials));
    }

    public void ordenar_por_autor() {
        Arrays.sort(agrupacionOficials, new OrdenarPorAutor());
        System.out.println(Arrays.toString(agrupacionOficials));
    }
}
