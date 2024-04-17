package mx.utng.s14.Ej1;

import java.time.LocalDate;
import java.time.Month;

public class Polimorfismo {
    public static void main(String[] args) {
        Profesor profa = new Profesor("Paty", "Hernandez López", "UTNG00541");
        profa.vivir();
        profa.mostrarDatos();

        Profesor profe = new ProfesorInterino("Jose", "Gutierrez Sanchez", "UTNG00365", LocalDate.of(2024, Month.DECEMBER, 30));
        profe.mostrarDatos();
        profe.vivir();
    }
}
