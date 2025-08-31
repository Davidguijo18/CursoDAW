package U5.tarea2.Ejercicio2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cliente[] clientes = new Cliente[5];
        Cliente cliente1 = new Cliente("Rogelio Jesus", "84034143P", 34, 2500.54);
        Cliente cliente2 = new Cliente("Abdul Jalil Shisha", "43918236L", 29, 1403.32);
        Cliente cliente3 = new Cliente("Ramon Roman", "54839201G", 56, 3700.50);
        Cliente cliente4 = new Cliente("German Adolfo Roche Bonilla", "66786423M", 35, 1600);
        Cliente cliente5 = new Cliente("Matilde Ruiz Orta ", "85934718E", 52, 2100);

        clientes[0] = cliente1;
        clientes[1] = cliente2;
        clientes[2] = cliente3;
        clientes[3] = cliente4;
        clientes[4] = cliente5;

        Arrays.sort(clientes);
        System.out.println(Arrays.toString(clientes));

        Arrays.sort(clientes, new OrdenarPorNombre());
        System.out.println(Arrays.toString(clientes));

        Arrays.sort(clientes, new OrdenarPorEdad());
        System.out.println(Arrays.toString(clientes));
    }
}
