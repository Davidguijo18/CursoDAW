package U5.Entregable;

import java.util.Comparator;

public class OrdenarBaloncestistasPorAltura implements Comparator<Baloncestitas> {
    @Override
    public int compare(Baloncestitas baloncestita1, Baloncestitas baloncestita2) {
        if (baloncestita1.getAltura() > baloncestita2.getAltura()){
            return 1;
        } else if (baloncestita1.getAltura() < baloncestita2.getAltura()) {
            return -1;
        }
        return 0;
    }
}
