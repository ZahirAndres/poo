package mx.utng.s11.Desarrollo;
import java.time.LocalDate;

public class Persona {
    private String nombre;
    private byte edad;
    private final LocalDate FECHA_NACIMIENTO;

    public Persona(String nombre, byte edad, LocalDate fecha){
        this.nombre = nombre;
        this.edad = edad;
        this.FECHA_NACIMIENTO = fecha;
    }
    public byte getEdad() {
        return edad;
    }
    public LocalDate getFECHA_NACIMIENTO() {
        return FECHA_NACIMIENTO;
    }
    public String getNombre() {
        return nombre;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}