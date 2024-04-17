package mx.utng.sesion7;

import java.util.Scanner;

public class Lector {
private Scanner scanner = new Scanner(System.in);
public byte leeOpcion(){
    System.out.println("Opcion: ");
    return scanner.nextByte();
}
}
