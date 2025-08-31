package U8.EjerciciosEntregable.Entregable_2122_Manana;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class DOMModificado {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse("C:\\Users\\david\\Desktop\\programacion_23_24_\\ejercicios\\src\\main\\java\\U8\\EjerciciosEntregable\\Entregable_2122_Manana\\alumnos.xml");
            NodeList alumnos = doc.getElementsByTagName("alumno");
            Node root = doc.getDocumentElement();

            for (int i = 0; i < alumnos.getLength(); i++) {
                Element alumno = (Element) alumnos.item(i);
                Element instituto = doc.createElement("instituto");
                instituto.setTextContent("IES VELAZQUEZ");

                alumno.appendChild(instituto);
            }

            Element alumno = doc.createElement("alumno");

            Element nombre = doc.createElement("nombre");
            nombre.setTextContent("Luis");
            Element apellido = doc.createElement("apellido");
            apellido.setTextContent("Ruiz");
            Element direccion = doc.createElement("direccion");
            direccion.setTextContent("Alli");
            Element instituto = doc.createElement("instituto");
            instituto.setTextContent("IES VELAZQUEZ");

            root.appendChild(alumno);

            alumno.setAttribute("dni","8888888X");
            alumno.appendChild(nombre);
            alumno.appendChild(apellido);
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

            // Creación del fichero que va a ser mi destino
            File nuevoAlumnos =
                    new File("C:\\Users\\david\\Desktop\\programacion_23_24_\\ejercicios\\src\\main\\java\\U8\\EjerciciosEntregable\\Entregable_2122_Manana\\alumnos.xml");
            StreamResult destino = new StreamResult(nuevoAlumnos);

            // Hacemos la transformación que en nuestro caso es la escritura
            transformer.transform(origenDOM, destino);

        } catch (ParserConfigurationException | SAXException | IOException | TransformerConfigurationException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        } catch (TransformerException e) {
            throw new RuntimeException(e);
        }
    }
}
