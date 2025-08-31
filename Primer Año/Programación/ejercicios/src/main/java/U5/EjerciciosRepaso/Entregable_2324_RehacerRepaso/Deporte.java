package U5.EjerciciosRepaso.Entregable_2324_RehacerRepaso;

import java.util.Arrays;

public abstract class Deporte {
    protected String nombreDeporte;
    protected String nombrePabellon;

    private Participante[] participantes = new Participante[0];
    private int contador;

    public Deporte(String nombreDeporte, String nombrePabellon) {
        this.nombreDeporte = nombreDeporte;
        this.nombrePabellon = nombrePabellon;
    }

    public String getNombreDeporte() {
        return nombreDeporte;
    }

    public void setNombreDeporte(String nombreDeporte) {
        this.nombreDeporte = nombreDeporte;
    }

    public String getNombrePabellon() {
        return nombrePabellon;
    }

    public void setNombrePabellon(String nombrePabellon) {
        this.nombrePabellon = nombrePabellon;
    }

    public void anadirParticipante(Participante participante) {
        participantes = Arrays.copyOf(participantes, participantes.length + 1);
        participantes[contador] = participante;
        contador++;
    }

    public void eliminarParticipante(Participante participante) {
        int posicion = 0;
        for (int i = 0; i < contador; i++) {
            if (participantes[i].getNomberParticipante().equals(participante.getNomberParticipante())) {
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

    public void mostrarParticipantes() {
        Arrays.sort(participantes, new OrdenarParticipantesPorEdad());
        System.out.println(Arrays.toString(participantes));
    }

    public void mostrarParticipantesBaloncesto() {
        // Arrays.sort(participantes, new OrdenarBaloncestistasPorAltura());
    }
}
