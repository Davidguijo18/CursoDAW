package U7.EjerciciosRepaso.Examen_1920_Manana;

public class Main {
    public static void main(String[] args) {

        Concurso concurso = new Concurso("Can-peon", "Velez de Venaudalla");
        Propietario propietario1 = new Propietario("Rogelio","Escobilla Linares",165,"Francia");
        Propietario propietario2 = new Propietario("Cristian","Utrilla Gonzalez",842,"Australia");
        Propietario propietario3 = new Propietario("Samuel","Diaz Ramirez",379,"Espana");

        Perro perro1 = new Perro("Deborador de mundos",2,3.4,true,propietario1,"yorsay");
        Perro perro2 = new Perro("Pastelito de fresa",7,65.5,true,propietario1,"pitbull");
        Perro perro3 = new Perro("Fabian",5,8.2,true,propietario1,"bulldog");
        Perro perro4 = new Perro("Anacardo",3,4,true,propietario2,"yorsay");
        Perro perro5 = new Perro("Osito de gominola",6,62,true,propietario2,"pitbull");
        Perro perro6 = new Perro("Destructor de ecosistemas",4,4.1,true,propietario2,"chihuahua");
        Perro perro7 = new Perro("Pancracio",10,9,true,propietario2,"bulldog");
        Perro perro8 = new Perro("Coloso destruyeplanetas",1,2,true,propietario3,"chihuahua");
        Perro perro9 = new Perro("Dulcecito de crema",8,61.9,true,propietario3,"pitbull");
        Perro perro10 = new Perro("Piolin",11,5,true,propietario3,"yorsay");

        //concurso.cargarPerros();

        concurso.addDog(perro1.getRazaPerro(),perro1);
        concurso.addDog(perro2.getRazaPerro(),perro2);
        concurso.addDog(perro3.getRazaPerro(),perro3);
        concurso.addDog(perro4.getRazaPerro(),perro4);
        concurso.addDog(perro5.getRazaPerro(),perro5);
        concurso.addDog(perro6.getRazaPerro(),perro6);
        concurso.addDog(perro7.getRazaPerro(),perro7);
        concurso.addDog(perro8.getRazaPerro(),perro8);
        concurso.addDog(perro9.getRazaPerro(),perro9);
        concurso.addDog(perro10.getRazaPerro(),perro10);

        concurso.ownerDogs(842);

        concurso.disqualifyDog(perro4);

        concurso.guardarPerros();
    }
}
