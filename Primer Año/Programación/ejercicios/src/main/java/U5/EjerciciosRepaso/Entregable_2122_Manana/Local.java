package U5.EjerciciosRepaso.Entregable_2122_Manana;

public abstract class Local extends Propiedad{
    protected Persona persona;
    protected double precio;
    public Local(int anoConstruccion, String direccion, int metrosCuadrados, Persona persona, double precio) {
        super(anoConstruccion, direccion, metrosCuadrados);
        this.persona = persona;
        this.precio = precio;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public abstract void mostrarPrecioVenta();
}
