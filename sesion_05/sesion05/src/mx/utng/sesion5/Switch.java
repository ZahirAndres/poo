package mx.utng.sesion5;

import java.util.Scanner;


public class Switch {
    public static void main(String[] args) {
        String mensaje;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teclea tu calificación: ");
        int calf = scanner.nextInt();

        switch (calf) {
            case 10:
                mensaje ="Excelente";
                break;
            case 9:
            case 8:
                mensaje= "Muy bien";
                break;
            case 7: 
                mensaje="Bien hecho";
                break;
            case 6:
                mensaje="Pasaste";
                break;
            case 5:
                mensaje="Vuelve a intentarlo";
                break;
            default:
                mensaje="¡Calificaión inválida!";
                break;
        }
        System.out.println(mensaje);
        scanner.close();
    }
}
