package U5.EjerciciosRepaso.Examen_1920_Turno_Manana;

public class Orcos extends Personajes implements Atacar {
    private double tonelaje;

    public Orcos(String nombre, int energia, int capacidadAtaque, int capacidadDefensa, boolean estaEncantado, double tonelaje) {
        super(nombre, energia, capacidadAtaque, capacidadDefensa, estaEncantado);
        this.tonelaje = tonelaje;
    }

    @Override
    public String toString() {
        return "Orcos{" +
                "tonelaje=" + tonelaje +
                "} " + super.toString();
    }

    @Override
    public void atacarPersonaje(Personajes personaje) {
        System.out.println(nombre + " - Argg te voy a matar");

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
