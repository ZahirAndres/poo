package mx.utng.s16.ej3;

import java.time.LocalDate;

/**
 * @author Zahir Andres Rodriguez Mora
 * @category GDS0622
 * @since 14/02/2024
 */
public class Formato {
    public static void main(String[] args) {
        final String NOMBRE = "BOOBY";
        final int EDAD = 3;
        final float ESTATURA = 30.5f;
        final LocalDate FECHA_NACIMIENTO = LocalDate.of(2020, 8, 13);

        System.out.println("El nombre de mi mascota es "+NOMBRE+", tiene una edad de "+EDAD+", su estatura es de "+ESTATURA+" y nació el dia "+FECHA_NACIMIENTO);
//B completa, b reducida, igual que los años
        System.out.printf("El nombre de mi mascota es: |%8s| tiene una edad |%05d| su estatura es %.2f y nacio el dia %4$te de %4$tB de %4$tY %n", NOMBRE,EDAD,ESTATURA,FECHA_NACIMIENTO);
    }
}
