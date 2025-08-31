package U4.tarea4;

import java.util.Arrays;

public class Pizza {
    private String tamano;
    private Ingrediente[] ingredientes;

    public Pizza() {
        tamano = "familiar";
        ingredientes = new Ingrediente[0];
    }

    public Pizza(String tamano) {
        this.tamano = tamano;
        ingredientes = new Ingrediente[0];
    }

    public void mostrarTamanoDisponible() {
        System.out.println("Tamaños disponibles:");
        System.out.println("- Pizza Familiar");
        System.out.println("- Pizza Mediana");
    }


    public void modificarTamano() {
        if (tamano.equals("familiar")) {
            tamano = "mediana";
            System.out.println("Tamaño de la pizza cambiado: " + tamano);
        } else if (tamano.equals("mediana")) {
            tamano = "familiar";
            System.out.println("Tamaño de la pizza cambiado: " + tamano);
        }
    }

    public boolean anadirIngrediente(Ingrediente ingrediente) {
        if (ingredientes.length < 3) {
            ingredientes = Arrays.copyOf(ingredientes, ingredientes.length + 1);
            ingredientes[ingredientes.length - 1] = ingrediente;
            return true;
        }
        return false;
    }

    public void obtenerCantidadIngredientes() {
        System.out.println("Cantidad de ingredientes: " + ingredientes.length);
    }

    public void mostrarInformacion() {
        System.out.println("Tamano de la pizza: " + tamano);
        System.out.print("Ingredientes: ");
        for (int i = 0; i < ingredientes.length; i++) {
            System.out.print("Nombre --> " + ingredientes[i].getNombre());
            System.out.print("Calorias --> " + ingredientes[i].getNumCaloriasCada100g());
            System.out.println();
        }
    }
}
