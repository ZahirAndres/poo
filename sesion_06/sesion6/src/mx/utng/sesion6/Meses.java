package mx.utng.sesion6;

import java.util.Scanner;

public class Meses {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Teclea el mes: ");
    String mesActual = scanner.nextLine().toLowerCase();
    scanner.close();
    switch (mesActual) {
        case "enero":
            System.out.print(" Febrero,");    
        case "febrero":
            System.out.print(" Marzo,");    
        case "marzo":
            System.out.print(" Abril,");    
        case "abril":
            System.out.print(" Mayo,");    
        case "mayo":
            System.out.print(" Junio,");    
        case "junio":
            System.out.print(" Julio,");
        case "julio":
            System.out.print(" Agosto,");
        case "agosto":
            System.out.print(" Octubre,");    
        case "octubre":
            System.out.print(" Noviembre");    
        case "noviembre":
            System.out.println(" Diciembre.");
        default:
        
            break;
    }
}
}
