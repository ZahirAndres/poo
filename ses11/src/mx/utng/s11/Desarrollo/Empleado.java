package mx.utng.s11.Desarrollo;

import java.time.LocalDate;

public class Empleado extends Persona{
    private float Salario;

    public Empleado(String nombre, byte edad, LocalDate fecha, float salario) {
        super(nombre, edad, fecha);
        Salario = salario;
    }
    public float getSalario() {
        return Salario;
    }
    public void setSalario(float salario) {
        Salario = salario;
    }
}
