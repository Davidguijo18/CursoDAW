package U8.EjerciciosParaRepasar.EntregableJson;

public class Asignatura {
    private int id;
    private String nonbreAsignatura;
    private int idAlumno;

    public Asignatura(int id, String nonbreAsignatura, int idAlumno) {
        this.id = id;
        this.nonbreAsignatura = nonbreAsignatura;
        this.idAlumno = idAlumno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNonbreAsignatura() {
        return nonbreAsignatura;
    }

    public void setNonbreAsignatura(String nonbreAsignatura) {
        this.nonbreAsignatura = nonbreAsignatura;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "id=" + id +
                ", nonbreAsignatura='" + nonbreAsignatura + '\'' +
                ", idAlumno=" + idAlumno +
                '}';
    }
}
