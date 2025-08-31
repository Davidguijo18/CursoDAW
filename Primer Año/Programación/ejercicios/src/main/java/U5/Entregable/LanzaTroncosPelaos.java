package U5.Entregable;

import java.util.Arrays;

public class LanzaTroncosPelaos extends Deporte {
    private int numPruebas;
    private Participante[] participantes = new Participante[0];
    private int contador = 0;

    public LanzaTroncosPelaos(String nombreDeporte, String nombrePabellon, int numPruebas) {
        super(nombreDeporte, nombrePabellon);
        this.numPruebas = numPruebas;
    }

    public void anadirParticipante(Participante participante) {
        participantes = Arrays.copyOf(participantes, participantes.length + 1);
        participantes[contador] = participante;
        contador++;
    }

    public void eliminarParticipante(Participante participante) {
        int posicion = 0;
        for (int i = 0; i < contador; i++) {
            if (participantes[i].getNombreParticipante().equals(participante.nombreParticipante)) {
                posicion = i;
            }
        }
        Participante[] copia_participante = Arrays.copyOfRange(participantes, posicion + 1, participantes.length);
        if (participantes.length == contador) {
            participantes = Arrays.copyOf(participantes, participantes.length - 1);
        }
        for (int i = 0; i < copia_participante.length; i++) {
            participantes[posicion] = copia_participante[i];
            posicion++;
        }
        contador--;
    }

    public void mostrarParticipantes(){
        Arrays.sort(participantes,new OrdenarParticipantesPorEdad());
    }

    @Override
    public String toString() {
        return "LanzaTroncosPelaos{" +
                "numPruebas=" + numPruebas +
                ", participantes=" + Arrays.toString(participantes) +
                '}';
    }
}
