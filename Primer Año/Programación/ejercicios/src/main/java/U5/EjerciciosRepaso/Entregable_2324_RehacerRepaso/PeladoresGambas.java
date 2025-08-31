package U5.EjerciciosRepaso.Entregable_2324_RehacerRepaso;

public class PeladoresGambas extends Participante implements Pelar {
    private int peso;

    public PeladoresGambas(String nomberParticipante, int edad, int peso) {
        super(nomberParticipante, edad);
        this.peso = peso;
    }

    @Override
    public void hacerjuramento() {
        System.out.println("Yo " + nomberParticipante + ", como pelador, juro los valores deportivos mundiales");
    }

    @Override
    public void pelar() {
        System.out.println("Voy a pelar mis gambas");
    }

    @Override
    public String toString() {
        return "PeladoresGambas{" +
                "peso=" + peso +
                ", nomberParticipante='" + nomberParticipante + '\'' +
                ", edad='" + edad + '\'' +
                '}';
    }
}
