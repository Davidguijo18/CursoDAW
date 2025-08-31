package U8.Entregable;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class ProcessPost {

    private List<Post> listaPost = new ArrayList<>();
    private static Document document;

    public ProcessPost() {
    }

    public void parseDOM(String fileName) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            document = db.parse("C:\\Users\\DAW_M\\Desktop\\programacion_23_24_\\ejercicios\\src\\main\\java\\U8\\Entregable\\" + fileName);

        } catch (IOException | SAXException | ParserConfigurationException exception) {
            exception.printStackTrace();
        }
    }


    public void addPost(Post post) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            Node root = document.getDocumentElement();

            Element nuevoPost = document.createElement("post");

            Element title = document.createElement("title");
            title.setTextContent(post.getTitle());

            Element link = document.createElement("link");
            link.setTextContent(post.getLink());

            Element description = document.createElement("description");
            description.setTextContent(post.getDescription());

            Element pubDate = document.createElement("pubDate");
            pubDate.setTextContent(post.getPubdate());

            Element guid = document.createElement("guid");
            guid.setAttribute("isPermaLink", "true");
            guid.setTextContent(post.getGuid());

            root.appendChild(nuevoPost);
            nuevoPost.appendChild(title);
            nuevoPost.appendChild(link);
            nuevoPost.appendChild(description);
            nuevoPost.appendChild(pubDate);
            nuevoPost.appendChild(guid);


            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource origenDOM = new DOMSource(root);

            File anadirPost = new File("C:\\Users\\DAW_M\\Desktop\\programacion_23_24_\\ejercicios\\src\\main\\java\\U8\\Entregable\\posts.xml");
            StreamResult destino = new StreamResult(anadirPost);

            transformer.transform(origenDOM, destino);

        } catch (ParserConfigurationException | TransformerException e) {
            e.printStackTrace();
        }
    }


    public List<Post> getPosts() {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            NodeList nodeList = document.getElementsByTagName("post");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node nodo = nodeList.item(i);

                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) nodeList.item(i);
                    String title = element.getElementsByTagName("title").item(0).getTextContent();
                    String link = element.getElementsByTagName("link").item(0).getTextContent();
                    String description = element.getElementsByTagName("description").item(0).getTextContent();
                    String pubDate = element.getElementsByTagName("pubDate").item(0).getTextContent();
                    String guid = element.getElementsByTagName("guid").item(0).getTextContent();

                    Post post = new Post(title, link, description, pubDate, guid);
                    listaPost.add(post);
                }
            }

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        return listaPost;
    }


    public String convertToJson() {
        Gson gson = new Gson();
        String pasarJason = gson.toJson(listaPost);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\DAW_M\\Desktop\\programacion_23_24_\\ejercicios\\src\\main\\java\\U8\\Entregable\\posts.json"))) {
            bw.write(pasarJason);
        } catch (IOException e) {
            System.out.println("Error al crear el fichero: " + e.getMessage());
        }

        return pasarJason;
    }
}
