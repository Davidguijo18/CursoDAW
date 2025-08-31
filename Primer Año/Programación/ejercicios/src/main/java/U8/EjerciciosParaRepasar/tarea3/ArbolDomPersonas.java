package U8.EjerciciosParaRepasar.tarea3;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class ArbolDomPersonas {
    private Document doc;

    public ArbolDomPersonas(String nombreFichero) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            doc = db.parse(new File("C:\\Users\\david\\Desktop\\programacion_23_24_\\ejercicios\\src\\main\\java\\U8\\EjerciciosParaRepasar\\tarea3\\" + nombreFichero));
        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }
    }

    public void mostrarContenido() {
        NodeList nodeList = doc.getElementsByTagName("persona");

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node nodo = nodeList.item(i);

            if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                Element e = (Element) nodeList.item(i);

                if (e.hasChildNodes()) {

                    NodeList nodeListHijos = nodo.getChildNodes();

                    for (int j = 0; j < nodeListHijos.getLength(); j++) {
                        if (nodeListHijos.item(j).getNodeType() == Node.ELEMENT_NODE) {
                            Element eHijo = (Element) nodeListHijos.item(j);
                            System.out.println("Etiqueta: " + eHijo.getTagName());
                            System.out.println("Contenido: " + eHijo.getTextContent());
                        }
                    }
                }
            }
        }
    }

    public void modificacionDePersona(String nombrePersonaParametro) {
        Element root = doc.getDocumentElement();
        NodeList personas = root.getElementsByTagName("persona");

        for (int i = 0; i < personas.getLength(); i++) {
            Node personaNodo = personas.item(i);

            if (personaNodo.getNodeType() == Node.ELEMENT_NODE) {
                Element personaElement = (Element) personaNodo;

                String nombrePersona = personaElement.getElementsByTagName("nombre").item(0).getTextContent();
                if (nombrePersonaParametro.equalsIgnoreCase(nombrePersona)) {
                    Element edadElement = (Element) personaElement.getElementsByTagName("edad").item(0);
                    int edad = Integer.parseInt(edadElement.getTextContent());
                    edadElement.setTextContent(String.valueOf(edad + 1));
                    break;
                }
            }
        }
    }

    public void guardarDocumento(String nombreFichero) {
        try {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("C:\\Users\\david\\Desktop\\programacion_23_24_\\ejercicios\\src\\main\\java\\U8\\EjerciciosParaRepasar\\tarea3\\" + nombreFichero));
            transformer.transform(source, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
