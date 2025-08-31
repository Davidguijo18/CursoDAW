package U4.tarea2.Ejercicio3;

import U4.tarea2.Ejercicio1.Lista;


public class PilaLista {

    Lista lista;

    public PilaLista() {
        lista = new Lista();
    }

    public void mostrarPila() {
        lista.mostrarLista();
    }

    public void apilar(int numero) {
        lista.insertarNumeroFinal(numero);
    }

    public void desapilar() {
        lista.eliminarNumero(lista.numerosInsertados() - 1);
    }

    public void cima() {
        int cima = lista.obtenerNumero(lista.numerosInsertados() - 1);
        System.out.println("Cima: " + cima);
    }
}
