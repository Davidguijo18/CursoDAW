package U7.EjerciciosRehechos.Examen_1920_Tarde;

import java.io.Serializable;

public class Paciente implements Serializable {
    private String nombrePaciente;
    private int edad;
    private double peso;
    private boolean tieneVacunas;
    private Medico medico;
    private String nombreCepa;

    public Paciente(String nombrePaciente, int edad, double peso, boolean tieneVacunas, Medico medico, String nombreCepa) {
        this.nombrePaciente = nombrePaciente;
        this.edad = edad;
        this.peso = peso;
        this.tieneVacunas = tieneVacunas;
        this.medico = medico;
        this.nombreCepa = nombreCepa;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
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

    public boolean isTieneVacunas() {
        return tieneVacunas;
    }

    public void setTieneVacunas(boolean tieneVacunas) {
        this.tieneVacunas = tieneVacunas;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getNombreCepa() {
        return nombreCepa;
    }

    public void setNombreCepa(String nombreCepa) {
        this.nombreCepa = nombreCepa;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombrePaciente='" + nombrePaciente + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", tieneVacunas=" + tieneVacunas +
                ", medico=" + medico +
                ", nombreCepa='" + nombreCepa + '\'' +
                '}';
    }
}
