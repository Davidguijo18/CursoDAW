package U7.U6U7_Entregable;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Maraton {
    private Map<Integer, Atleta> mapaDorsalAtleta = new HashMap<>();
    private ArrayList<Atleta> listaAtletas = new ArrayList<>();

    public Maraton() {
    }

    public void mostrarMenu() {
        System.out.println("----- MENU PRINCIPAL ------");
        System.out.println("1 - Cargar atletas");
        System.out.println("2 - Guardar atletas");
        System.out.println("3 - Inscribir atleta");
        System.out.println("4 - Guardar tiempo");
        System.out.println("5 - Borrar atleta");
        System.out.println("6 - Mostrar lista de finishers");
        System.out.println("7 - Mostrar lista de una categoria");
        System.out.println("8 - Mostrar numero de participantes de un pais");
        System.out.println("9 - Volver a mostrar el menu");
        System.out.println("10 - Salir");
    }

    public void introducirOpciones() {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.print("Introduce una opcion: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    cargarAtletas();
                    break;

                case 2:
                    guardarAtletas();
                    break;

                case 3:
                    inscribirAtletaPorConsola();
                    break;

                case 4:
                    teclado.nextLine();
                    System.out.println("Introduce el numero de dorsal: ");
                    Integer numDorsal = teclado.nextInt();

                    System.out.println("Introduce el tiempo: ");
                    int tiempo = teclado.nextInt();

                    guardarTiempo(numDorsal, tiempo);
                    break;

                case 5:
                    teclado.nextLine();
                    System.out.print("Introduce el numero de dorsal: ");
                    Integer numDorsall = teclado.nextInt();

                    borrarAtleta(numDorsall);
                    break;

                case 6:
                    mostrarListaFinishers();
                    break;

                case 7:
                    teclado.nextLine();
                    System.out.print("Introduce la categoria: ");
                    String categoria = teclado.nextLine();

                    if (categoria.equalsIgnoreCase("JUNIOR")) {
                        mostrarListaCategorias(Atleta.Categoria.JUNIOR);
                    } else if (categoria.equalsIgnoreCase("SENIOR")) {
                        mostrarListaCategorias(Atleta.Categoria.SENIOR);
                    } else if (categoria.equalsIgnoreCase("VETERANO")) {
                        mostrarListaCategorias(Atleta.Categoria.VETERANO);
                    }
                    break;

                case 8:
                    teclado.nextLine();
                    System.out.print("Introduce un pais: ");
                    String pais = teclado.nextLine();

                    int numParticipantesPorPais = participatesPorPais(pais);
                    System.out.println("El numero de participantes es de: " + numParticipantesPorPais);
                    break;

                case 9:
                    mostrarMenu();
                    break;

                case 10:
                    System.out.println("Finalizaste el programa");
                    break;

                default:
                    System.out.println("Opcion invalida");
                    break;
            }

        } while (opcion != 10);
    }



    public void cargarAtletas() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("maraton.dat"))) {
            listaAtletas = (ArrayList<Atleta>) ois.readObject();

            for (Atleta a : listaAtletas) {
                mapaDorsalAtleta.put(a.getNumDorsal(), a);
            }
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void guardarAtletas() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("maraton.dat"))) {
            oos.writeObject(listaAtletas);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void inscribirAtletaPorConsola() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el nombre del atleta: ");
        String nombre = teclado.nextLine();

        System.out.print("Introduce el pais del atleta: ");
        String pais = teclado.nextLine();

        System.out.println("Introduce la categoria del atleta");
        String categoria = teclado.nextLine();

        if (categoria.equalsIgnoreCase("SENIOR")) {
            Atleta atleta = new Atleta(nombre, pais, Atleta.Categoria.SENIOR);
            mapaDorsalAtleta.put(atleta.getNumDorsal(), atleta);
            listaAtletas.add(atleta);

        } else if (categoria.equalsIgnoreCase("JUNIOR")) {
            Atleta atleta = new Atleta(nombre, pais, Atleta.Categoria.JUNIOR);
            mapaDorsalAtleta.put(atleta.getNumDorsal(), atleta);
            listaAtletas.add(atleta);

        } else if (categoria.equalsIgnoreCase("VETERANO")) {
            Atleta atleta = new Atleta(nombre, pais, Atleta.Categoria.VETERANO);
            mapaDorsalAtleta.put(atleta.getNumDorsal(), atleta);
            listaAtletas.add(atleta);
        }
    }

    public void inscribirAtleta(Atleta atleta) {
        listaAtletas.add(atleta);
        mapaDorsalAtleta.put(atleta.getNumDorsal(), atleta);
    }

    public void guardarTiempo(Integer numDorsal, int tiempo) {
        if (mapaDorsalAtleta.containsKey(numDorsal)) {
            Atleta atleta = mapaDorsalAtleta.get(numDorsal);
            atleta.setMarca(tiempo);
            atleta.setEsFinisher(true);

            listaAtletas.remove(atleta);
            listaAtletas.add(atleta);
            mapaDorsalAtleta.put(numDorsal, atleta);
        } else {
            System.out.println("No existe ningun corredor con dicho dorsal");
        }

    }

    public void borrarAtleta(Integer numDorsal) {
        if (mapaDorsalAtleta.containsKey(numDorsal)) {
            Atleta atleta = mapaDorsalAtleta.get(numDorsal);
            mapaDorsalAtleta.remove(numDorsal, atleta);
            listaAtletas.remove(atleta);
        } else {
            System.out.println("No existe ningun corredor con dicho dorsal");
        }
    }

    public void mostrarListaFinishers() {
        ArrayList<Atleta> finishers = new ArrayList<>();
        for (Atleta a : listaAtletas) {
            if (a.isEsFinisher()) {
                finishers.add(a);
            }
        }

        finishers.sort(new OrdenarAtletasPorTiempo());
        System.out.println(finishers);
    }

    public void mostrarListaCategorias(Atleta.Categoria categoria) {
        ArrayList<Atleta> listaPorCategorias = new ArrayList<>();
        for (Atleta a : listaAtletas) {
            if (categoria.equals(a.getCategoria())) {
                listaPorCategorias.add(a);
            }
        }
        listaAtletas.sort(new OrdenarAtletasPorTiempo());
        System.out.println(listaPorCategorias);
    }

    public int participatesPorPais(String pais) {
        int numInscritosEnPais = 0;
        for (Atleta a : listaAtletas) {
            if (pais.equalsIgnoreCase(a.getPais())) {
                numInscritosEnPais++;
            }
        }
        return numInscritosEnPais;
    }
}
