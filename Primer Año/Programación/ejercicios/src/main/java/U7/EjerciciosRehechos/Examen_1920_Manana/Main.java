package U7.EjerciciosRehechos.Examen_1920_Manana;public class Main {
    public static void main(String[] args) {
        // Crear un concurso
        Concurso concurso = new Concurso("Concurso Canino Internacional", "Ciudad Canina");

        // Crear propietarios
        Propietario propietario1 = new Propietario("Juan", "Pérez", 1234, "España");
        Propietario propietario2 = new Propietario("María", "López", 5678, "Francia");

        // Crear perros
        Perro perro1 = new Perro("Bobby", 3, 15.5, true, propietario1, "Bulldog");
        Perro perro2 = new Perro("Rex", 5, 20.0, false, propietario2, "Pastor Alemán");

        // Agregar perros al concurso
        concurso.addDog("Bulldog", perro1);
        concurso.addDog("Pastor Alemán", perro2);

        // Mostrar perros de un propietario
        System.out.println("Perros de Juan Pérez:");
        concurso.ownerDogs(1234);

        // Mostrar perros por peso y edad
        System.out.println("\nPerros Bulldog ordenados por peso:");
        concurso.perrosPorPeso("Bulldog");

        System.out.println("\nPerros Pastor Alemán ordenados por edad:");
        concurso.perrosPorEdad("Pastor Alemán");

        // Guardar y cargar perros desde el archivo
        concurso.guardarPerros();
        concurso.cargarPerros();
    }
}
