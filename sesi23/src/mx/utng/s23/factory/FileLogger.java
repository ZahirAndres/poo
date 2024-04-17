package mx.utng.s23.factory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/**
 * @Autor Zahir Andres Rodriguez Mora
 * @category GDS0622
 * @size 01/032024
 */
public class FileLogger implements Logger {
    @Override
    public void log(String msg) {
try {//lo que esta propenso a tener un error
    
    BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt"));
    writer.write(msg);
    writer.close();
} catch (IOException e) {
    System.out.println("Error de I/O"+e.getMessage()); //presentar el mensaje del error
}
        
    }
    
}
