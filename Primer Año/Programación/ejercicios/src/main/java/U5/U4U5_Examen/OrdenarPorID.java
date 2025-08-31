package U5.U4U5_Examen;

import java.util.Comparator;
//Este clase que implementa la interfaz Comparator se dedica a comparar objetos Multimedia,
//compara su ID y se encarga de ordenarlos
public class OrdenarPorID implements Comparator<Multimedia> {
    @Override
    public int compare(Multimedia multimedia1, Multimedia multimedia2) {
        if (multimedia1.getId() > multimedia2.getId()) {
            return 1;
        } else if (multimedia1.getId() < multimedia2.getId()) {
            return -1;
        } else {
            return 0;
        }
    }
}
