package U5.EjerciciosRepaso.Examen_1920_Turno_Manana;

public class Guerreros extends Hombres implements Atacar {
    private int edad;

    public Guerreros(String nombre, int energia, int capacidadAtaque, int capacidadDefensa, boolean estaEncantado, int edad) {
        super(nombre, energia, capacidadAtaque, capacidadDefensa, estaEncantado);
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Guerreros{" +
                "edad=" + edad +
                "} " + super.toString();
    }

    @Override
    public void atacarPersonaje(Personajes personaje) {
        System.out.println(nombre + " - Voy a por tiiii");

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