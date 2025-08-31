package U5.EjerciciosRepaso.Examen_1920_Turno_Manana;

public abstract class Hombres extends Personajes {
    public Hombres(String nombre, int energia, int capacidadAtaque, int capacidadDefensa, boolean estaEncantado) {
        super(nombre, energia, capacidadAtaque, capacidadDefensa, estaEncantado);
    }

    @Override
    public String toString() {
        return "Hombres{} " + super.toString();
    }
}
