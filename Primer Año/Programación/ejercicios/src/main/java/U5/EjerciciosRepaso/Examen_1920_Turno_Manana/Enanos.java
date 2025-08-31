package U5.EjerciciosRepaso.Examen_1920_Turno_Manana;

public class Enanos extends Personajes implements Atacar {

    private double altura;

    public Enanos(String nombre, int energia, int capacidadAtaque, int capacidadDefensa, boolean estaEncantado, double altura) {
        super(nombre, energia, capacidadAtaque, capacidadDefensa, estaEncantado);
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Enanos{" +
                "altura=" + altura +
                "} " + super.toString();
    }

    @Override
    public void atacarPersonaje(Personajes personaje) {
        System.out.println(nombre + " - Atacaddd");

        if (this.nombre.equalsIgnoreCase(personaje.getNombre())) {
            System.out.println("No se ha producido dano");
        } else {
            if (!personaje.estaEncantado) {
                personaje.setEnergia(personaje.getEnergia() - this.getCapacidadAtaque() - personaje.getCapacidadDefensa());
                if (personaje.getEnergia() <= 0) {
                    personaje.setEnergia(0);
                }
            } else {
                personaje.setEnergia((personaje.getEnergia() - this.getCapacidadAtaque() - personaje.getCapacidadDefensa() / 2));
                if (personaje.getEnergia() <= 0) {
                    personaje.setEnergia(0);
                }
            }
        }
    }
}
