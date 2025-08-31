package U5.EjerciciosRepaso.Examen_21_22;

public class Integrante {
    private int numParticipante;
    private String nombre;
    private int edad;
    private String localidad;

    public Integrante() {
    }

    public int getNumParticipante() {
        return numParticipante;
    }

    public Integrante(int numParticipante, String nombre, int edad, String localidad) {
        this.numParticipante = numParticipante;
        this.nombre = nombre;
        this.edad = edad;
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return "Integrante{" +
                "numParticipante=" + numParticipante +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", localidad='" + localidad + '\'' +
                '}';
    }
}
