package U7.EjerciciosRehechos.Examen_1920_Manana;

import java.io.Serializable;

public class Propietario implements Serializable {
    private String nombre;
    private String apellidos;
    private int numSocio;
    private String paisOrigen;

    public Propietario(String nombre, String apellidos, int numSocio, String paisOrigen) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numSocio = numSocio;
        this.paisOrigen = paisOrigen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", numSocio=" + numSocio +
                ", paisOrigen='" + paisOrigen + '\'' +
                '}';
    }
}
