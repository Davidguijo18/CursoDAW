package U5.EjerciciosRepaso.Entregable_2324_RehacerRepaso;

public class Baloncesto extends Deporte {
    private int numEquipos;

    public Baloncesto(String nombreDeporte, String nombrePabellon, int numEquipos) {
        super(nombreDeporte, nombrePabellon);
        this.numEquipos = numEquipos;
    }
}
