package U5.EjerciciosRepaso.Entregable_2122_Manana;

import java.time.LocalDateTime;

public class LocalComercial extends Local implements MostrarPrecioVenta{
    private String actividadComercial;

    public LocalComercial(int anoConstruccion, String direccion, int metrosCuadrados, Persona persona, double precio, String actividadComercial) {
        super(anoConstruccion, direccion, metrosCuadrados, persona, precio);
        this.actividadComercial = actividadComercial;
    }

    public String getActividadComercial() {
        return actividadComercial;
    }

    public void setActividadComercial(String actividadComercial) {
        this.actividadComercial = actividadComercial;
    }

    @Override
    public void mostrarPrecioVenta() {
        System.out.println("Soy un local comercial que me dedico a " + actividadComercial + " y valgo" + precio);
    }

    @Override
    public void mostrarPropiedad() {
        LocalDateTime locaDate = LocalDateTime.now();
        int horas = locaDate.getHour();
        int minutos = locaDate.getMinute();
        int segundos = locaDate.getSecond();
        System.out.println("Ano construccion: " + anoConstruccion);
        System.out.println("Direccion: " + direccion);
        System.out.println("Metros cuadrados: " + metrosCuadrados);
        System.out.println("Hora actual : " + horas + ":" + minutos + ":" + segundos);
        System.out.println("Propietario : " + persona.toString());
        System.out.println("Precio : " + precio);
        System.out.println("Actividad comercial : " + actividadComercial);
    }
}
