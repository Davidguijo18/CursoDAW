package U7.EjerciciosRehechos.Examen_1920_Manana;

import java.io.Serializable;

public class Perro implements Serializable {
    private String nombrePerro;
    private int edad;
    private double peso;
    private boolean estaVacunado;
    private Propietario propietario;
    private String raza;

    public Perro(String nombrePerro, int edad, double peso, boolean estaVacunado, Propietario propietario, String raza) {
        this.nombrePerro = nombrePerro;
        this.edad = edad;
        this.peso = peso;
        this.estaVacunado = estaVacunado;
        this.propietario = propietario;
        this.raza = raza;
    }

    public String getNombrePerro() {
        return nombrePerro;
    }

    public void setNombrePerro(String nombrePerro) {
        this.nombrePerro = nombrePerro;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
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

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "nombrePerro='" + nombrePerro + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", estaVacunado=" + estaVacunado +
                ", propietario=" + propietario +
                ", raza='" + raza + '\'' +
                '}';
    }
}
