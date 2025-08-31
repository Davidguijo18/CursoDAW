package U8.EjerciciosEntregable.Entregable_2122_Manana;

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
import java.util.ArrayList;

public class AlumnoDOM {
    public ArrayList<Alumno> parse() {
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("C:\\Users\\david\\Desktop\\programacion_23_24_\\ejercicios\\src\\main\\java\\U8\\EjerciciosEntregable\\Entregable_2122_Manana\\alumnos.xml"));
            doc.getDocumentElement().normalize();

            NodeList nl = doc.getElementsByTagName("alumno");

            for (int i = 0; i < nl.getLength(); i++) {
                Node nodo = nl.item(i);

                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                    Element e = (Element) nl.item(i);

                    String dni = e.getAttribute("dni");
                    String nombre = e.getElementsByTagName("nombre").item(0).getTextContent();
                    String apellido = e.getElementsByTagName("apellido").item(0).getTextContent();
                    String direccion = e.getElementsByTagName("direccion").item(0).getTextContent();

                    Alumno alumno = new Alumno(dni, nombre, apellido, direccion);
                    listaAlumnos.add(alumno);
                }
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            for (StackTraceElement element : e.getStackTrace()) {
                System.out.println(element);
            }
        }
        return listaAlumnos;
    }
}
