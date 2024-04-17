package mx.utng.sesion4;

public class ContadorCaracteres {
    //contar si es vocal o no
    public boolean isVocal(char caracter){
        return (caracter== 'a' ||
                caracter== 'e' ||
                caracter== 'i' ||
                caracter== 'o' ||
                caracter== 'u' );
    }
//Mayúscula
public boolean isVocalM(char caracter){
    return (caracter== 'A' ||
            caracter== 'E' ||
            caracter== 'I' ||
            caracter== 'O' ||
            caracter== 'U' );
}
    //proveniente del código ascii
    public boolean isNumero(char caracter){
        short codigoAscii = /*conversion*/ (short) caracter;
        return codigoAscii>47 && codigoAscii<58;
    }
    //Consonantes
    public boolean isConsonante(char caracter){
        short codigoAscii = (short) caracter;
        return codigoAscii>=97 && codigoAscii<=122 && !isVocal(caracter);
    //comparacion de que sea letra y negacion de que sea vocal
    }
//Mayuscula
    public boolean isConsonanteM(char caracter){
    short codigoAscii = (short) caracter;
    return codigoAscii>=65 && codigoAscii<=90 && !isVocalM(caracter);
    }
    //simbolo
    public boolean isSimbolo(char caracter){
        return !(isVocal(caracter) || isNumero(caracter) || isConsonante(caracter));
    }
//CONTADORES
    //contar vocales minúsculas
    public int CuentaVocales(String palabra){
        int vocales = 0;
        for (char caracter : palabra.toCharArray()) {//convertida en minusculas ".toLowerCase()" y ".toCharArray()" en un arreglo de caracteres
            if(isVocal(caracter)){
                vocales++;
            }
        }
        return vocales;
    }
    //contar vocales Mayúsculas
    public int CuentaVocalesM(String palabra){
        int vocales = 0;
        for (char caracter : palabra.toCharArray()) {
            if(isVocalM(caracter)){
                vocales++;
            }
        }
        return vocales;
    }
    //contar consonantes minúsculas
    public int CuentaConsonantes(String palabra){
        int consonantes = 0;
        for (char caracter : palabra.toCharArray()) {
            if(isConsonante(caracter)){
                consonantes++;
            }
        }
        return consonantes;
    }
    //contar consonantes minúsculas
    public int CuentaConsonantesM(String palabra){
        int consonantes = 0;
        for (char caracter : palabra.toCharArray()) {
            if(isConsonanteM(caracter)){
                consonantes++;
            }
        }
        return consonantes;
    }
    //contar números
    public int CuentaNumeros(String palabra){
        int numeros = 0;
        for (char caracter : palabra.toCharArray()) {
            if(isNumero(caracter)){
                numeros++;
            }
        }
        return numeros;
    }
    //contar simbolos
    public int CuentaSimbolos(String palabra){
        int simbolos = 0;
        for (char caracter : palabra.toLowerCase().toCharArray()) {
            if(isSimbolo(caracter)){
                simbolos++;
            }
        }
        return simbolos;
    }

}
