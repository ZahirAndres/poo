package mx.utng.sesion5;
import java.util.Scanner;
public class Reto1 {
    
    public static void main(String[] args) {
String mensaje;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teclea tu calificación: ");
        int calf= scanner.nextInt();
        if (calf == 10) {
            mensaje = "Excelente";
        }else if (calf == 9 || calf==8) {
            mensaje = "Muy bien hecho";
        }else if (calf == 7) {
            mensaje = "Bien hecho";
        }else if (calf == 6) {
            mensaje = "Pasaste";
        }else if (calf == 5){
            mensaje = "Intentalo de nuevo";
        }else{
            mensaje = "¡Calificaión inválida!";
        }
        System.out.println(mensaje);

scanner.close();
    }
    
}
