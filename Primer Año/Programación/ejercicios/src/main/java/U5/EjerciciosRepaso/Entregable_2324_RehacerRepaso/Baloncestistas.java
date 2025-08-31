package U5.EjerciciosRepaso.Entregable_2324_RehacerRepaso;

public class Baloncestistas extends Participante implements Encestar {
    private double altura;

    public Baloncestistas(String nomberParticipante, int edad, double altura) {
        super(nomberParticipante, edad);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void hacerjuramento() {
        System.out.println("Yo " + nomberParticipante + ", como jugador de baloncesto, juro los valores deportivos mundiales");
    }

    @Override
    public void encestar() {
        System.out.println("2 puntos!!!!!");
    }

    @Override
    public String toString() {
        return "Baloncestistas{" +
                "altura=" + altura +
                ", nomberParticipante='" + nomberParticipante + '\'' +
                ", edad='" + edad + '\'' +
                '}';
    }
}
