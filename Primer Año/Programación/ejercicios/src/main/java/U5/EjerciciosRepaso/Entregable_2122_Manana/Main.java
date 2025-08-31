package U5.EjerciciosRepaso.Entregable_2122_Manana;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("64926401L", "Juan Carlos Calero");
        Persona persona2 = new Persona("12840317P", "Matilde Ruiz Orta");
        Persona persona3 = new Persona("32760132N", "German Roche Bonilla");
        Persona persona4 = new Persona("95194528C", "Francisca Pacheco");
        Persona persona5 = new Persona("97212476T", "Chema Duran");

        LocalComercial localComercial = new LocalComercial(1997, "Avenida pajaro n43", 435, persona2, 320000, "Venta de ropa");
        LocalIndustrial localIndustrial = new LocalIndustrial(2004, "Poligino industrial sevilla", 1200, persona5, 3000000, 35000);

        Vivienda vivienda1 = new Vivienda(1989, "Calle Gamazo N43", 140, 2, 4, 4, 190000);
        Vivienda viviend2 = new Vivienda(2007, "Calle Barcelona N12", 85, 1, 2, 3, 125000);

        Registro registro = new Registro();
        registro.anadirPropiedad(vivienda1);
        registro.anadirPropiedad(localComercial);
        registro.anadirPropiedad(viviend2);
        registro.anadirPropiedad(localIndustrial);

        vivienda1.anadirPersona(persona1);
        vivienda1.anadirPersona(persona3);
        vivienda1.anadirPersona(persona4);

        System.out.println(vivienda1.getPersonasViviendo());
    }
}
