package U5.EjerciciosRepaso.Examen2021_Turno_Manana;

public class Conductor {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String numSeguridadSocial;

    public Conductor(String nombre, String apellido1, String apellido2, String numSeguridadSocial) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.numSeguridadSocial = numSeguridadSocial;
    }

    @Override
    public String toString() {
        return "Conductor{" +
                "nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", numSeguridadSocial='" + numSeguridadSocial + '\'' +
                '}';
    }
}
