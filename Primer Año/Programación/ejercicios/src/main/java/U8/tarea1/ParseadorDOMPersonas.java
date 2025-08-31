package U8.tarea1;

import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import org.xml.sax.SAXException;

public class ParseadorDOMPersonas {

    public static void parse(String nomFile) {
        try {
            // Crear las instancias de DocumentBuilderFactory y DocumentBuilder
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            // Parsear el archivo XML y obtener el documento
            Document doc = db.parse(new File(nomFile));
            doc.getDocumentElement().normalize();

            // Obtener la lista de elementos "persona"
            NodeList nodeList = doc.getElementsByTagName(Etiquetas.PERSONA);

            // Recorrer la lista de nodos "persona"
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;

                    // Obtener y mostrar el nombre
                    String nombre = element.getElementsByTagName(Etiquetas.NOMBRE).item(0).getTextContent();
                    System.out.println("Nombre: " + nombre);

                    // Obtener y mostrar la edad
                    String edad = element.getElementsByTagName(Etiquetas.EDAD).item(0).getTextContent();
                    System.out.println("Edad: " + edad);

                    System.out.println("--------------------------------");
                }
            }
        } catch (ParserConfigurationException e) {
            System.err.println("Error en la configuración del parser: " + e.getMessage());
        } catch (SAXException e) {
            System.err.println("Error al parsear el archivo XML: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error al leer el archivo XML: " + e.getMessage());
        }
    }
}
