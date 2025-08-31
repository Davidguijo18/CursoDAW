package U7.EjerciciosRehechos.Entregable_2021_Tarde;

public class Alumno {
    private String nombreAlumno;
    private String apellidos;
    private String dni;
    private int id;
    private static int contador = 0;
    private Unidad unidad;

    public Alumno(String nombreAlumno, String apellidos, String dni, Unidad unidad) {
        this.nombreAlumno = nombreAlumno;
        this.apellidos = apellidos;
        this.dni = dni;
        this.unidad = unidad;
        id = contador++;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Alumno.contador = contador;
    }

    public Unidad getUnidad() {
        return unidad;
    }

    public void setUnidad(Unidad unidad) {
        this.unidad = unidad;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombreAlumno='" + nombreAlumno + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", id=" + id +
                ", unidad=" + unidad +
                '}';
    }
}
