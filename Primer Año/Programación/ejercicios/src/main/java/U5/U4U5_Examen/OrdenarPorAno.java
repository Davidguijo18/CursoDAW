package U5.U4U5_Examen;

import java.util.Comparator;

//Este clase que implementa la interfaz Comparator se dedica a comparar objetos Multimedia,
//compara su ano de estreno o publicacion y se encarga de ordenarlos
public class OrdenarPorAno implements Comparator<Multimedia> {
    @Override
    public int compare(Multimedia multimedia1, Multimedia multimedia2) {
        if (multimedia1.getAnoPublicacionEstreno() > multimedia2.getAnoPublicacionEstreno()) {
            return 1;
        } else if (multimedia1.getAnoPublicacionEstreno() < multimedia2.getAnoPublicacionEstreno()) {
            return -1;
        } else {
            return 0;
        }
    }
}
