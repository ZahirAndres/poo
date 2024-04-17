package mx.utng.s17.reto1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Poema
 * @author Zahir Andrés Rodriguez Mora
 * @category GDS0622
 * @since 16/02/2024
 */
public class Poema {

    public static void main(String[] args) throws IOException{
        File poema = new File("ses17\\src\\mx\\utng\\s17\\reto1\\poema.txt");
        FileWriter poemaFileWriter = new FileWriter(poema);
        BufferedWriter pw = new BufferedWriter(poemaFileWriter);
        pw.write("AMERICA,");
        pw.newLine();
        pw.write("no invoco tu nombre en vano.");
        pw.newLine();
        pw.write("Cuando sujeto al corazon la espada,");
        pw.newLine();
        pw.write("cuando aguanto en el alma la gotera,");
        pw.newLine();
        pw.write("cuando por las ventanas");
        pw.newLine();
        pw.write("un nuevo dia tuyo me penetra,");
        pw.newLine();
        pw.write("soy y estoy en la luz que me produce,");
        pw.newLine();
        pw.write("vivo en la sombra que me determina,");
        pw.newLine();
        pw.write("duermo y despierto en tu esencial aurora:");
        pw.newLine();
        pw.write("dulce como las uvas, y terrible,");
        pw.newLine();
        pw.write("conductor del azucar y el castigo,");
        pw.newLine();
        pw.write("empapado en esperma de tu especie,");
        pw.newLine();
        pw.write("amamantado en sangre de tu herencia.");
        pw.newLine();
        pw.close();

        
        @SuppressWarnings("resource")
        BufferedReader pr = new BufferedReader(new FileReader(poema));
        String linea = null;
        while (((linea = pr.readLine())!=null)) {
            System.out.println(linea);
        }
    }
}