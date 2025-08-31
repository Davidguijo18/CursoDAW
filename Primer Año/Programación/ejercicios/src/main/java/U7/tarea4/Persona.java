package U7.tarea4;

import java.io.Serializable;

public class Persona implements Serializable {
    private String nombre;
    private String dni;
    private int edad;
    private double estatura;

    public Persona(String nombre, String dni, int edad, double estatura) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    @Override
    public String toString() {
        return "Empleado {" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", edad=" + edad +
                ", estatura=" + estatura +
                '}';
    }
}
