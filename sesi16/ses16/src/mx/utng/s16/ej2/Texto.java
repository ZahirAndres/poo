package mx.utng.s16.ej2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
/**
 * @author Zahir Andres Rodriguez Mora
 * @category GDS0622
 * @since 14/02/2024
 */
import java.io.FileWriter;
import java.io.IOException;

public class Texto {
     public static void main(String[] args) throws IOException {//manejo de excepsiones para que en caso de que no exsta no se corte
        FileWriter fileWriter = new FileWriter(System.getProperty("user.home")+"/archivo.txt");
        //System.out.println(fileWriter);
        BufferedWriter bw = new BufferedWriter(fileWriter);//instancia
        bw.write("Esta linea se escribirá en el archivo \n esta línea es por salto de línea");
        bw.newLine();
        bw.write("Esta es una segunda línea");
        bw.newLine();
        bw.write("Esta es la última línea");
        bw.write("  Sin 'newLine'");
        bw.close();//hasta este momento el bufer los pone en el archivo

        @SuppressWarnings("resource")
        BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.home")+"/archivo.txt"));
        //Leer todo el archivo
        String linea = null;
        while (((linea = br.readLine())!= null)) {
            System.out.println(linea);
        }

    }
}
