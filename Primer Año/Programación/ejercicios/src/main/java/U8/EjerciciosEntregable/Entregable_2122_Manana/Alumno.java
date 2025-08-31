package U8.EjerciciosEntregable.Entregable_2122_Manana;

import java.io.Serializable;

public class Alumno implements Comparable<Alumno> {
    private String dni;
    private String nombre;
    private String apellidos;
    private String direccoin;

    public Alumno(String dni, String nombre, String apellidos, String direccoin) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccoin = direccoin;
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

    public String getDireccoin() {
        return direccoin;
    }

    public void setDireccoin(String direccoin) {
        this.direccoin = direccoin;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", direccoin='" + direccoin + '\'' +
                '}';
    }


    @Override
    public int compareTo(Alumno alumno) {
        return this.dni.compareTo(alumno.getDni());
    }
}
