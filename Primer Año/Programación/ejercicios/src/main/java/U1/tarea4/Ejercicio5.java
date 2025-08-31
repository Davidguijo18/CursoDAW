package U1.tarea4;
import java.time.LocalDateTime;
public class Ejercicio5 {
    public static void main(String[] args){

            LocalDateTime  fechaActual = LocalDateTime.now();

            int horas = fechaActual.getHour();
            int minutos = fechaActual.getMinute();
            int segundos = fechaActual.getSecond();

        System.out.println("Hora actual: "+horas+":"+minutos+":"+segundos);

    }
}
