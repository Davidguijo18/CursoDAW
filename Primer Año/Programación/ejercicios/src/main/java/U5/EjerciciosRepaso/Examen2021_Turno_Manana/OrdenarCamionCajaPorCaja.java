package U5.EjerciciosRepaso.Examen2021_Turno_Manana;

import java.util.Comparator;

public class OrdenarCamionCajaPorCaja implements Comparator<CamionCaja> {
    public int compare(CamionCaja camionCaja1, CamionCaja camionCaja2) {
        if (camionCaja1.getCantidadCajas() > camionCaja2.getCantidadCajas()) {
            return 1;
        } else if (camionCaja1.getCantidadCajas() < camionCaja2.getCantidadCajas()) {
            return -1;
        } else {
            return 0;
        }
    }
}
