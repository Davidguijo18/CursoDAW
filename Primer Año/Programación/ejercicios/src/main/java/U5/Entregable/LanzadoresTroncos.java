package U5.Entregable;


public class LanzadoresTroncos extends Participante implements Lanzar {

    private nombrePrueba nombrePruebaArbol;

    public LanzadoresTroncos(String nombreParticipante, int edad, nombrePrueba prueba) {
        super(nombreParticipante, edad);
        this.nombrePruebaArbol = prueba;
    }

    @Override
    public void hacerjuramento() {
        System.out.println("Yo" + nombreParticipante + ", como lanzador, juro los valores deportivos mundiales");
    }

    @Override
    public void lanzar() {
        System.out.println("Voy a lanzar");
    }


    public enum nombrePrueba {
        PINO,
        ROBLE,
        OLIVO
    }

    @Override
    public String toString() {
        return "LanzadoresTroncos{" +
                "nombrePruebaArbol=" + nombrePruebaArbol +
                ", nombreParticipante='" + nombreParticipante + '\'' +
                ", edad=" + edad +
                '}';
    }
}
