package U8.tarea6;


import retrofit2.Call;
import retrofit2.http.GET;
import java.util.List;

public interface FutbolistaRetrofit {
    @GET("futbolistas_api_demo/jugadores")
    Call<List<Futbolista>> listFutbolistas();
}

