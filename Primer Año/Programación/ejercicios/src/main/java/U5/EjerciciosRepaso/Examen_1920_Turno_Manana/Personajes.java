package U5.EjerciciosRepaso.Examen_1920_Turno_Manana;

public abstract class Personajes {
    protected String nombre;
    private int energia;
    private int capacidadAtaque;
    private int capacidadDefensa;
    protected boolean estaEncantado;

    public Personajes(String nombre, int energia, int capacidadAtaque, int capacidadDefensa, boolean estaEncantado) {
        this.nombre = nombre;

        if (energia > 0 && energia < 1000) {
            this.energia = energia;
        } else {
            System.out.println("El valor de energia debe ser entre 0 y 1000");
        }

        if (capacidadAtaque > 0 && capacidadAtaque < 100) {
            this.capacidadAtaque = capacidadAtaque;
        } else {
            System.out.println("El valor de la capacidad de ataque debe ser entre 0 y 100");
        }

        if (capacidadDefensa > 0 && capacidadDefensa < 100) {
            this.capacidadDefensa = capacidadDefensa;
        } else {
            System.out.println("El valor de la capacidad de defensa debe ser entre 0 y 100");
        }

        this.estaEncantado = estaEncantado;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getCapacidadAtaque() {
        return capacidadAtaque;
    }

    public void setCapacidadAtaque(int capacidadAtaque) {
        this.capacidadAtaque = capacidadAtaque;
    }

    public int getCapacidadDefensa() {
        return capacidadDefensa;
    }

    public void setCapacidadDefensa(int capacidadDefensa) {
        this.capacidadDefensa = capacidadDefensa;
    }

    @Override
    public String toString() {
        return "Personajes{" +
                "nombre='" + nombre + '\'' +
                ", energia=" + energia +
                ", capacidadAtaque=" + capacidadAtaque +
                ", capacidadDefensa=" + capacidadDefensa +
                ", estaEncantado=" + estaEncantado +
                '}';
    }
}
