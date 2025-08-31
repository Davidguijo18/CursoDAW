package U5.EjerciciosRepaso.Entregable_2122_Manana;

public class Persona {
    private String nif;
    private String nombreApellidos;
    private int identificador;
    private static int contadorIdentificador = 1;

    public Persona(String nif, String nombreApellidos) {
        this.nif = nif;
        this.nombreApellidos = nombreApellidos;
        this.identificador = contadorIdentificador;
        contadorIdentificador++;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombreApellidos() {
        return nombreApellidos;
    }

    public void setNombreApellidos(String nombreApellidos) {
        this.nombreApellidos = nombreApellidos;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public static int getContadorIdentificador() {
        return contadorIdentificador;
    }

    public static void setContadorIdentificador(int contadorIdentificador) {
        Persona.contadorIdentificador = contadorIdentificador;
    }
}
