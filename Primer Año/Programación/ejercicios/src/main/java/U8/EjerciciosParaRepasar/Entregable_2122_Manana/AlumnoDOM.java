package U8.EjerciciosParaRepasar.Entregable_2122_Manana;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;

public class AlumnoDOM {

    private ArrayList<Alumno> listaAlumnos = new ArrayList<>();

    public AlumnoDOM() {
    }

    public ArrayList<Alumno> generarArrayAlumno() {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse("C:\\Users\\david\\Desktop\\programacion_23_24_\\ejercicios\\src\\main\\java\\U8\\EjerciciosParaRepasar\\Entregable_2122_Manana\\alumnos.xml");

            NodeList nodeList = doc.getElementsByTagName("alumno");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node nodo = nodeList.item(i);

                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) nodeList.item(i);

                    String dni = element.getAttribute("dni");
                    String nombre = String.valueOf(element.getElementsByTagName("nombre").item(0).getTextContent());
                    String apellido = String.valueOf(element.getElementsByTagName("apellido").item(0).getTextContent());
                    String direccion = String.valueOf(element.getElementsByTagName("direccion").item(0).getTextContent());

                    Alumno alumno = new Alumno(dni, nombre, apellido, direccion);
                    listaAlumnos.add(alumno);
                }
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }

        return listaAlumnos;
    }
}