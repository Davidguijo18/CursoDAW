package U5.EjerciciosRepaso.Entregable_2122_Manana;

import java.util.Arrays;

public class Registro {
    private int contador = 0;
    private Propiedad[] propiedades = new Propiedad[0];

    public void anadirPropiedad(Propiedad propiedad) {
        propiedades = Arrays.copyOf(propiedades, propiedades.length + 1);
        propiedades[contador] = propiedad;
        contador++;
    }


    public void eliminarPropiedad(Propiedad propiedad) {
        int posicion = 0;
        for (int i = 0; i < propiedades.length; i++) {
            if (propiedades[i].equals(propiedad)) {
                posicion = i;
            }
        }
        Propiedad[] copia_propiedad = Arrays.copyOfRange(propiedades, posicion + 1, propiedades.length);
        if (propiedades.length == contador) {
            propiedades = Arrays.copyOf(propiedades, propiedades.length - 1);
        }
        for (int i = 0; i < copia_propiedad.length; i++) {
            propiedades[posicion] = copia_propiedad[i];
            posicion++;
        }
        contador--;
    }

    public void informeSuperficie() {
        Arrays.sort(propiedades, new OrdenarPorSuperficie());
        System.out.println(Arrays.toString(propiedades));
    }

    public void informeAntiguedad() {
        Arrays.sort(propiedades, new OrdenarPorAntiguedad());
        System.out.println(Arrays.toString(propiedades));
    }
}
