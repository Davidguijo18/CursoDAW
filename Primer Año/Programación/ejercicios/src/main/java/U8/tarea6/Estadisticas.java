package U8.tarea6;

public class Estadisticas {
    private Integer goles;
    private Integer pases;
    private Integer faltas;

    public Estadisticas(Integer goles, Integer pases, Integer faltas) {
        this.goles = goles;
        this.pases = pases;
        this.faltas = faltas;
    }

    public Integer getGoles() {
        return goles;
    }

    public void setGoles(Integer goles) {
        this.goles = goles;
    }

    public Integer getPases() {
        return pases;
    }

    public void setPases(Integer pases) {
        this.pases = pases;
    }

    public Integer getFaltas() {
        return faltas;
    }

    public void setFaltas(Integer faltas) {
        this.faltas = faltas;
    }

    @Override
    public String toString() {
        return "Estadisticas{" +
                "goles=" + goles +
                ", pases=" + pases +
                ", faltas=" + faltas +
                '}';
    }
}
