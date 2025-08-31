package U8.EjerciciosParaRepasar.Entregable1;

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

public class RecorridoDOM {

    public RecorridoDOM() {
    }

    public void numNodoHijos() {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("C:\\Users\\david\\Desktop\\programacion_23_24_\\ejercicios\\src\\main\\java\\U8\\EjerciciosParaRepasar\\Entregable1\\starwars.xml"));

            Element root = doc.getDocumentElement();

            System.out.println("Numero de hijos: " + root.getChildNodes().getLength());

            NodeList nodeList = doc.getChildNodes();
            for (int i = 0; i < nodeList.getLength(); i++) {
                System.out.println("Tipo de nodos: " + nodeList.item(i).getNodeType());
            }

        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }
    }

    public void mostrarXMLDom() {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("C:\\Users\\david\\Desktop\\programacion_23_24_\\ejercicios\\src\\main\\java\\U8\\EjerciciosParaRepasar\\Entregable1\\starwars.xml"));

            NodeList nodeList = doc.getElementsByTagName("jedi");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node nodo = nodeList.item(i);

                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) nodeList.item(i);

                    System.out.println("Tipo: " + element.getTagName());
                    System.out.println("Contenido: " + element.getTextContent());
                }
            }

        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }
    }

    public void mostrarContenidoEtiquetaString(String nombreEtiqueta) {
        int numeroAparicones = 0;
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("C:\\Users\\david\\Desktop\\programacion_23_24_\\ejercicios\\src\\main\\java\\U8\\EjerciciosParaRepasar\\Entregable1\\starwars.xml"));

            NodeList nodeList = doc.getElementsByTagName("jedis");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node nodo = nodeList.item(i);

                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) nodeList.item(i);
                    System.out.println("Contenido: " + element.getTextContent());
                    if (element.getTagName().equalsIgnoreCase(nombreEtiqueta)) {
                        numeroAparicones++;
                    }

                    if (nodo.hasChildNodes()) {
                        NodeList nodeListInterior = nodo.getChildNodes();

                        for (int j = 0; j < nodeListInterior.getLength(); j++) {
                            Node node = nodeListInterior.item(i);

                            if (node.getNodeType() == Node.ELEMENT_NODE) {
                                Element e = (Element) nodeListInterior.item(j);
                                System.out.println("Contenido: " + e.getTextContent());

                                if (e.getTagName().equalsIgnoreCase(nombreEtiqueta)) {
                                    numeroAparicones++;
                                }
                            }
                        }
                    }
                }
            }

        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }
    }
}
