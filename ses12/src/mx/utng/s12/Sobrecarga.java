package mx.utng.s12;

public class Sobrecarga {
    public static void main(String[] args) {
        Equipo equipo1 = new Equipo("Gladiadores", "San Felipe", 10);
        Equipo equipo2 = new Equipo("CDMX");   

        System.out.println(equipo2.toString());
        System.out.println(equipo1.toString());
        equipo2.actualizar(2);
        equipo2.actualizar("Vencedores");
        System.out.println(equipo2.toString());

    }
}
