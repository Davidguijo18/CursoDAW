package U4.tarea1.Ejercicio6;

public class Banco {

    private final String nombre;
    private double capital;
    private String direccion;

    public Banco() {
        capital = 5.2;
        nombre = "";
    }

    public Banco(String nombre, double capital, String direccion) {
        this.nombre = nombre;
        this.capital = capital;
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public String getNombre() {
        return nombre;
    }
}
