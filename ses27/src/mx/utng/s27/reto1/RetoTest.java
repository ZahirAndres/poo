package mx.utng.s27.reto1;
/**
 * @author Zahir Andres Rodriguez Mora
 * @category GDS0622
 * @since 21/3/2024
 */
public class RetoTest {
    public static void main(String[] args) {
        Hilo1 h1 = new Hilo1();
        Hilo2 h2 = new Hilo2();

        h2.setDaemon(true); //un demonio que crea ejecuciones en segundo plano 
        //y no deja de ejecutarse
        

        h1.start();
        h2.start();

    }
}
