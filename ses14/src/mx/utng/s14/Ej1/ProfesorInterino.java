package mx.utng.s14.Ej1;
/**
 * @author Zahir Andres Rodriguez Mora
 * @category GDS0622
 * @since 08-02-2024
 */
import java.time.LocalDate;

public class ProfesorInterino extends Profesor {
    private LocalDate fechaTerminacion;

    public ProfesorInterino(String nombre, String apellido, String idProfesor, LocalDate fechaTerminacion){
        super(nombre, apellido, idProfesor);
        this.fechaTerminacion = fechaTerminacion;
    }
    @Override
    public void vivir() {
        super.vivir();
        System.out.println("Como foraneo.");
    }
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.err.println("Desempleado a partir de "+ fechaTerminacion);
    }
    public LocalDate getFechaTerminacion() {
        return fechaTerminacion;
    }
    public void setFechaTerminacion(LocalDate fechaTerminacion) {
        this.fechaTerminacion = fechaTerminacion;
    }
}
