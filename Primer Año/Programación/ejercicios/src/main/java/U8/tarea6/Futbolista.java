package U8.tarea6;

public class Futbolista {
    private Integer id;
    private String nombre;
    private String equipo;
    private Estadisticas estadisticas;

    public Futbolista(Integer id, String nombre, String equipo, Estadisticas estadisticas) {
        this.id = id;
        this.nombre = nombre;
        this.equipo = equipo;
        this.estadisticas = estadisticas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public Estadisticas getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(Estadisticas estadisticas) {
        this.estadisticas = estadisticas;
    }

    @Override
    public String toString() {
        return "Futbolista{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", equipo='" + equipo + '\'' +
                ", estadisticas=" + estadisticas +
                '}';
    }
}
