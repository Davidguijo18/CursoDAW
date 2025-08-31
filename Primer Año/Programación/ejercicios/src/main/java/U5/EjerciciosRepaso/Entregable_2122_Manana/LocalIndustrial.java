package U5.EjerciciosRepaso.Entregable_2122_Manana;

import java.time.LocalDateTime;

public class LocalIndustrial extends Local implements MostrarPrecioVenta{

    private int consumoEnergetico;

    public LocalIndustrial(int anoConstruccion, String direccion, int metrosCuadrados, Persona persona, double precio, int consumoEnergetico) {
        super(anoConstruccion, direccion, metrosCuadrados, persona, precio);
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(int consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    @Override
    public void mostrarPrecioVenta() {
        System.out.println("Soy un local industrial con un consumo maximo de" + consumoEnergetico + "y valgo" + precio);
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
        System.out.println("Consumo energetico : " + consumoEnergetico);
    }
}
