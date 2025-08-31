package U5.Entregable;

import java.util.Arrays;
import java.util.Objects;

public class Juego {
    private int anoCelebracion;
    private String sedeCelebracion;
    private Pais[] paises = new Pais[0];
    private Deporte[] deportes = new Deporte[0];
    private int contadorPaises;
    private int contadorDeportes;


    public Juego(int anoCelebracion, String sedeCelebracion) {
        this.anoCelebracion = anoCelebracion;
        this.sedeCelebracion = sedeCelebracion;
    }

    public void anadirPaises(Pais pais) {
        paises = Arrays.copyOf(paises, paises.length + 1);
        paises[contadorPaises] = pais;
        contadorPaises++;
    }

    public void eliminarPaises(Pais pais) {
        int posicion = 0;
        for (int i = 0; i < contadorPaises; i++) {
            if (paises[i].getNombrePais().equals(pais.getNombrePais())) {
                posicion = i;
            }
        }
        Pais[] copia_pais = Arrays.copyOfRange(paises, posicion + 1, paises.length);
        if (paises.length == contadorPaises) {
            paises = Arrays.copyOf(paises, paises.length - 1);
        }
        for (int i = 0; i < copia_pais.length; i++) {
            paises[posicion] = copia_pais[i];
            posicion++;
        }
        contadorPaises--;
    }

    public void anadirDeporte(Deporte deporte) {
        deportes = Arrays.copyOf(deportes, deportes.length + 1);
        deportes[contadorDeportes] = deporte;
        contadorDeportes++;
    }

    public void eliminarDeporte(Deporte deporte) {
        int posicion = 0;
        for (int i = 0; i < contadorDeportes; i++) {
            if (deportes[i].getNombreDeporte().equals(deporte.getNombreDeporte())) {
                posicion = i;
            }
        }
        Deporte[] copia_deporte = Arrays.copyOfRange(deportes, posicion + 1, deportes.length);
        if (deportes.length == contadorDeportes) {
            deportes = Arrays.copyOf(deportes, deportes.length - 1);
        }
        for (int i = 0; i < copia_deporte.length; i++) {
            deportes[posicion] = copia_deporte[i];
            posicion++;
        }
        contadorDeportes--;
    }

    public void mostrarPaises() {
        Arrays.sort(paises, new OrdenarPaisesParticipantes());
    }

    public void mostrarPaisesParaCeremonia() {
        Arrays.sort(paises, new OrdenarPaisesNombre());
    }

    @Override
    public String toString() {
        return "Juego{" +
                "anoCelebracion=" + anoCelebracion +
                ", sedeCelebracion='" + sedeCelebracion + '\'' +
                ", paises=" + Arrays.toString(paises) +
                ", deportes=" + Arrays.toString(deportes) +
                '}';
    }
}
