package U4.tarea1.Ejercicio9.Maquinaria;

public class Vagon {

    protected double cargaMaxima;
    protected double cargaActual;
    protected String tipoMercancia;

    public Vagon(){
    }

    public Vagon(double cargaMaxima, double cargaActual, String tipoMercancia) {
        this.cargaMaxima = cargaMaxima;
        this.cargaActual = cargaActual;
        this.tipoMercancia = tipoMercancia;
    }
}
