package mx.utng.sesion5;

public class Primitivos {
    public static void main(String[] args) {
        byte valorByte = 1;
        short valorShort = 1;
        int valorInt = 1;
        long valorLong = 1l;
        float valorFloat = 1.5f;
        double valorDouble = 1.5;
        
        System.out.println("byte: "+ valorByte);
        System.out.println("short: "+ valorShort);
        System.out.println("int: "+ valorInt);
        System.out.println("long: "+ valorLong);
        System.out.println("float: "+ valorFloat);
        System.out.println("double: "+ valorDouble);
        
        
        
        boolean valorBoolean = true;
        char valorChar = 'B';
        System.out.println("boolean "+ valorBoolean);
        System.out.println("char: "+ valorChar);
//comvertir datos con Cast in
        int numInt = (int)valorFloat;
        System.out.println("Cast int: "+ numInt);

        float numFloat = numInt;
        System.out.println("Entero a flotante: "+numFloat);

    //caracter a un entero
        char numChar = 'M';
        int numInt2 = (int)numChar;
        System.out.println("Ascii: "+numInt2);

    //cadena a un entero
       /* 
        String cadena1 = "Hola";
        int numInt3 = Integer.parseInt(cadena1);
        System.out.println(numInt3);
        */
        //numeros
        String cadena2 = "56";
        int numInt4 = Integer.parseInt(cadena2);
        System.out.println(numInt4);
        
        numInt4 = numInt4++;
        System.out.println(numInt4);

        char valorChar1 = (char)++numInt2;
        System.out.println(valorChar1);
    }

}
