package U5.EjerciciosRepaso.Entregable_2122_Manana;

import java.time.LocalDateTime;

public class EquipamientoServicio extends Propiedad {

    private TipoServicio tipoServicio;

    public EquipamientoServicio(int anoConstruccion, String direccion, int metrosCuadrados, TipoServicio tipoServicio) {
        super(anoConstruccion, direccion, metrosCuadrados);
        this.tipoServicio = tipoServicio;
    }

    public TipoServicio getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(TipoServicio tipoServicio) {
        this.tipoServicio = tipoServicio;
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
    }

    public enum TipoServicio {
        EDUCATIVO,
        SANITARIO,
        DEPORTIVO,
        OTROS,
    }
}
