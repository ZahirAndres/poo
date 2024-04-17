package mx.utng.s11.Desarrollo;

import java.time.LocalDate;

public class BDA extends Empleado {
    private String herramientasConsultas;

    
    public BDA(String nombre, byte edad, LocalDate fecha, float salario,String herramientas) {
        super(nombre, edad, fecha, salario);
        this.herramientasConsultas = herramientas;
    }

    public String getHerramientasConsultas() {
        return herramientasConsultas;
    }
    public void setHerramientasConsultas(String herramientasConsultas) {
        this.herramientasConsultas = herramientasConsultas;
    }
}
