package U9.tarea2;

public class Ofice {
    private String codOficina;
    private String ciudad;
    private String numTelefono;
    private String direccion1;
    private String direccion2;
    private String estado;
    private String pais;
    private String codPostal;
    private String territorio;

    public Ofice(String codOficina, String ciudad, String numTelefono, String direccion1, String direccion2, String estado, String pais, String codPostal, String territorio) {
        this.codOficina = codOficina;
        this.ciudad = ciudad;
        this.numTelefono = numTelefono;
        this.direccion1 = direccion1;
        this.direccion2 = direccion2;
        this.estado = estado;
        this.pais = pais;
        this.codPostal = codPostal;
        this.territorio = territorio;
    }

    public String getCodOficina() {
        return codOficina;
    }

    public void setCodOficina(String codOficina) {
        this.codOficina = codOficina;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String getDireccion1() {
        return direccion1;
    }

    public void setDireccion1(String direccion1) {
        this.direccion1 = direccion1;
    }

    public String getDireccion2() {
        return direccion2;
    }

    public void setDireccion2(String direccion2) {
        this.direccion2 = direccion2;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public String getTerritorio() {
        return territorio;
    }

    public void setTerritorio(String territorio) {
        this.territorio = territorio;
    }

    @Override
    public String toString() {
        return "Ofice{" +
                "codOficina='" + codOficina + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", numTelefono='" + numTelefono + '\'' +
                ", direccion1='" + direccion1 + '\'' +
                ", direccion2='" + direccion2 + '\'' +
                ", estado='" + estado + '\'' +
                ", pais='" + pais + '\'' +
                ", codPostal='" + codPostal + '\'' +
                ", territorio='" + territorio + '\'' +
                '}';
    }
}
