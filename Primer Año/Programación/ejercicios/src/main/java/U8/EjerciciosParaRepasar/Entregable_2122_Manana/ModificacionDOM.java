package U8.EjerciciosParaRepasar.Entregable_2122_Manana;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class ModificacionDOM {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("C:\\Users\\david\\Desktop\\programacion_23_24_\\ejercicios\\src\\main\\java\\U8\\EjerciciosParaRepasar\\Entregable_2122_Manana\\alumnos.xml"));

            NodeList nodeList = doc.getElementsByTagName("alumno");
            Node root = doc.getDocumentElement();

            for (int i = 0; i < nodeList.getLength(); i++) {
                Element alumno = (Element) nodeList.item(i);
                Element instituto = doc.createElement("instituto");
                instituto.setTextContent("IES VELAZQUEZ");

                alumno.appendChild(instituto);
            }

            Element alumno = doc.createElement("alumno");

            Element nombre = doc.createElement("nombre");
            nombre.setTextContent("Luis");

            Element apellidos = doc.createElement("apellido");
            apellidos.setTextContent("Ruiz");

            Element direccion = doc.createElement("direccion");
            direccion.setTextContent("Alli");

            Element instituto = doc.createElement("instituto");
            instituto.setTextContent("IES VELAZQUEZ");

            root.appendChild(alumno);
            alumno.setAttribute("dni", "8888888X");
            alumno.appendChild(nombre);
            alumno.appendChild(apellidos);
            alumno.appendChild(direccion);
            alumno.appendChild(instituto);

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource origenDOM = new DOMSource(root);
            File nuevoPersonas = new File("C:\\Users\\david\\Desktop\\programacion_23_24_\\ejercicios\\src\\main\\java\\U8\\EjerciciosParaRepasar\\Entregable_2122_Manana\\alumnos.xml");
            StreamResult destino = new StreamResult(nuevoPersonas);

            transformer.transform(origenDOM, destino);

        } catch (ParserConfigurationException | IOException | SAXException | TransformerException e) {
            e.printStackTrace();
        }
    }
}
