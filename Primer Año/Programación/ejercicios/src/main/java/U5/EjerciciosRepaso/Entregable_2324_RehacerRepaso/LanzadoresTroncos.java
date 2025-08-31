package U5.EjerciciosRepaso.Entregable_2324_RehacerRepaso;

public class LanzadoresTroncos extends Participante implements Lanzar {
    private TipoArbol tipoArbol;

    public LanzadoresTroncos(String nomberParticipante, int edad, TipoArbol tipoArbol) {
        super(nomberParticipante, edad);
        this.tipoArbol = tipoArbol;
    }

    @Override
    public void hacerjuramento() {
        System.out.println("Yo " + nomberParticipante + ", como lanzador, juro los valores deportivos mundiales");
    }

    @Override
    public void lanzar() {
        System.out.println("Voy a lanzar");
    }

    public enum TipoArbol {
        PINO,
        ROBLE,
        OLIVO
    }

    @Override
    public String toString() {
        return "LanzadoresTroncos{" +
                "tipoArbol=" + tipoArbol +
                ", nomberParticipante='" + nomberParticipante + '\'' +
                ", edad='" + edad + '\'' +
                '}';
    }
}
