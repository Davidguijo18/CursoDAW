package U5.U4U5_Examen;

import java.util.Arrays;

public class Serie extends Multimedia implements Reproducible {
    private String creadorSerie;
    private int numTemporadas;
    private String[] capitulos = new String[0];
    private int contador = 0;

    public Serie(String titulo, String creadorSerie, int numTemporadas, int anoEstreno) {
        super(titulo, anoEstreno);
        this.creadorSerie = creadorSerie;
        this.numTemporadas = numTemporadas;
    }

    public String getCreadorSerie() {
        return creadorSerie;
    }

    public void setCreadorSerie(String creadorSerie) {
        this.creadorSerie = creadorSerie;
    }

    public int getNumTemporadas() {
        return numTemporadas;
    }

    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }


    //Metodo para anadir capitulos a las series
    public void anadirCapitulo(String capitulo) {
        capitulos = Arrays.copyOf(capitulos, capitulos.length + 1);
        capitulos[contador] = capitulo;
        contador++;
    }

    //Metodo para eliminar capitulos a las series
    public boolean eliminarCapitulo(String capitulo) {
        int controlador = 0;
        int posicion = 0;
        for (int i = 0; i < contador; i++) {
            if (capitulos[i].equalsIgnoreCase(capitulo)) {
                posicion = i;
                controlador = 2;
            }
        }
        String[] copiaCapitulos = Arrays.copyOfRange(capitulos, posicion + 1, capitulos.length);
        if (capitulos.length == contador) {
            capitulos = Arrays.copyOf(capitulos, capitulos.length - 1);
        }
        for (int i = 0; i < copiaCapitulos.length; i++) {
            capitulos[posicion] = copiaCapitulos[i];
            posicion++;
        }
        contador--;

        if (controlador == 2) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void dado_por_finalizado() {
        System.out.println(titulo + " ha finalizado");
    }

    //Estos metodos (play(),pause(),stop() han sido implementados a traves de la interfaz Reproducible)
    @Override
    public void play() {
        System.out.println("Reproduciendo serie " + titulo + ", capítulo " + capitulos[seleccionarCapituloAleatorio()]);
    }

    @Override
    public void pause() {
        System.out.println("Pausando serie " + titulo + ", capítulo " + capitulos[seleccionarCapituloAleatorio()]);
    }

    @Override
    public void stop() {
        System.out.println("Parando serie " + titulo + ", capítulo " + capitulos[seleccionarCapituloAleatorio()]);
    }

    //Este metodo devolvera un capitulo aleatorio del array para ser mostrados en los metodos play(), pause(), stop()
    public int seleccionarCapituloAleatorio() {
        return (int) (Math.random() * capitulos.length);
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", creadorSerie='" + creadorSerie + '\'' +
                ", numTemporadas=" + numTemporadas +
                ", capitulos=" + Arrays.toString(capitulos) +
                ", anoEstreno=" + anoPublicacionEstreno +
                ", id ='" + id + '\'' +
                '}';
    }
}