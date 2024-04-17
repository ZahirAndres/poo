package mx.utng.s27;
/**
 * @author ZAhir Andres Rodriguez Mora
 * @category GDS0622
 * @since 20/3/2024
 */
public class MiHiloTest {
    public static void main(String[] args) {
        MiHilo hilo1 = new MiHilo();
        hilo1.setDaemon(false); //es de usuario
        MiHilo hilo2 = new MiHilo();
        hilo2.setDaemon(true); //es un demonio

        hilo1.start();
        hilo2.start();

        MiHilo.pausarUnSegundo();
        hilo1.setParametro("TeRminar");
    }
}
