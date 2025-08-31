package U5.U4U5_Examen;

public abstract class Multimedia {
    protected String titulo;
    protected int anoPublicacionEstreno;
    public static int contadorMultimediaCreada = 0;
    protected int id = 0;

    public Multimedia(String titulo, int anoPublicacionEstreno) {
        this.titulo = titulo;
        this.anoPublicacionEstreno = anoPublicacionEstreno;
        this.id = contadorMultimediaCreada;
        contadorMultimediaCreada++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacionEstreno() {
        return anoPublicacionEstreno;
    }

    public void setAnoPublicacionEstreno(int anoPublicacionEstreno) {
        this.anoPublicacionEstreno = anoPublicacionEstreno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Defino metodo abstracto
    public abstract void dado_por_finalizado();

}
