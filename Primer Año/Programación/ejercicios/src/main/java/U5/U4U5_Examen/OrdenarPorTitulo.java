package U5.U4U5_Examen;

import java.util.Comparator;

//Este clase que implementa la interfaz Comparator se dedica a comparar objetos Multimedia,
//compara su titulo y se encarga de ordenarlos
public class OrdenarPorTitulo implements Comparator<Multimedia> {
    @Override
    public int compare(Multimedia multimedia1, Multimedia multimedia2) {
        return multimedia1.getTitulo().compareTo(multimedia2.getTitulo());
    }
}
