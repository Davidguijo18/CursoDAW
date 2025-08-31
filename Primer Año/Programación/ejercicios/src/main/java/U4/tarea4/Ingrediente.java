package U4.tarea4;

public class Ingrediente {
    private String nombre;
    private int numCaloriasCada100g;

    public Ingrediente() {
        nombre = "Queso";
        numCaloriasCada100g = 250;
    }

    public Ingrediente(String nombre, int numCaloriasCada100g) {
        this.nombre = nombre;
        this.numCaloriasCada100g = numCaloriasCada100g;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getNumCaloriasCada100g() {
        return this.numCaloriasCada100g;
    }
}
