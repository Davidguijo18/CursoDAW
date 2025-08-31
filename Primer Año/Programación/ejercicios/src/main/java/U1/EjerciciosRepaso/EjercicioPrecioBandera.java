package U1.EjerciciosRepaso;
import java.util.Scanner;

public class EjercicioPrecioBandera {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int alto;
        int ancho;
        float precio = 0;
        
        System.out.println("Introduce el alto de su bandera");
            alto = teclado.nextInt();
            
        System.out.println("Introduce la anchura de su bandera");
            ancho = teclado.nextInt();
            
        int calculoArea = alto * ancho;    
        
        float precioInicial = (float) (calculoArea * 0.01);
        
        System.out.println("El precio de su bandera es "+precioInicial+" €");
        
        teclado.nextLine();
        
        System.out.println("Desea incluirle un escudo bordado? (SI / NO)");
        String respuestaBordado = teclado.nextLine();
        
        if (respuestaBordado.equalsIgnoreCase("no")){
            respuestaBordado = "Ha elegido la bandera sin escudo bordado";
            precio = precioInicial;
        }else if (respuestaBordado.equalsIgnoreCase("si")){
            respuestaBordado = "Ha elegido la bandera con escudo bordado (+2.50€)";
            precio = (float) (precioInicial + 2.50);        
            System.out.println("Actualmente, el precio ha ascendido a "+precio+" €");
        }
        
        System.out.println();
        
        System.out.println("Desea que se lo enviemos a su casa? (SI / NO)");
        String respuestaEnvio = teclado.nextLine();
        
        if (respuestaEnvio.equalsIgnoreCase("no")){
            respuestaEnvio = "El paquete no sera enviado, tendra que recogerlo en la tienda";
        }else if (respuestaEnvio.equalsIgnoreCase("si")){
            respuestaEnvio = "El paquete sera enviado a tu direccion (+3.25€)";
            precio = (float) (precio + 3.25);        
            System.out.println("Actualmente, el precio ha ascendido a "+precio+" €");
        }
        
        System.out.println();
        System.out.println();
        System.out.println("TICKET DE COMPRA");
        System.out.println("Medidas de bandera ("+alto+" x "+ancho+") --> "+precioInicial+" €");
        System.out.println(respuestaBordado);
        System.out.println(respuestaEnvio);
        System.out.println("IVA INCLUIDO"+"\n");
        System.out.println("PRECIO TOTAL --> "+precio+" €");     
    }
}
