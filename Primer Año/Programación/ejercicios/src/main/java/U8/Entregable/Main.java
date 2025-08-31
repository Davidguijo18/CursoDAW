package U8.Entregable;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProcessPost processPost = new ProcessPost();

        // ----- PRIMER METODO (PARSE DOM) -----
        processPost.parseDOM("posts.xml");


        // ----- SEGUNDO METODO(ADD POST) -----
        Post post = new Post("Presentamos el ultimo examen", "estoycagao.com", "Estoy mas nervioso que un cirujano con parkinson", "24/5/2024", "chema por favor apruebame");
        processPost.addPost(post);


        // ----- TERCER METODO (LISTA DE POST) -----
        List<Post> listaPosts = processPost.getPosts();
        for (Post recorrerPost : listaPosts) {
            System.out.println(recorrerPost);
        }


        // ----- CUARTO METODO (JSON) -----
        System.out.println();
        String json = processPost.convertToJson();
        System.out.println("Fichero json: " + json);
    }
}
