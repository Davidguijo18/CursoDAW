package U7.EjerciciosRehechos.Entregable_2021_Tarde;

public class Unidad {
    private String nombreUnidad;

    public Unidad(String nombreUnidad) {
        this.nombreUnidad = nombreUnidad;
    }

    public String getNombreUnidad() {
        return nombreUnidad;
    }

    public void setNombreUnidad(String nombreUnidad) {
        this.nombreUnidad = nombreUnidad;
    }

    @Override
    public String toString() {
        return "Unidad{" +
                "nombreUnidad='" + nombreUnidad + '\'' +
                '}';
    }
}
