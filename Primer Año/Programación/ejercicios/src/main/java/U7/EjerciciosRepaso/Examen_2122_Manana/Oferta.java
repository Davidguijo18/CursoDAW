package U7.EjerciciosRepaso.Examen_2122_Manana;

import java.io.Serializable;
import java.util.TreeSet;

public class Oferta implements Serializable{

    private int codigoOferta;
    private String descripcionOferta;
    private TreeSet<Trabajador> listaTrabajadores = new TreeSet<>(new OrdenarTrabajadorPorApellidosNombre());
    private boolean estaCubierta;

    public Oferta(int codigoOferta, String descripcionOferta, boolean estaCubierta) {
        this.codigoOferta = codigoOferta;
        this.descripcionOferta = descripcionOferta;
        this.estaCubierta = estaCubierta;
    }

    public void addTrabajador(Trabajador trabajador) {
        if (listaTrabajadores.contains(trabajador)) {
            System.out.println("Este trabajador ya se encuentra en la lista");
        } else {
            listaTrabajadores.add(trabajador);
        }
    }

    public int getCodigoOferta() {
        return codigoOferta;
    }

    public void setCodigoOferta(int codigoOferta) {
        this.codigoOferta = codigoOferta;
    }

    public String getDescripcionOferta() {
        return descripcionOferta;
    }

    public void setDescripcionOferta(String descripcionOferta) {
        this.descripcionOferta = descripcionOferta;
    }

    public TreeSet<Trabajador> getListaTrabajadores() {
        return listaTrabajadores;
    }

    public void setListaTrabajadores(TreeSet<Trabajador> listaTrabajadores) {
        this.listaTrabajadores = listaTrabajadores;
    }

    public boolean isEstaCubierta() {
        return estaCubierta;
    }

    public void setEstaCubierta(boolean estaCubierta) {
        this.estaCubierta = estaCubierta;
    }
}
