package U7.EjerciciosRehechos.Examen_1920_Tarde;

import java.io.Serializable;

public class Medico implements Serializable {
    private String nombreMedico;
    private String apellidosMedico;
    private int numColegiado;
    private String hospital;

    public Medico(String nombreMedico, String apellidosMedico, int numColegiado, String hospital) {
        this.nombreMedico = nombreMedico;
        this.apellidosMedico = apellidosMedico;
        this.numColegiado = numColegiado;
        this.hospital = hospital;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    public String getApellidosMedico() {
        return apellidosMedico;
    }

    public void setApellidosMedico(String apellidosMedico) {
        this.apellidosMedico = apellidosMedico;
    }

    public int getNumColegiado() {
        return numColegiado;
    }

    public void setNumColegiado(int numColegiado) {
        this.numColegiado = numColegiado;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "nombreMedico='" + nombreMedico + '\'' +
                ", apellidosMedico='" + apellidosMedico + '\'' +
                ", numColegiado=" + numColegiado +
                ", hospital='" + hospital + '\'' +
                '}';
    }
}
