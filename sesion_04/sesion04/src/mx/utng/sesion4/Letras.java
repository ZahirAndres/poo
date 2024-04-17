package mx.utng.sesion4;

public class Letras {
    public static void main(String[] args) {
        //crear un lector
        Lector lector = new Lector();//objeto
        lector.muestraMensaje("Teclea una palabra: ");
        String palabra = lector.leerEntrada();

        //crear un objeto contador de caracteres
        ContadorCaracteres contador = new ContadorCaracteres();
        int numeroVocales = contador.CuentaVocales(palabra);
        System.out.println("Hay "+numeroVocales+" vocales minúsculas");
        int numeroVocalesM = contador.CuentaVocalesM(palabra);
        System.out.println("Hay "+numeroVocalesM+" vocales mayúsculas");
        int numeroConsonantes = contador.CuentaConsonantes(palabra);
        System.out.println("Hay "+numeroConsonantes+" consonantes minúsculas");
        int numeroConsonantesM = contador.CuentaConsonantesM(palabra);
        System.out.println("Hay "+numeroConsonantesM+" consonantes mayúsculas");
        int numeroNumeros = contador.CuentaNumeros(palabra);
        System.out.println("Hay "+numeroNumeros+" números");
        int numeroSimbolos = contador.CuentaSimbolos(palabra);
        System.out.println("Hay "+numeroSimbolos+" simbolos");
        
    }
}
