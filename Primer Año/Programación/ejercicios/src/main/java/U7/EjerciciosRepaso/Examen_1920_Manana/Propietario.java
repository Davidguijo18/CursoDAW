package U7.EjerciciosRepaso.Examen_1920_Manana;

public class Propietario {
    private String nombrePropietario;
    private String apellidosPropietario;
    private int numSocio;
    private String paisOrigen;

    public Propietario(String nombrePropietario, String apellidosPropietario, int numSocio, String paisOrigen) {
        this.nombrePropietario = nombrePropietario;
        this.apellidosPropietario = apellidosPropietario;
        this.numSocio = numSocio;
        this.paisOrigen = paisOrigen;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public String getApellidosPropietario() {
        return apellidosPropietario;
    }

    public void setApellidosPropietario(String apellidosPropietario) {
        this.apellidosPropietario = apellidosPropietario;
    }

    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "nombrePropietario='" + nombrePropietario + '\'' +
                ", apellidosPropietario='" + apellidosPropietario + '\'' +
                ", numSocio=" + numSocio +
                ", paisOrigen='" + paisOrigen + '\'' +
                '}';
    }
}
