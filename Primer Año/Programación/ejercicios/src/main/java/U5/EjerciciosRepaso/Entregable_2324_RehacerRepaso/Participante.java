package U5.EjerciciosRepaso.Entregable_2324_RehacerRepaso;

public abstract class Participante {
    protected String nomberParticipante;
    protected int edad;

    public Participante(String nomberParticipante, int edad) {
        this.nomberParticipante = nomberParticipante;
        this.edad = edad;
    }

    public String getNomberParticipante() {
        return nomberParticipante;
    }

    public void setNomberParticipante(String nomberParticipante) {
        this.nomberParticipante = nomberParticipante;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public abstract void hacerjuramento();

    @Override
    public String toString() {
        return "Participante{" +
                "nomberParticipante='" + nomberParticipante + '\'' +
                ", edad='" + edad + '\'' +
                '}';
    }
}
