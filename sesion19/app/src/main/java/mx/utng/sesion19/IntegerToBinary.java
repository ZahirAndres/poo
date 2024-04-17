package mx.utng.sesion19;
import java.util.Scanner;

/**
 * @author Zahir Andres Rodriguez Mora
 * @category GDS 0622
 * @since 22/02/2024
 */
public class IntegerToBinary {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero a convertir: ");
        int numero = entrada.nextInt();
        entrada.close();
        String binario = Integer.toBinaryString(numero);
        System.out.printf("El numero %d es en binario %s", numero,binario);
    }
}