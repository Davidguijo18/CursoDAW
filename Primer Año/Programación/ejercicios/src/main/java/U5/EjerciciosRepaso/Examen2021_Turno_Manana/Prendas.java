package U5.EjerciciosRepaso.Examen2021_Turno_Manana;

public class Prendas implements Doblar, Devolver {
    protected double precio;
    protected String nombre;
    private long codigoBarras;
    private double peso;
    public static int numPrendasCreadas = 0;


    public Prendas(double precio, String nombre, long codigoBarras, double peso) {
        this.precio = precio;
        this.nombre = nombre;
        this.codigoBarras = codigoBarras;
        this.peso = peso;
        numPrendasCreadas++;
    }

    @Override
    public void devolver() {
        System.out.println("Devolviendo la prensa con nombre " + nombre + "y precio" + precio);
    }

    @Override
    public void doblar() {
        System.out.println("La prenda " + nombre + "se puede doblar");
    }

    @Override
    public String toString() {
        return "Prendas{" +
                "precio=" + precio +
                ", nombre='" + nombre + '\'' +
                ", codigoBarras=" + codigoBarras +
                ", peso=" + peso +
                '}';
    }
}
