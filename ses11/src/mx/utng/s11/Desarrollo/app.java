package mx.utng.s11.Desarrollo;
import java.time.LocalDate;
import java.time.Month;
public class app {
 public static void main(String[] args) {
    Programador programador = new Programador("Zahir", (byte)18 , LocalDate.of(2005, Month.JUNE, 23), 100, "Java");
    BDA bda = new BDA("Zahir", (byte)18, LocalDate.of(2005, Month.JUNE, 23), 100, "PC, Mente");
    System.out.println("Información del Programador.");
    System.out.println("Nombre: "+programador.getNombre());
    System.out.println("Edad: "+programador.getEdad());
    System.out.println("Fecha de nacimiento: "+programador.getFECHA_NACIMIENTO());
    System.out.println("Lenguaje: "+programador.getLenguajePrincipal());
    System.out.println("Informacion de BDA.");
    System.out.println("Nombre: "+bda.getNombre());
    System.out.println("Edad: "+bda.getEdad());
    System.out.println("Fecha de nacimiento: "+bda.getFECHA_NACIMIENTO());
    System.out.println("Herramientas: "+bda.getHerramientasConsultas());
    
 }
}
