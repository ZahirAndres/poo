package mx.utng.s11;

public class Triangulo extends FiguraPlana {
    private final String ESTILO;
    public Triangulo(double base, double altura, String estilo){
        super(base, altura);
        this.ESTILO = estilo;
    }

    public double area(){
        return getALTURA()*getBASE()/2;
    }
    public void mostrarEstilo(){
        System.out.println("Triángulo es: "+ESTILO);
    }
}
