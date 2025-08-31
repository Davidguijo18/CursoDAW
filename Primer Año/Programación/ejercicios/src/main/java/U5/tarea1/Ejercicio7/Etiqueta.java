package U5.tarea1.Ejercicio7;

public class Etiqueta {
    private String nombreDestinatario;
    private String direccion;

    public Etiqueta(String nombreDestinatario, String direccion) {
        this.nombreDestinatario = nombreDestinatario;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Etiqueta{" +
                "nombreDestinatario='" + nombreDestinatario + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}

