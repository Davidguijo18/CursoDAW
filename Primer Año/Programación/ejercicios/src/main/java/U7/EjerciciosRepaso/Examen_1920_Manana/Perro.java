package U7.EjerciciosRepaso.Examen_1920_Manana;

import java.io.Serializable;

public class Perro implements Serializable {
    private String nombrePerro;
    private int edadPerro;
    private double pesoPerro;
    private boolean estaVacunado;
    private Propietario propietario;
    private String razaPerro;

    public Perro(String nombrePerro, int edadPerro, double pesoPerro, boolean estaVacunado, Propietario propietario, String razaPerro) {
        this.nombrePerro = nombrePerro;
        this.edadPerro = edadPerro;
        this.pesoPerro = pesoPerro;
        this.estaVacunado = estaVacunado;
        this.propietario = propietario;
        this.razaPerro = razaPerro;
    }

    public String getNombrePerro() {
        return nombrePerro;
    }

    public void setNombrePerro(String nombrePerro) {
        this.nombrePerro = nombrePerro;
    }

    public int getEdadPerro() {
        return edadPerro;
    }

    public void setEdadPerro(int edadPerro) {
        this.edadPerro = edadPerro;
    }

    public double getPesoPerro() {
        return pesoPerro;
    }

    public void setPesoPerro(double pesoPerro) {
        this.pesoPerro = pesoPerro;
    }

    public boolean isEstaVacunado() {
        return estaVacunado;
    }

    public void setEstaVacunado(boolean estaVacunado) {
        this.estaVacunado = estaVacunado;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public String getRazaPerro() {
        return razaPerro;
    }

    public void setRazaPerro(String razaPerro) {
        this.razaPerro = razaPerro;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "nombrePerro='" + nombrePerro + '\'' +
                ", edadPerro=" + edadPerro +
                ", pesoPerro=" + pesoPerro +
                ", estaVacunado=" + estaVacunado +
                ", propietario=" + propietario +
                ", razaPerro='" + razaPerro + '\'' +
                '}';
    }
}
