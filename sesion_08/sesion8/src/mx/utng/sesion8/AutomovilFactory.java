package mx.utng.sesion8;

public class AutomovilFactory {
    public static void main(String[] args) {
        Automovil auto1 = new Automovil("Ford", "Shelby", 1965, 25000);
        Automovil auto2 = new Automovil("Chevrolette", "Camaro",300, 1);
        Automovil auto3 = new Automovil("Bugatti", "Veyron Ble Centeaire", 2009, 6000);
        System.out.println("Auto 1: hash: "+auto1.hashCode());
        System.out.println("Auto 2: hash: "+auto2.hashCode());
        System.out.println("Auto 3: hash: "+auto3.hashCode());
        //esto no tiene sentido mejor imprimo auto1 
        Automovil auto4 = auto1;
        System.out.println("Auto 1: hash: "+auto4.hashCode());
        if (auto4.equals(auto1)) {//equals es para comparar para decir que es igual
            System.out.println("Es el mismo objeto.");
        }
    } 
}
