package U8.EjerciciosParaRepasar.tarea2;


import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.util.ArrayList;

public class PersonaDOM {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\david\\Desktop\\programacion_23_24_\\ejercicios\\src\\main\\java\\U8\\EjerciciosParaRepasar\\tarea2\\FichPersona.dat"))) {
            ArrayList<Persona> listaPersonas = (ArrayList<Persona>) ois.readObject();

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();

            Element elementoRoot = doc.createElement("personas");
            doc.appendChild(elementoRoot);

            for (Persona p : listaPersonas) {
                Element persona = doc.createElement("persona");

                Element nombre = doc.createElement("nombre");
                nombre.appendChild(doc.createTextNode(p.getNombre()));
                persona.appendChild(nombre);

                Element edad = doc.createElement("edad");
                edad.appendChild(doc.createTextNode(String.valueOf(p.getEdad())));
                persona.appendChild(edad);

                elementoRoot.appendChild(persona);
            }

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("C:\\Users\\david\\Desktop\\programacion_23_24_\\ejercicios\\src\\main\\java\\U8\\EjerciciosParaRepasar\\tarea2\\FichPersona.xml"));
            transformer.transform(source, result);

            System.out.println("Documento XML creado y guardado como FichPersona.xml");

        } catch (ClassNotFoundException | IOException | ParserConfigurationException | TransformerConfigurationException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        } catch (TransformerException e) {
            throw new RuntimeException(e);
        }
    }
}