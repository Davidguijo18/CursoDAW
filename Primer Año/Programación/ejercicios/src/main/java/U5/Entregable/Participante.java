package U5.Entregable;

public abstract class Participante {
    protected String nombreParticipante;
    protected int edad;

    public Participante(String nombreParticipante, int edad) {
        this.nombreParticipante =nombreParticipante;
        this.edad = edad;
    }

    public String getNombreParticipante() {
        return nombreParticipante;
    }

    public void setNombreParticipante(String nombreParticipante) {
        this.nombreParticipante = nombreParticipante;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public abstract void hacerjuramento();
}

