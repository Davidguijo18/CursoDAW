package U5.Entregable;


public abstract class Deporte {
    private String nombreDeporte;
    private String nombrePabellon;

    public Deporte(String nombreDeporte, String nombrePabellon) {
        this.nombreDeporte = nombreDeporte;
        this.nombrePabellon = nombrePabellon;
    }

    public String getNombreDeporte() {
        return nombreDeporte;
    }

    public void setNombreDeporte(String nombreDeporte) {
        this.nombreDeporte = nombreDeporte;
    }

    public String getNombrePabellon() {
        return nombrePabellon;
    }

    public void setNombrePabellon(String nombrePabellon) {
        this.nombrePabellon = nombrePabellon;
    }

    @Override
    public String toString() {
        return "Deporte{" +
                "nombreDeporte='" + nombreDeporte + '\'' +
                ", nombrePabellon='" + nombrePabellon + '\'' +
                '}';
    }
}
