package U8.tarea2;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class ParserDom {

    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("FichPersona.dat"))) {
            List<Persona> personas = (List<Persona>) ois.readObject();

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();

            Element rootElement = doc.createElement("personas");
            doc.appendChild(rootElement);

            for (Persona persona : personas) {
                Element personaElement = doc.createElement("persona");

                Element nombreElement = doc.createElement("nombre");
                nombreElement.appendChild(doc.createTextNode(persona.getNombre()));
                personaElement.appendChild(nombreElement);

                Element edadElement = doc.createElement("edad");
                edadElement.appendChild(doc.createTextNode(String.valueOf(persona.getEdad())));
                personaElement.appendChild(edadElement);

                rootElement.appendChild(personaElement);
            }

            // Escribir el documento XML en un archivo
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("personas.xml"));
            transformer.transform(source, result);

            System.out.println("Documento XML creado y guardado como personas.xml");

        } catch (IOException | ClassNotFoundException | ParserConfigurationException | TransformerException e) {
            e.printStackTrace();
        }
    }
}



