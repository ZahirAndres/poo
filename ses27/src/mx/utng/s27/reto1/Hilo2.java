package mx.utng.s27.reto1;
import java.util.concurrent.TimeUnit;
/**
 * @author Zahir Andres Rodriguez Mora
 * @category GDS0622
 * @since 21/3/2024
 */
public class Hilo2 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Hilo2: Sigo en ejecución");
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
    }
}
