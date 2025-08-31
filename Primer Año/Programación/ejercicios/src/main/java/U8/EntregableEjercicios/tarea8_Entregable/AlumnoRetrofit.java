package U8.EntregableEjercicios.tarea8_Entregable;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface AlumnoRetrofit {
    @GET("alumnos?_embed=asignaturas")
    Call<List<Alumno>> listaAlumnos();
}
