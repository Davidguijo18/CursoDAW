package U5.EjerciciosRepaso.Examen2021_Turno_Manana;

import java.util.Comparator;

public class OrdenarCamionCajaPorPeso implements Comparator<CamionCaja> {
    @Override
    public int compare(CamionCaja camionCaja1, CamionCaja camionCaja2) {
        if (camionCaja1.getCargaMaxima() > camionCaja2.getCargaMaxima()) {
            return 1;
        } else if (camionCaja1.getCargaMaxima() < camionCaja2.getCargaMaxima()) {
            return -1;
        } else {
            return 0;
        }
    }
}
