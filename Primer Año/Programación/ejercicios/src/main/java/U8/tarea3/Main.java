package U8.tarea3;

public class Main {
    public static void main(String[] args) {
        String archivoXML = "src/main/java/U8_xml_json/XML/ejercicios/ejemploDOM/personas.xml";

        ArbolDomPersonas arbol = new ArbolDomPersonas(archivoXML);

        System.out.println("Contenido inicial del XML:");
        arbol.parse();

        // Incrementar la edad de una persona
        arbol.incrementarEdad("Pepe");

        System.out.println("Contenido del XML después de incrementar la edad de Pepe:");
        arbol.parse();

        // Guardar los cambios en el archivo XML
        arbol.guardarDocumento(archivoXML);

        System.out.println("Los cambios han sido guardados en el archivo.");
    }
}
