package U5.EjerciciosRepaso.Examen2021_Turno_Manana;

import java.util.Arrays;

public class CamionCaja extends Vehiculo {
    private Caja[] cajas = new Caja[0];
    private int contador = 0;

    public CamionCaja(String matricula, int cargaMaxima, Conductor conductor) {
        super(matricula, cargaMaxima, conductor);
    }

    public void anadirCaja(Caja caja) {
        cajas = Arrays.copyOf(cajas, cajas.length + 1);
        cajas[contador] = caja;
        contador++;
    }

    public void borrarCaja(Caja caja) {
        int posicion = 0;
        for (int i = 0; i < contador; i++) {
            if (cajas[i].equals(caja)) {
                posicion = i;
            }
        }
        Caja[] copia_caja = Arrays.copyOfRange(cajas, posicion + 1, cajas.length);
        if (cajas.length == contador) {
            cajas = Arrays.copyOf(cajas, cajas.length - 1);
        }
        for (int i = 0; i < copia_caja.length; i++) {
            cajas[posicion] = copia_caja[i];
            posicion++;
        }
        contador--;
    }

    public int getCantidadCajas() {
        return cajas.length;
    }

    @Override
    public void descargar() {
        System.out.println("Descargando " + cajas.length + " cajas y " + (cajas.length * 5) + " prendas");
    }

    @Override
    public String toString() {
        return "CamionCaja{" +
                "cajas=" + Arrays.toString(cajas) +
                "} " + super.toString();
    }
}
