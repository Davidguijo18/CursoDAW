package U6.tarea4;

public class Main {
    public static void main(String[] args) {
        RegistroLibros registro = new RegistroLibros(10);

        // Añadir libros al registro
        registro.addLibro("El Quijote", "Miguel de Cervantes");
        registro.addLibro("Don Juan Tenorio", "Jose Zorrilla");
        registro.addLibro("La Celestina", "Fernando de Rojas");
        registro.addLibro("Cien anos de soledad", "Gabriel Garcia Marquez");

        // Buscar un libro en el registro
        System.out.println("El Quijote esta en el registro? " + registro.buscaLibro("El Quijote"));

        // Cargar libros desde un fichero y guardar el registro en otro fichero
        registro.cargarRegistroDesdeFichero("libros.txt");
        registro.cargarRegistroAfichero("registro_libros.txt");
    }
}
