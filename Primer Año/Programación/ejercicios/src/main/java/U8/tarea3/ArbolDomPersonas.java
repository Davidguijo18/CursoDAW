package U8.tarea3;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import org.xml.sax.SAXException;

public class ArbolDomPersonas {

    private Document doc;

    public ArbolDomPersonas(String nomFile) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            doc = db.parse(new File(nomFile));
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }

    public void parse() {
        Element root = doc.getDocumentElement();
        NodeList personas = root.getElementsByTagName("persona");

        for (int i = 0; i < personas.getLength(); i++) {
            Node persona = personas.item(i);
            if (persona.getNodeType() == Node.ELEMENT_NODE) {
                Element personaElement = (Element) persona;

                String nombre = personaElement.getElementsByTagName("nombre").item(0).getTextContent();
                String edad = personaElement.getElementsByTagName("edad").item(0).getTextContent();

                System.out.println("Nombre: " + nombre);
                System.out.println("Edad: " + edad);
                System.out.println("------------------");
            }
        }
    }

    public void incrementarEdad(String nombrePersona) {
        Element root = doc.getDocumentElement();
        NodeList personas = root.getElementsByTagName("persona");

        for (int i = 0; i < personas.getLength(); i++) {
            Node persona = personas.item(i);
            if (persona.getNodeType() == Node.ELEMENT_NODE) {
                Element personaElement = (Element) persona;

                String nombre = personaElement.getElementsByTagName("nombre").item(0).getTextContent();
                if (nombre.equals(nombrePersona)) {
                    Element edadElement = (Element) personaElement.getElementsByTagName("edad").item(0);
                    int edad = Integer.parseInt(edadElement.getTextContent());
                    edadElement.setTextContent(String.valueOf(edad + 1));
                    break;
                }
            }
        }
    }

    public void guardarDocumento(String nomFile) {
        try {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(nomFile));
            transformer.transform(source, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}