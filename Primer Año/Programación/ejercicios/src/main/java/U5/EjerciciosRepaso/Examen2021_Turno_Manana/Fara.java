package U5.EjerciciosRepaso.Examen2021_Turno_Manana;

import java.util.Arrays;

public class Fara {
    private CamionCaja[] camionCajas = new CamionCaja[0];
    private CamionPerchas[] camionPerchas = new CamionPerchas[0];
    private int contadorCamionCajas = 0;
    private int contadorCamionPerchas = 0;

    public void anadirCamionCajas(CamionCaja camionCaja) {
        camionCajas = Arrays.copyOf(camionCajas, camionCajas.length + 1);
        camionCajas[contadorCamionCajas] = camionCaja;
        contadorCamionCajas++;
    }

    public void eliminarCamionCajas(CamionCaja camionCaja) {

        int posicion = 0;
        for (int i = 0; i < contadorCamionCajas; i++) {
            if (camionCajas[i].equals(camionCaja)) {
                posicion = i;
            }
        }
        CamionCaja[] copia_camionCaja = Arrays.copyOfRange(camionCajas, posicion + 1, camionCajas.length);
        if (camionCajas.length == contadorCamionCajas) {
            camionCajas = Arrays.copyOf(camionCajas, camionCajas.length - 1);
        }
        for (int i = 0; i < copia_camionCaja.length; i++) {
            camionCajas[posicion] = copia_camionCaja[i];
            posicion++;
        }
        contadorCamionCajas--;
    }

    public void anadirCamionPerchas(CamionPerchas camionPercha) {
        camionPerchas = Arrays.copyOf(camionPerchas, camionPerchas.length + 1);
        camionPerchas[contadorCamionPerchas] = camionPercha;
        contadorCamionPerchas++;
    }

    public void eliminarCamionPerchas(CamionPerchas camionPercha) {

        int posicion = 0;
        for (int i = 0; i < contadorCamionPerchas; i++) {
            if (camionPerchas[i].equals(camionPercha)) {
                posicion = i;
            }
        }
        CamionPerchas[] copia_camionPerchas = Arrays.copyOfRange(camionPerchas, posicion + 1, camionPerchas.length);
        if (camionPerchas.length == contadorCamionPerchas) {
            camionPerchas = Arrays.copyOf(camionPerchas, camionPerchas.length - 1);
        }
        for (int i = 0; i < copia_camionPerchas.length; i++) {
            camionPerchas[posicion] = copia_camionPerchas[i];
            posicion++;
        }
        contadorCamionPerchas--;
    }

    public void mostrarCamionCajaPorCajas() {
        Arrays.sort(camionCajas, new OrdenarCamionCajaPorCaja());
        System.out.println(Arrays.toString(camionCajas));
    }

    public void mostrarCamionCajasPorPeso() {
        Arrays.sort(camionCajas, new OrdenarCamionCajaPorPeso());
        System.out.println(Arrays.toString(camionCajas));
    }

    public void mostrarCamionPerchas() {
        Arrays.sort(camionPerchas, new OrdenarCamionPrendaPorNumPrendas());
        System.out.println(Arrays.toString(camionPerchas));
    }
}
