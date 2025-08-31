package U5.EjerciciosRepaso.Examen2021_Turno_Manana;

public class PrendasColgadas extends Prendas implements Devolver, Doblar, Colgar {

    private double altura;

    public PrendasColgadas(double precio, String nombre, long codigoBarras, double peso, double altura) {
        super(precio, nombre, codigoBarras, peso);
        this.altura = altura;
        numPrendasCreadas++;
    }

    @Override
    public void doblar() {
        System.out.println("La prenda " + nombre + " no se puede doblar");
    }

    @Override
    public void colgar() {
        System.out.println("La prenda " + nombre + " está colgada");
    }

    @Override
    public String toString() {
        return "PrendasColgadas{" +
                "altura=" + altura +
                ", precio=" + precio +
                ", nombre='" + nombre + '\'' +
                "} " + super.toString();
    }
}
