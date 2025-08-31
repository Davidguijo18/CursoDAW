package U7.U6U7_Entregable;

import java.util.Comparator;

public class OrdenarAtletasPorTiempo implements Comparator<Atleta> {
    @Override
    public int compare(Atleta atleta1, Atleta atleta2) {
        if (atleta1.getMarca() > atleta2.getMarca()) {
            return 1;
        } else if (atleta1.getMarca() < atleta2.getMarca()) {
            return -1;
        }
        return 0;
    }
}