package mx.utng.sesion4;

import java.util.Scanner; 

public class Lector {
private Scanner scanner = new Scanner(System.in);
/*
public static void main(String[] args){


    //Crear un lector de valores desde terminal
    Scanner lector = new Scanner(System.in);//System.in te selecciona la entrada
    System.out.println("Teclea tu nombre: ");
    //leer lo que el usuario mande como entrada
    String nombre = lector.nextLine();
    //interpolacion
    int edad = 18;
    boolean casado = true;
    System.out.println("Hola! "+ nombre);
    System.out.printf("Hola soy %s y tengo %d años y %s", nombre, edad, casado==true?"soy casad@":"no soy casad@");
    //%s es un tipo cadena cuando se requiera numeros es %d 

}*/
//Método muestra una cadena dada como paramentro
public void muestraMensaje(String mensaje){
    System.out.println(mensaje);

}
//leer a partir del scanner
public String leerEntrada(){
return scanner.nextLine();    
}
}
