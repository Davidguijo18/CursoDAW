package U7.U6U7_Entregable;

import java.io.Serializable;

public class Atleta implements Serializable {

    public enum Categoria {
        SENIOR,
        JUNIOR,
        VETERANO
    }

    private static int contadornumDorsal = 1;
    private int numDorsal;
    private String nombreAtleta;
    private String pais;
    private int marca;
    private Categoria categoria;
    private boolean esFinisher = false;

    public Atleta(String nombreAtleta, String pais, Categoria categoria) {
        this.nombreAtleta = nombreAtleta;
        this.pais = pais;
        this.categoria = categoria;
        numDorsal = contadornumDorsal++;
    }

    public String getNombreAtleta() {
        return nombreAtleta;
    }

    public void setNombreAtleta(String nombreAtleta) {
        this.nombreAtleta = nombreAtleta;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public boolean isEsFinisher() {
        return esFinisher;
    }

    public void setEsFinisher(boolean esFinisher) {
        this.esFinisher = esFinisher;
    }

    public int getNumDorsal() {
        return numDorsal;
    }

    public void setNumDorsal(int numDorsal) {
        this.numDorsal = numDorsal;
    }

    @Override
    public String toString() {
        return "Atleta{" +
                "numDorsal=" + numDorsal +
                ", nombreAtleta='" + nombreAtleta + '\'' +
                ", pais='" + pais + '\'' +
                ", marca=" + marca +
                ", categoria=" + categoria +
                ", esFinisher=" + esFinisher +
                '}';
    }
}
