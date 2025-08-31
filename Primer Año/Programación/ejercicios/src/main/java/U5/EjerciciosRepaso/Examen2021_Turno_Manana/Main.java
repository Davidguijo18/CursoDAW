package U5.EjerciciosRepaso.Examen2021_Turno_Manana;

public class Main {
    public static void main(String[] args) {

        Conductor conductor1 = new Conductor("Antonia", "Candelaria", "Martinez", "8439374");
        Conductor conductor2 = new Conductor("Antonio", "Garcia", "Jimenez", "0284754");
        Conductor conductor3 = new Conductor("Pablo", "Fontao", "Ruiz", "19372483");

        CamionCaja camionCaja = new CamionCaja("9473 FEC", 28, conductor1);
        CamionPerchas camionPerchas = new CamionPerchas("0937 LCD", 31, conductor2);

        Prendas prenda1 = new Prendas(12, "Camisa", 423454278, 0.4);
        Prendas prenda2 = new Prendas(30, "Sudadera", 342379842, 1.2);
        Prendas prenda3 = new Prendas(5, "Calcetines", 432743246, 0.2);
        Prendas prenda4 = new Prendas(40, "Pantalon Vaquero", 94392452, 2);
        Prendas prenda5 = new Prendas(3, "Calzoncillo", 984343523, 0.3);
        Prendas prenda6 = new Prendas(20, "Pantalon chandal", 582347234, 1);
        Prendas prenda7 = new Prendas(50, "Chaqueta cuero", 273493724, 2);
        Prendas prenda8 = new Prendas(7, "Camiseta tirantes", 12343943, 0.8);
        Prendas prenda9 = new Prendas(13, "Camiseta termica", 483294824, 0.7);
        Prendas prenda10 = new Prendas(5, "Bufanda", 932437423, 0.4);
        Prendas prenda11 = new Prendas(28, "Chaqueta chandal", 693243034, 1.3);

        PrendasColgadas prendasColgada1 = new PrendasColgadas(19, "Camiseta de cuadros", 438293425, 1, 0.50);
        PrendasColgadas prendasColgada2 = new PrendasColgadas(900, "Traje de comunion", 432439424, 3, 1.50);
        PrendasColgadas prendasColgada3 = new PrendasColgadas(45, "Sudadara de Dragon Ball", 12345678, 1.9, 0.7);
        PrendasColgadas prendasColgada4 = new PrendasColgadas(2.50, "Bragas de cuello", 432884249, 0.3, 0.13);
        PrendasColgadas prendasColgada5 = new PrendasColgadas(300, "Ya no se que poner", 73737373, 5, 0.9);

        Caja caja1 = new Caja();
        caja1.anadirPrendaCaja(prenda1);
        caja1.anadirPrendaCaja(prenda2);
        caja1.anadirPrendaCaja(prenda3);
        caja1.anadirPrendaCaja(prenda4);
        caja1.anadirPrendaCaja(prenda5);
        caja1.anadirPrendaCaja(prenda6); //Al intentar agregar una nueva prenda esta dice que la caja ya esta llena

        Caja caja2 = new Caja();
        caja2.anadirPrendaCaja(prenda7);
        caja2.anadirPrendaCaja(prenda8);
        caja2.anadirPrendaCaja(prenda9);
        caja2.anadirPrendaCaja(prenda10);
        caja2.anadirPrendaCaja(prenda11);

        camionPerchas.anadirPrendasColgadas(prendasColgada1);
        camionPerchas.anadirPrendasColgadas(prendasColgada2);
        camionPerchas.anadirPrendasColgadas(prendasColgada3);
        camionPerchas.anadirPrendasColgadas(prendasColgada4);
        camionPerchas.anadirPrendasColgadas(prendasColgada5);
        camionPerchas.descargar();
        camionPerchas.borrarPrendasColgadas(prendasColgada2);
        camionPerchas.borrarPrendasColgadas(prendasColgada4);
        camionPerchas.descargar();

        camionCaja.anadirCaja(caja1);
        camionCaja.anadirCaja(caja2);
        camionCaja.borrarCaja(caja2);
        camionCaja.descargar();

        prenda3.devolver();
        prenda7.doblar();
        prendasColgada2.doblar();
        prendasColgada5.colgar();

        Fara fara = new Fara();
        fara.anadirCamionCajas(camionCaja);
        fara.anadirCamionPerchas(camionPerchas);

        fara.mostrarCamionCajaPorCajas();
        fara.mostrarCamionPerchas();
    }
}
