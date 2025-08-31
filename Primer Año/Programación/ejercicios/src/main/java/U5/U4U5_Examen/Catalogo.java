package U5.U4U5_Examen;

import java.util.Arrays;

public class Catalogo {
    private Multimedia[] multimedias = new Multimedia[0];
    private int contador = 0;

    //Metodo para anadir elementos multimedia
    public void add_multimedia(Multimedia elemento) {
        multimedias = Arrays.copyOf(multimedias, multimedias.length + 1);
        multimedias[contador] = elemento;
        contador++;
    }

    //Este metodo se encarga de eliminar elementos multimedia
    public boolean eliminar_multimedia(Multimedia elemento) {
        int controlador = 0;
        int posicion = 0;
        for (int i = 0; i < contador; i++) {
            if (multimedias[i].equals(elemento)) {
                posicion = i;
                controlador = 2;
            }
        }
        Multimedia[] copia_multimedia = Arrays.copyOfRange(multimedias, posicion + 1, multimedias.length);
        if (multimedias.length == contador) {
            multimedias = Arrays.copyOf(multimedias, multimedias.length - 1);
        }
        for (Multimedia multimedia : copia_multimedia) {
            multimedias[posicion] = multimedia;
            posicion++;
        }
        contador--;

        //En esta comprobacion veo si el elemento ha sido eliminado o no
        if (controlador == 2){
            return true;
        }else {
            return false;
        }
    }

    //LLamo a la ordenacion del array por id y lo muestro
    public void ordenar_por_id() {
        Arrays.sort(multimedias, new OrdenarPorID());
        System.out.println(Arrays.toString(multimedias));
    }

    //Llamo a la ordenacion del array por titulo y lo muestro
    public void ordenar_por_titulo() {
        Arrays.sort(multimedias, new OrdenarPorTitulo());
        System.out.println(Arrays.toString(multimedias));
    }

    //Llamo a la ordenacion del array por ano y lo muestro
    public void ordenar_por_anyo() {
        Arrays.sort(multimedias, new OrdenarPorAno());
        System.out.println(Arrays.toString(multimedias));
    }

    //Este metodo devolvera la cantidad de elementos multimedia que existen actualmente
    public int numero_elementos() {
        return multimedias.length;
    }
}
