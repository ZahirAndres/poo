package mx.utng.s10;

public class PruebaEquals {
    public static void main(String[] args) {
        /* 
        Llanta llantas[] = new Llanta[8];
        for (Llanta llanta : llantas) {
            llanta = new Llanta(205, 16, 35);
        }*/
        Llanta llanta1 = new Llanta(205, 16, 35);
        Llanta llanta2 = new Llanta(205, 16, 35);
        Llanta llanta3 = new Llanta(205, 16, 35);
        Llanta llanta4 = new Llanta(205, 16, 35);
        Combustible combustible1 = new Combustible((short)40, (short)0);

        Automovil automovil1 = new Automovil("Ford", "Fiesta", 2015, 50046);
        automovil1.setCombustible(combustible1);
        automovil1.colocaLlantas(llanta1, llanta2, llanta3, llanta4);//sobrescribirias llanta[0] en lugar de llanta1...
        automovil1.llenarTanque();

        Llanta llanta5 = new Llanta(205, 16, 35);
        Llanta llanta6 = new Llanta(205, 16, 35);
        Llanta llanta7 = new Llanta(205, 16, 35);
        Llanta llanta8 = new Llanta(205, 16, 35);
        Combustible combustible2 = new Combustible((short)40, (short)0);

        Automovil automovil2 = new Automovil("Ford", "Fiesta", 2015, 50046);
        automovil2.setCombustible(combustible2);
        automovil2.colocaLlantas(llanta5, llanta6, llanta7, llanta8);
        automovil2.llenarTanque();

        Llanta llanta9 = new Llanta(205, 16, 35);
        Llanta llanta10 = new Llanta(205, 16, 35);
        Llanta llanta11 = new Llanta(205, 16, 35);
        Llanta llanta12 = new Llanta(205, 16, 35);
        Combustible combustible3 = new Combustible((short)40, (short)0);

        Automovil automovil3 = new Automovil("Ford", "Fiesta", 2015, 50046);
        automovil3.setCombustible(combustible3);
        automovil3.colocaLlantas(llanta9, llanta10, llanta11, llanta12);
        //automovil3.llenarTanque();

        System.out.println(automovil1.equals(automovil2));
        System.out.println(automovil2.equals(automovil3));
        
    }
}
