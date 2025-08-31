package U4.tarea1.Ejercicio8;

public class Bombilla {
    private boolean estado;
    private boolean estadoGeneral;

    public Bombilla() {
        estado = false;
        estadoGeneral = true;
    }

    public void mostrarEstado() {
        if (estadoGeneral) {
            System.out.println("\nInterruptor general --> Encendido");
        } else {
            System.out.println("Interruptor general --> Apagado");
        }

        if (estado) {
            System.out.println("La bombilla esta encendida");
        } else {
            System.out.println("La bombilla esta apagada");
        }
    }

    public void encenderBombilla() {
        if (!estadoGeneral) {
            System.out.println("\nInterruptor general --> Apagado");
            System.out.println("No se ha podido encender la bombilla");
        } else {
            if (estado) {
                System.out.println("\nInterruptor general --> Encendido");
                System.out.println("La bombilla ya esta encendida");
            } else {
                estado = true;
                System.out.println("\nInterruptor general --> Encendido");
                System.out.println("Se ha encendido la bombilla");
            }
        }
    }

    public void apagarBombilla() {
        if (!estadoGeneral) {
            System.out.println("\nInterruptor general --> Apagado");
            System.out.println("No se ha podido apagar la bombilla");
        } else {
            if (estado) {
                estado = false;
                System.out.println("\nInterruptor general --> Encendido");
                System.out.println("Se ha apagado la bombilla");
            } else {
                System.out.println("\nInterruptor general --> Encendido");
                System.out.println("La bombilla ya esta apagada");
            }
        }
    }

    public void encenderGeneral() {
        estadoGeneral = true;
        System.out.println("\nEl interruptor general esta encendido");
    }

    public void apagarGeneral() {
        estadoGeneral = false;
        System.out.println("\nEl interruptor general esta apagado");
    }
}
