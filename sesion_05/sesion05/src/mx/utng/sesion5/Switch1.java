package mx.utng.sesion5;

import java.util.Scanner;


public class Switch1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teclea tu calificación: ");
        int calf = scanner.nextInt();

        switch (calf) {
            case 10:
                System.out.println("Excelente");
                break;
            case 9:
            case 8:
                System.out.println("Muy bien");
                break;
            case 7: 
                System.out.println("Bien hecho");
                break;
            case 6:
                System.out.println("Pasaste");
                break;
            case 5:
                System.out.println("Vuelve a intentarlo");
                break;
            default:
                System.out.println("Calificaión inválida");
                break;
        }
        scanner.close();
    }
}
