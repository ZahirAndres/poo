package mx.utng.s10.Ej01;

public class Contador {
    //static == pertenece a la clase
    private static short contadorClase;
    private short contadorInstancia;

    public Contador(){
        contadorClase++;
        contadorInstancia++;
    }
    public static short getContadorClase() {
        return contadorClase;
    }
    public short getContadorInstancia() {
        return contadorInstancia;
    }
    public void setContadorInstancia(short contadorInstancia) {
        this.contadorInstancia = contadorInstancia;
    }
}
