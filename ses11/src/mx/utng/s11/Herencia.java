package mx.utng.s11;

public class Herencia {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(4.0, 5.0, "Estilo 1");
        System.out.println("Información sobre el triangulo");
        triangulo.mostrarDimension();
        triangulo.mostrarEstilo();
        System.out.println("El área es: "+triangulo.area());

        Triangulo triangulo1 = new Triangulo(9.0, 1.30, "Estilo 1");
        System.out.println("Información sobre el triangulo");
        triangulo1.mostrarDimension();
        triangulo1.mostrarEstilo();
        System.out.println("El área es: "+triangulo1.area());

        Triangulo triangulo2 = new Triangulo(4.8, 36.7, "Estilo 1");
        System.out.println("Información sobre el triangulo");
        triangulo2.mostrarDimension();
        triangulo2.mostrarEstilo();
        System.out.println("El área es: "+triangulo2.area());
        
    }
}
