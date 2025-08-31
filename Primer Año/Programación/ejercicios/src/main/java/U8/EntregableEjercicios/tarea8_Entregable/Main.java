package U8.EntregableEjercicios.tarea8_Entregable;

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
                .baseUrl("https://my-json-server.typicode.com/chemaduran/json_entrega1/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();

        AlumnoRetrofit service = retrofit.create(AlumnoRetrofit.class);

        try {
            Call<List<Alumno>> call = service.listaAlumnos();
            Response<List<Alumno>> response = call.execute();
            if (response.isSuccessful()) {
                List<Alumno> alumnos = response.body();
                if (alumnos != null) {
                    for (Alumno alumno : alumnos) {
                        System.out.println(alumno);
                    }
                }
            } else {
                System.out.println("Petición no válida: " + response.message());
            }
        } catch (IOException ex) {
            System.out.println("Error en la petición: " + ex.getMessage());
        }

        okHttpClient.dispatcher().executorService().shutdown();
        okHttpClient.connectionPool().evictAll();
    }
}