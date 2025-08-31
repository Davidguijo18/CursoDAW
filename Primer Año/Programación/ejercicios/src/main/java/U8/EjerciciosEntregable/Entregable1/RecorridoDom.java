package U8.EjerciciosEntregable.Entregable1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class RecorridoDom {
    public RecorridoDom() {

    }

    public void numNodoHijos() {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc =
                    db.parse(new File("C:\\Users\\DAW_M\\Desktop\\programacion_23_24_\\ejercicios\\src\\main\\java\\U8\\EjerciciosEntregable\\Entregable1\\perrosXML.xml"));

            Element root = doc.getDocumentElement();
            System.out.println("Numeros de nodos hijos: " + root.getChildNodes().getLength());

            NodeList nl = root.getChildNodes();

            System.out.println("\n -------- NODOS --------");
            for (int i = 0; i < nl.getLength(); i++) {
                System.out.println("Tipo:" + nl.item(i).getNodeType());
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            for (StackTraceElement element : e.getStackTrace()) {
                System.out.println(element);
            }
        }
    }

    public void mostrarXMLDom() {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("C:\\Users\\DAW_M\\Desktop\\programacion_23_24_\\ejercicios\\src\\main\\java\\U8\\EjerciciosEntregable\\Entregable1\\perrosXML.xml"));

            NodeList nl = doc.getElementsByTagName("perro");

            for (int i = 0; i < nl.getLength(); i++) {
                Node nodo = nl.item(i);

                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                    Element e = (Element) nl.item(i);
                    System.out.println("Tipo de etiqueta: " + e.getTagName());
                }
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            for (StackTraceElement element : e.getStackTrace()) {
                System.out.println(element);
            }
        }
    }

    public void mostrarContenidoEtiquetaString(String s) {
        int aparicionEtiqueta = 0;

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("C:\\Users\\DAW_M\\Desktop\\programacion_23_24_\\ejercicios\\src\\main\\java\\U8\\EjerciciosEntregable\\Entregable1\\perrosXML.xml"));

            NodeList nl = doc.getElementsByTagName("perros");

            for (int i = 0; i < nl.getLength(); i++) {
                Node nodo = nl.item(i);

                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                    Element e = (Element) nl.item(i);
                    System.out.println("Contenido: " + e.getTextContent());
                    if (e.getTagName().equalsIgnoreCase(s)) {
                        aparicionEtiqueta++;
                    }

                    if (e.hasChildNodes()) {
                        NodeList listaInterior = nodo.getChildNodes();

                        for (int j = 0; j < listaInterior.getLength(); j++) {

                            if (listaInterior.item(j).getNodeType() == Node.ELEMENT_NODE) {
                                Element eHijo = (Element) listaInterior.item(j);
                                System.out.println("Contenido: " + eHijo.getTextContent());
                                if (eHijo.getTagName().equalsIgnoreCase(s)) {
                                    aparicionEtiqueta++;
                                }
                            }
                        }
                    }
                }
            }
            if (aparicionEtiqueta == 0) {
                System.out.println("No hay ninguna ocurrencia de la etiqueta " + s);
            } else {
                System.out.println("La etiqueta: " + s + " aparece un total de " + aparicionEtiqueta + " veces");
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            for (StackTraceElement element : e.getStackTrace()) {
                System.out.println(element);
            }
        }
    }
}
