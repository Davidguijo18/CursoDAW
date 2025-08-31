package U5.EjerciciosRepaso.Examen2021_Turno_Manana;

import java.util.Comparator;

public class OrdenarCamionPrendaPorNumPrendas implements Comparator<CamionPerchas> {
    @Override
    public int compare(CamionPerchas camionPercha1, CamionPerchas camionPercha2) {
        if (camionPercha1.getCantidadPerchas() > camionPercha2.getCantidadPerchas()) {
            return 1;
        } else if (camionPercha1.getCantidadPerchas() < camionPercha2.getCargaMaxima()) {
            return -1;
        } else {
            return 0;
        }
    }
}
