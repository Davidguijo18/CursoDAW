package U7.EjerciciosRepaso.Examen_2122_Manana;

import java.io.Serializable;

public class Trabajador implements Serializable{
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    private String formacionAcademica;

    public Trabajador(String dni, String nombre, String apellidos, int edad, String formacionAcademica) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.formacionAcademica = formacionAcademica;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFormacionAcademica() {
        return formacionAcademica;
    }

    public void setFormacionAcademica(String formacionAcademica) {
        this.formacionAcademica = formacionAcademica;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", formacionAcademica='" + formacionAcademica + '\'' +
                '}';
    }
}
