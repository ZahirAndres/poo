package mx.utng.s27.reto1;
import java.util.concurrent.TimeUnit;
/**
 * @author Zahir Andres Rodriguez Mora
 * @category GDS0622
 * @since 21/3/2024
 */
public class Hilo1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Hilo1: "+i);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    
}