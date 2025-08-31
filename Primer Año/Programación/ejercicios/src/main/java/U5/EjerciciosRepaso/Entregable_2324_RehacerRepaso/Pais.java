package U5.EjerciciosRepaso.Entregable_2324_RehacerRepaso;

public class Pais implements Comparable<Pais> {
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

    @Override
    public int compareTo(Pais pais) {
        return this.nombrePais.compareTo(pais.nombrePais);
    }
}
