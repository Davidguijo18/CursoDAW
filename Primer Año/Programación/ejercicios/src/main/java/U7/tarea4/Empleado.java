package U7.tarea4;

import java.io.Serializable;

public class Empleado extends Persona implements Serializable {

    private double sueldo;

    public Empleado(String nombre, String dni, int edad, double estatura, double sueldo) {
        super(nombre, dni, edad, estatura);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() +
                "sueldo=" + sueldo;
    }
}
