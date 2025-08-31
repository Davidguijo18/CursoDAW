package U5.EjerciciosRepaso.Examen_1920_Turno_Manana;

public class Magos extends Hombres implements Magia {
    private int longitudBarba;

    public Magos(String nombre, int energia, int capacidadAtaque, int capacidadDefensa, boolean estaEncantado, int longitudBarba) {
        super(nombre, energia, capacidadAtaque, capacidadDefensa, estaEncantado);
        this.longitudBarba = longitudBarba;
    }

    @Override
    public String toString() {
        return "Magos{" +
                "longitudBarba=" + longitudBarba +
                "} " + super.toString();
    }

    @Override
    public void encantar(Personajes personaje) {
        if (!estaEncantado) {
            estaEncantado = true;
        } else {
            System.out.println("El personaje ya esta encantado");
        }
    }

    @Override
    public void desencantar(Personajes personaje) {
        if (estaEncantado) {
            estaEncantado = false;
        } else {
            System.out.println("El personaje no esta encantado");
        }
    }
}
