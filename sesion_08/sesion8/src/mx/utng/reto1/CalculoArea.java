package mx.utng.reto1;



public class CalculoArea {
    public static void main(String[] args) {
        Rectangulo rectan1 = new Rectangulo(0, 0);
        System.out.println(rectan1.area());
        Rectangulo rectan2 = new Rectangulo(2, 2);
        System.out.println(rectan2.area());
        Rectangulo rectan3 = new Rectangulo(3, 2);
        System.out.println(rectan3.area());
        Rectangulo rectan4 = new Rectangulo();
        Rectangulo rectan5 = new Rectangulo(5);
        System.out.println(rectan5);
        System.out.println(rectan4);
        
    }
}
