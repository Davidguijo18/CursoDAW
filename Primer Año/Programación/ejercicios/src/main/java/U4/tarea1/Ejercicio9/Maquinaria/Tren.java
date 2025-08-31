package U4.tarea1.Ejercicio9.Maquinaria;

import U4.tarea1.Ejercicio9.Personal.Maquinista;

public class Tren {

    Locomotora locomotora = new Locomotora();
    Maquinista maquinista = new Maquinista();
    Vagon[] vagon = new Vagon[5];

    public Tren() {
    }

    public Tren(Locomotora locomotora, Maquinista maquinista, Vagon vagon) {
        this.locomotora = locomotora;
        this.maquinista = maquinista;
        this.vagon = new Vagon[]{vagon};
    }

    public Locomotora getLocomotora() {
        return locomotora;
    }

    public void setLocomotora(Locomotora locomotora) {
        this.locomotora = locomotora;
    }

    public Maquinista getMaquinista() {
        return maquinista;
    }

    public void setMaquinista(Maquinista maquinista) {
        this.maquinista = maquinista;
    }

    public Vagon[] getVagon() {
        return vagon;
    }

    public void setVagon(Vagon[] vagon) {
        this.vagon = vagon;
    }
}
