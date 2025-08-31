package U8.tarea6;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        // Configuración del cliente HTTP
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(1, TimeUnit.MINUTES)
                .readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(15, TimeUnit.SECONDS)
                .build();

        // Configuración de Retrofit
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://my-json-server.typicode.com/chemaduran/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();

        // Creación de una instancia de la interfaz FutbolistasService
        FutbolistaRetrofit service = retrofit.create(FutbolistaRetrofit.class);

        // Realización de la solicitud HTTP
        try {
            Call<List<Futbolista>> call = service.listFutbolistas();
            Response<List<Futbolista>> response = call.execute();
            if (response.isSuccessful()) {
                List<Futbolista> futbolistas = response.body();
                if (futbolistas != null) {
                    for (Futbolista futbolista : futbolistas) {
                        System.out.println(futbolista);
                    }
                }
            } else {
                System.out.println("Petición no válida: " + response.message());
            }
        } catch (IOException ex) {
            System.out.println("Error en la petición: " + ex.getMessage());
        }

        // Cierre de recursos
        okHttpClient.dispatcher().executorService().shutdown();
        okHttpClient.connectionPool().evictAll();
    }
}