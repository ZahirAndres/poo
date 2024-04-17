package mx.utng.reto1;

public class Rectangulo {
    double ancho;
    double alto;
    public Rectangulo() {
        this.ancho = 0;
        this.alto = 0;
    }
    public Rectangulo(double dato) { 
        this.ancho = dato;
        this.alto = dato;
    }
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    public double area(){
        return ancho*alto;
        //Math.pow(lado, 2) Elevar al cuadrado
    }
    @Override
    public int hashCode() {
       int hash = 0;
       hash = ((int)alto);
       hash += ((int)ancho);
        return hash;
    }
}