package mx.utng.s16;

import java.io.File;
import java.io.IOException;

/**
 * @author Zahir Andres Rodriguez Mora
 * @category GDS0622
 * @since 14/02/2024
 */
public class ArchivoTest {

    public static void main(String[] args) throws IOException {
        File archivo = new File("D:\\temp\\cursos\\cursos.txt");
        //Consultar el nombre, ruta, directorio padre, si esta oculto, si existe o no
        System.out.println("Nombre del archivo: "+archivo.getName());
        
        System.out.println("La ruta del archivo es : "+archivo.getPath());
        System.out.println("Ruta absoluta: "+archivo.getAbsolutePath());
       // System.out.println("Que sale "+archivo.getCanonicalPath());
        System.out.println("Directorio padre: "+ archivo.getParent());
        System.out.println("Existe: "+(archivo.exists()?"Si":"No"));
        System.out.println("Es oculto? "+(archivo.isHidden()?"Si":"No"));

        //Tienes permisos de lectura, escritura, ejecucion
        System.out.printf("%s puede escribirse %n", (archivo.canWrite()?"Si":"No"));
        System.out.printf("%s puede leer %n", (archivo.canRead()?"Si":"No"));
        System.out.printf("%s puede ejecutar %n", (archivo.canExecute()?"Si":"No"));
        System.out.printf("%s es directorio %n", (archivo.isDirectory()?"Si":"No"));
        System.out.printf("%.3f cantidad de kilobytes %n", (archivo.length()/1024.0));
    }
}