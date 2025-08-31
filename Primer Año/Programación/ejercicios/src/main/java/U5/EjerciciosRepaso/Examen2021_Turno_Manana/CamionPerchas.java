package U5.EjerciciosRepaso.Examen2021_Turno_Manana;

import java.util.Arrays;

public class CamionPerchas extends Vehiculo {
    private PrendasColgadas[] prendasColgadas = new PrendasColgadas[0];
    private int contador = 0;

    public CamionPerchas(String matricula, int cargaMaxima, Conductor conductor) {
        super(matricula, cargaMaxima, conductor);
    }

    public void anadirPrendasColgadas(PrendasColgadas prendasColgada) {
        prendasColgadas = Arrays.copyOf(prendasColgadas, prendasColgadas.length + 1);
        prendasColgadas[contador] = prendasColgada;
        contador++;
    }

    public void borrarPrendasColgadas(PrendasColgadas prendasColgada) {
        int posicion = 0;
        for (int i = 0; i < contador; i++) {
            if (prendasColgadas[i].equals(prendasColgada)) {
                posicion = i;
            }
        }
        PrendasColgadas[] copia_prendaColgada = Arrays.copyOfRange(prendasColgadas, posicion + 1, prendasColgadas.length);
        if (prendasColgadas.length == contador) {
            prendasColgadas = Arrays.copyOf(prendasColgadas, prendasColgadas.length - 1);
        }
        for (int i = 0; i < copia_prendaColgada.length; i++) {
            prendasColgadas[posicion] = copia_prendaColgada[i];
            posicion++;
        }
        contador--;
    }

    public int getCantidadPerchas() {
        return prendasColgadas.length;
    }

    @Override
    public void descargar() {
        System.out.println("Descargando " + prendasColgadas.length + " prendas");
    }

    @Override
    public String toString() {
        return "CamionPerchas{" +
                "prendasColgadas=" + Arrays.toString(prendasColgadas) +
                "} " + super.toString();
    }
}
