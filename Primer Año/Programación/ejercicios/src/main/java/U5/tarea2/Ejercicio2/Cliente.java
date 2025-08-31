package U5.tarea2.Ejercicio2;

import java.util.Objects;

public class Cliente implements Comparable {
    protected String nombre;
    protected String dni;
    protected int edad;
    protected double saldo;

    public Cliente(String nombre, String dni, int edad, double saldo) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.saldo = saldo;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", edad='" + edad + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(dni, cliente.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }


    @Override
    public int compareTo(Object o) {
        if (this == o || o == null) return 0;
        Cliente c = (Cliente) o;
        return this.dni.compareTo(c.getDni());
    }
}
