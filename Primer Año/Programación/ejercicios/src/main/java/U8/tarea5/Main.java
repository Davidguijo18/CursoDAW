package U8.tarea5;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();

        ArrayList<Futbolista> listaFutbolistas = new ArrayList<>();
        Futbolista casillas = new Futbolista(1, "Casillas", "Real Madrid");
        Futbolista ramos = new Futbolista(15, "Ramos", "Real Madrid");
        Futbolista pique = new Futbolista(3, "Pique", "FC Barcelona");
        Futbolista puyol = new Futbolista(5, "Puyol", "FC Barcelona");
        Futbolista capdevila = new Futbolista(11, "Capdevila", "Villareal");
        Futbolista xabiAlonso = new Futbolista(14, "Xabi Alonso", "Real Madrid");
        Futbolista busquets = new Futbolista(16, "Busquets", "FC Barcelona");
        Futbolista xaviHernandez = new Futbolista(8, "Xavi Hernandez", "FC Barcelona");
        Futbolista pedrito = new Futbolista(18, "Pedrito", "FC Barcelona");
        Futbolista iniesta = new Futbolista(6, "Iniesta", "FC Barcelona");
        Futbolista villa = new Futbolista(7, "Villa", "FC Barcelona");

        ArrayList<String> posiciones1 = new ArrayList<>();
        posiciones1.add("Portero");
        casillas.setDemarcaciones(posiciones1);

        ArrayList<String> posiciones2 = new ArrayList<>();
        posiciones2.add("Lateral derecho");
        posiciones2.add("Medio centro");
        ramos.setDemarcaciones(posiciones2);

        ArrayList<String> posiciones3 = new ArrayList<>();
        posiciones3.add("Central");
        pique.setDemarcaciones(posiciones3);

        ArrayList<String> posiciones4 = new ArrayList<>();
        posiciones4.add("Central");
        puyol.setDemarcaciones(posiciones4);

        ArrayList<String> posiciones5 = new ArrayList<>();
        posiciones5.add("Lateral izquierdo");
        capdevila.setDemarcaciones(posiciones5);

        ArrayList<String> posiciones6 = new ArrayList<>();
        posiciones6.add("Defensa mediocampo");
        posiciones6.add("Mediocampo");
        xabiAlonso.setDemarcaciones(posiciones6);

        ArrayList<String> posiciones7 = new ArrayList<>();
        posiciones7.add("Defensa mediocampo");
        busquets.setDemarcaciones(posiciones7);

        ArrayList<String> posiciones8 = new ArrayList<>();
        posiciones8.add("Mediocampo");
        xaviHernandez.setDemarcaciones(posiciones8);

        ArrayList<String> posiciones9 = new ArrayList<>();
        posiciones9.add("Extremo izquierdo");
        posiciones9.add("Falso extremo");
        pedrito.setDemarcaciones(posiciones9);

        ArrayList<String> posiciones10 = new ArrayList<>();
        posiciones10.add("Extremo derecho");
        posiciones10.add("Mediocampo");
        iniesta.setDemarcaciones(posiciones10);

        ArrayList<String> posiciones11 = new ArrayList<>();
        posiciones11.add("Delantero centro");
        villa.setDemarcaciones(posiciones11);


        listaFutbolistas.add(casillas);
        listaFutbolistas.add(ramos);
        listaFutbolistas.add(pique);
        listaFutbolistas.add(puyol);
        listaFutbolistas.add(ramos);
        listaFutbolistas.add(capdevila);
        listaFutbolistas.add(xabiAlonso);
        listaFutbolistas.add(busquets);
        listaFutbolistas.add(xaviHernandez);
        listaFutbolistas.add(pedrito);
        listaFutbolistas.add(iniesta);
        listaFutbolistas.add(villa);

        System.out.println(gson.toJson(listaFutbolistas));
        String json_completo = gson.toJson(listaFutbolistas);

        System.out.println();

        ArrayList<Futbolista> futbolistas = gson.fromJson(json_completo, listaFutbolistas.getClass());
        System.out.println(futbolistas);

        String json_array = gson.toJson(posiciones2);
        Type listType = new TypeToken<ArrayList<String>>() {
        }.getType();
        ArrayList<String> array_de_json = gson.fromJson(json_array, listType);

        System.out.println();
        System.out.println(array_de_json);
    }
}
