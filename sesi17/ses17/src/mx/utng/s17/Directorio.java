package mx.utng.s17;

import java.io.File;

/**
 * @author Zahir Andres Rodriguez Mora
 * @category GDS 0622
 * @since 15/02/2024
 */
public class Directorio {

    public static void main(String[] args) {
        File directorioInicial = new File("D:\\iitsu\\poo\\unidadii\\java\\sesi17\\ses17\\src\\temp");
        muestraContenidoDirectorio(directorioInicial);
    }
    private static void colocaEspacios(String directorioPadre, char simbolo){
        System.out.print("["+simbolo+"]");
        for (int i = 0; i < directorioPadre.length(); i++) {
            System.out.print("-");
        }
    }
    private static void muestraContenidoDirectorio(File directorio){
        colocaEspacios(directorio.getParent(), 'D');
        System.out.println(directorio.getName());
        File[] subdirectorios = directorio.listFiles();
        for (File archivo : subdirectorios) {
            if(archivo.isFile()){
            colocaEspacios(archivo.getParent(), 'A');
            System.out.println(archivo.getName());
            }else if(archivo.isDirectory()){
                muestraContenidoDirectorio(archivo);
            }
        }
    }
}