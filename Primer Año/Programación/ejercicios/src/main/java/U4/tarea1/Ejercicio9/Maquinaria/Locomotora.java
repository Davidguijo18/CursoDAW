package U4.tarea1.Ejercicio9.Maquinaria;

import U4.tarea1.Ejercicio9.Personal.Mecanico;

public class Locomotora {
    private String matricula;
    private int potenciaMotor;
    private int anoFabricacion;

    Mecanico mecanico = new Mecanico();

    public Locomotora() {
    }

    public Locomotora(String matricula, int potenciaMotor, int anoFabricacion, Mecanico mecanico) {
        this.matricula = matricula;
        this.potenciaMotor = potenciaMotor;
        this.anoFabricacion = anoFabricacion;
        this.mecanico = mecanico;
    }
}
