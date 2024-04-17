package mx.utng.s23.factory;

import java.util.Scanner;

public class LoggerTest {
    public static void main(String[] args) {
        //crar un objeto logger
        LoggerFactory factory = new LoggerFactory();
        //El usuario teclea el tipo
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teclea un tipo de Logger (1)Archivo (2)Consola: ");
        int type = scanner.nextInt();
        //Crear loger por ayuda del usuario
        Logger logger = factory.getLogger(type);
        logger.log("Registro de eventos del sistema");
        scanner.close();
    }
}
