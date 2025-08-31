package U7.U6U7_Examen;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Creo el objeto feria de sevilla, con el que voy a realizar todas las operaciones
        FeriaDeSevilla feriaDeSevilla = new FeriaDeSevilla();

        //Creo los objetos de tipo Caseta
        Caseta caseta1 = new Caseta("Los malabolas", "Calle camacho", 431.2);
        Caseta caseta2 = new Caseta("El nombre es lo de menos", "Calle camacho", 402.4);
        Caseta caseta3 = new Caseta("El correccional", "Calle agustin", 397.8);
        Caseta caseta4 = new Caseta("Oju que taja", "Calle San Pedro", 449.9);
        Caseta caseta5 = new Caseta("Ay dios mio", "Calle agustin", 489.2);

        Artista artista1 = new Artista("Pelko", "Reggaeton", "Espanola");
        Artista artista2 = new Artista("Maluma", "Reggaeton", "Colombiano");
        Artista artista3 = new Artista("Camaron", "Flamenco", "Espanola");
        Artista artista4 = new Artista("Akira Yamaoka", "Arte", "Japonesa");
        Artista artista5 = new Artista("Hardwell", "Electronica", "Estadounidense");

        //Anado los artistas en las casetas donde actuan
        feriaDeSevilla.addActuacion(caseta1, artista1);
        feriaDeSevilla.addActuacion(caseta1, artista4);

        feriaDeSevilla.addActuacion(caseta2, artista2);
        feriaDeSevilla.addActuacion(caseta2, artista4);

        feriaDeSevilla.addActuacion(caseta3, artista5);
        feriaDeSevilla.addActuacion(caseta3, artista3);

        feriaDeSevilla.addActuacion(caseta4, artista5);
        feriaDeSevilla.addActuacion(caseta4, artista1);

        feriaDeSevilla.addActuacion(caseta5, artista3);
        feriaDeSevilla.addActuacion(caseta5, artista2);


        //Muestro la listad de artistas que actuan en una caseta determinada
        List<Artista> listaArtistas = feriaDeSevilla.getArtistas(caseta1);
        System.out.println("La lista de artistas que actuan en la caseta " + caseta1 + "son:");
        for (Artista a : listaArtistas) {
            System.out.println(a);
        }

        System.out.println("\n--------------------------------------------------------------------");
        System.out.println();


        //Muestro la lista de casetas en las que actua un artista determinado
        List<Caseta> listaCasetas = feriaDeSevilla.getCasetas(artista1);
        System.out.println("La lista de casetas en las que actua el artista " + artista1 + " son:");
        for (Caseta c : listaCasetas) {
            System.out.println(c);
        }

        System.out.println("\n--------------------------------------------------------------------");
        System.out.println();


        //Muestro la caseta que contiene dicho nombre
        String nombreCaseta = "Oju que taja";
        Caseta caseta = feriaDeSevilla.getCaseta(nombreCaseta);
        if (caseta != null) {
            System.out.println("La caseta con el nombre " + nombreCaseta + " es: " + caseta);
        }

        System.out.println("\n--------------------------------------------------------------------");
        System.out.println();


        //Metodo para eliminar una caseta y vuelvo a comprobar la caseta anterior
        feriaDeSevilla.removeCaseta("Oju que taja");
        Caseta casetaComprobacionEliminacion = feriaDeSevilla.getCaseta(nombreCaseta);
        if (casetaComprobacionEliminacion != null) {
            System.out.println("La caseta con el nombre " + nombreCaseta + " es: " + casetaComprobacionEliminacion);
        }

        System.out.println("\n--------------------------------------------------------------------");
        System.out.println();


        //Muestro el artista que contiene dicho nombre
        String nombreArtista = "Hardwell";
        Artista artista = feriaDeSevilla.getArtista(nombreArtista);
        System.out.println("El artista cuyo nombre artistico es " + nombreArtista + " es: " + artista);

        //Guardo las estructuras de datos en el fichero
        feriaDeSevilla.guardarDatos();


        //------------------------------------------------------------------------------------------------------------

        /* DIVIDO EL CODIGO MAIN EN ESTE PUNTO PARA QUE COMPRUEBES QUE CARGAR DATOS FUNCIONA, PARA ELLO VOY A COMPROBARLO
        LLAMANDO A METODOS. ESTA PARTE ESTA COMENTADA PARA QUE NO INTERFIERA CON LO ANTERIOR. Si deseas comprobar que cargar
        datos funciona, comenta el codigo anterior y quitale los comentarios a estos metodos a estos nuevos metodos
        (Se que es tonteria que te explique esto, pero me ha sobrado tiempo de examen y queria tenerlo lo mas completo posible) */

//        feriaDeSevilla.cargarDatos();
//
//        String nombreArtistaComprobacion1 = "Camaron";
//        Artista artistaComprobacion1 = feriaDeSevilla.getArtista(nombreArtistaComprobacion1);
//        System.out.println("El artista cuyo nombre artistico es " + nombreArtistaComprobacion1 + " es: " + artistaComprobacion1);
//
//        String nombreArtistaComprobacion2 = "Akira Yamaoka";
//        Artista artistaComprobacion2 = feriaDeSevilla.getArtista(nombreArtistaComprobacion2);
//        System.out.println("El artista cuyo nombre artistico es " + nombreArtistaComprobacion2 + " es: " + artistaComprobacion2);
//
//        System.out.println("\n--------------------------------------------------------------------");
//        System.out.println();
//
//        //Dicha caseta no aparece ya que antes de ser guardada anteriormente habia sido eliminada
//        String nombreCasetaComprobacion1 = "Oju que taja";
//        Caseta casetaComprobacion1 = feriaDeSevilla.getCaseta(nombreCasetaComprobacion1);
//        if (casetaComprobacion1 != null) {
//            System.out.println("La caseta con el nombre " + nombreCasetaComprobacion1 + " es: " + casetaComprobacion1);
//        }
//
//        String nombreCasetaComprobacion2 = "El correccional";
//        Caseta casetaComprobacion2 = feriaDeSevilla.getCaseta(nombreCasetaComprobacion2);
//        if (casetaComprobacion2 != null) {
//            System.out.println("La caseta con el nombre " + nombreCasetaComprobacion2 + " es: " + casetaComprobacion2);
//        }
    }
}