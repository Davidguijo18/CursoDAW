package U5.Entregable;

public class Baloncestitas extends Participante implements Encestar {
    private double altura;

    public Baloncestitas(String nombreParticipante, int edad, double altura) {
        super(nombreParticipante, edad);
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
        System.out.println("Yo " + nombreParticipante + ", como jugador de baloncesto, juro los valores deportivos mundiales");
    }


    @Override
    public String toString() {
        return "Baloncestitas{" +
                "altura=" + altura +
                ", nombreParticipante='" + nombreParticipante + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public void encestar() {
        System.out.println("2 puntos!!!!!");
    }
}
