package U5.EjerciciosRepaso.Examen_1920_Turno_Manana;

public class Elfos extends Personajes implements Atacar {
    private Tipo tipo;

    public Elfos(String nombre, int energia, int capacidadAtaque, int capacidadDefensa, boolean estaEncantado, Tipo tipo) {
        super(nombre, energia, capacidadAtaque, capacidadDefensa, estaEncantado);
        this.tipo = tipo;
    }

    @Override
    public void atacarPersonaje(Personajes personaje) {
        System.out.println(nombre + " - Atacoooo");

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

    public enum Tipo {
        BOSQUE,
        COSTA
    }

    @Override
    public String toString() {
        return "Elfos{" +
                "tipo=" + tipo +
                "} " + super.toString();
    }
}
