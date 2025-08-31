package U8.EjerciciosParaRepasar.EntregableJson;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.ArrayList;

public interface InterfazRetrofit {
    @GET("alumnos?_embed=asignaturas")
    Call<ArrayList<Alumno>> listaAlumnos();
}
