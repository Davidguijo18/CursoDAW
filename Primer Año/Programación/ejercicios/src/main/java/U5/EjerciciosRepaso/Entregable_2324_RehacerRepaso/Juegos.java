package U5.EjerciciosRepaso.Entregable_2324_RehacerRepaso;

import java.util.Arrays;

public class Juegos {

    private int anoCelebracion;
    private String sedeCelebracion;
    private Pais[] paises = new Pais[0];
    private Deporte[] deportes = new Deporte[0];
    private int contadorPaises = 0;
    private int contadorDeportes = 0;

    public Juegos(int anoCelebracion, String sedeCelebracion) {
        if (anoCelebracion % 4 != 0) {
            System.out.println("El ano no es multiplo de 4");
        } else {
            this.anoCelebracion = anoCelebracion;
        }

        this.sedeCelebracion = sedeCelebracion;
    }

    public void anadirPais(Pais pais) {
        paises = Arrays.copyOf(paises, paises.length + 1);
        paises[contadorPaises] = pais;
        contadorPaises++;
    }

    public void eliminarPais(Pais pais) {
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

    public void anadirDeportes(Deporte deporte) {
        deportes = Arrays.copyOf(deportes, deportes.length + 1);
        deportes[contadorDeportes] = deporte;
        contadorDeportes++;
    }

    public void eliminarDeportes(Deporte deporte) {
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
        Arrays.sort(paises, new OrdenarPaisesPorParticipantes());
        System.out.println(Arrays.toString(paises));
    }

    public void mostrarPaisesParaCeremonia() {
        Arrays.sort(paises);
        System.out.println(Arrays.toString(paises));
    }


}
