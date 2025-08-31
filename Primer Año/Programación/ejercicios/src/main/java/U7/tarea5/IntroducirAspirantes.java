package U7.tarea5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IntroducirAspirantes {

    private static int identificador;
    private Map<Integer, Aspirante> listaAspirantes;
    private ArrayList<Integer> listaIdenficiadores;

    public IntroducirAspirantes() {
        identificador = 1;
        listaAspirantes = new HashMap();
        listaIdenficiadores = new ArrayList();
    }

    public void insertarAspirante() {
        Scanner teclado = new Scanner(System.in);
        String continua;

        do {
            System.out.print("\nIntroduce el nombre: ");
            String nombre = teclado.nextLine();

            System.out.print("Introduce el dni: ");
            String dni = teclado.nextLine();

            System.out.print("Introduce el telefono: ");
            int telefono = teclado.nextInt();

            Aspirante aspirante = new Aspirante(nombre, dni, telefono);
            aspirante.setId(identificador);
            identificador++;
            System.out.println(aspirante.getNombre() + " ha sido asignado con el identificador: " + aspirante.getId());

            listaAspirantes.put(aspirante.getId(), aspirante);
            listaIdenficiadores.add(aspirante.getId());

            teclado.nextLine();
            System.out.print("\nDesea insertar otro aspirante? (Si/No): ");
            continua = teclado.nextLine();

            if (continua.equalsIgnoreCase("no")) {
                System.out.println("Has finalizado la insercion");
            }

        } while (!continua.equalsIgnoreCase("no"));
    }

    public void guardarFicheros() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\ficheros\\aspirantes.dat"))) {
            oos.writeObject(listaAspirantes);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream("C:\\ficheros\\ids_aspirantes.dat"))) {
            oos2.writeObject(listaIdenficiadores);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}