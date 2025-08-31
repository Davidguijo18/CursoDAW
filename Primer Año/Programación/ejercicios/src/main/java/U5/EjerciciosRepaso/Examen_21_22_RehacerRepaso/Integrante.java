package U5.EjerciciosRepaso.Examen_21_22_RehacerRepaso;

public class Integrante {
    private int numParticipante;
    private String nombre;
    private int edad;
    private String localidad;

    public Integrante(int numParticipante, String nombre, int edad, String localidad) {
        this.numParticipante = numParticipante;
        this.nombre = nombre;
        this.edad = edad;
        this.localidad = localidad;
    }

    public int getNumParticipante() {
        return numParticipante;
    }

    public void setNumParticipante(int numParticipante) {
        this.numParticipante = numParticipante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
}
