package mx.utng.s11.Desarrollo;

import java.time.LocalDate;

public class Programador extends Empleado {
    private String lenguajePrincipal;
    
    public Programador(String nombre, byte edad, LocalDate fecha, float salario, String lenguajePrincipal) {
        super(nombre, edad, fecha, salario);
        this.lenguajePrincipal = lenguajePrincipal;
    }
    public String getLenguajePrincipal() {
        return lenguajePrincipal;
    }
    public void setLenguajePrincipal(String lenguajePrincipal) {
        this.lenguajePrincipal = lenguajePrincipal;
    }
}
