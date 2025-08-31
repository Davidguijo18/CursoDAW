package U7.EjerciciosRehechos.Examen_2122_Manana;

import java.io.Serializable;
import java.util.TreeSet;

public class Oferta implements Serializable {
    private Integer codigoOferta;
    private String descripcion;
    private boolean ofertaCubierta;
    private TreeSet<Trabajador> trabajadoresSolicitantes = new TreeSet<>(new OrdenarListaSolicitantes());

    public Oferta(Integer codigoOferta, String descripcion, boolean ofertaCubierta) {
        this.codigoOferta = codigoOferta;
        this.descripcion = descripcion;
        this.ofertaCubierta = ofertaCubierta;
    }

    public Integer getCodigoOferta() {
        return codigoOferta;
    }

    public void setCodigoOferta(Integer codigoOferta) {
        this.codigoOferta = codigoOferta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isOfertaCubierta() {
        return ofertaCubierta;
    }

    public void setOfertaCubierta(boolean ofertaCubierta) {
        this.ofertaCubierta = ofertaCubierta;
    }

    public TreeSet<Trabajador> getTrabajadoresSolicitantes() {
        return trabajadoresSolicitantes;
    }

    public void setTrabajadoresSolicitantes(TreeSet<Trabajador> trabajadoresSolicitantes) {
        this.trabajadoresSolicitantes = trabajadoresSolicitantes;
    }

    @Override
    public String toString() {
        return "Oferta{" +
                "codigoOferta=" + codigoOferta +
                ", descripcion='" + descripcion + '\'' +
                ", ofertaCubierta=" + ofertaCubierta +
                '}';
    }
}
