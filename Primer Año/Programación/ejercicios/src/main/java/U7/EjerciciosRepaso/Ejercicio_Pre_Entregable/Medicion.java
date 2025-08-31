package U7.EjerciciosRepaso.Ejercicio_Pre_Entregable;

public class Medicion implements Comparable<Medicion> {
    private int temperatura;
    private int humedad;
    private int presion;

    public Medicion(int temperatura, int humedad, int presion) {
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.presion = presion;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getHumedad() {
        return humedad;
    }

    public void setHumedad(int humedad) {
        this.humedad = humedad;
    }

    public int getPresion() {
        return presion;
    }

    public void setPresion(int presion) {
        this.presion = presion;
    }

    @Override
    public String toString() {
        return "Medicion{" +
                "temperatura=" + temperatura +
                ", humedad=" + humedad +
                ", presion=" + presion +
                '}';
    }

    @Override
    public int compareTo(Medicion medicion) {
        if (this.temperatura > medicion.getTemperatura()) {
            return 1;
        } else if (this.temperatura < medicion.getTemperatura()) {
            return -1;
        }
        return 0;
    }
}
