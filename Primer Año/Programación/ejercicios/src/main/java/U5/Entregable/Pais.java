package U5.Entregable;

public class Pais {
    private String nombrePais;
    private int numParticipantes;

    public Pais(String nombrePais, int numParticipantes) {
        this.nombrePais = nombrePais;
        this.numParticipantes = numParticipantes;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public int getNumParticipantes() {
        return numParticipantes;
    }

    public void setNumParticipantes(int numParticipantes) {
        this.numParticipantes = numParticipantes;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombrePais='" + nombrePais + '\'' +
                ", numParticipantes=" + numParticipantes +
                '}';
    }
}
