package mx.utng.s14.Ej1;
/**
 * @author Zahir Andres Rodriguez Mora
 * @category GDS0622
 * @since 08-02-2024
 */
public class Profesor extends Persona {
    private String idProfesor;

public Profesor(String nombre, String apellidos, String idProfesor){
    super(nombre, apellidos);//a la superclase se pasan los nombre y apellidos
    this.idProfesor=idProfesor;
}

    @Override
public void mostrarDatos() {
    super.mostrarDatos();
    System.out.printf("Profesor: %s%n", idProfesor);
}

    @Override
public void vivir() {
    System.out.println("Vive sin lujos.");
    
}
public String getIdProfesor() {
    return idProfesor;
}
public void setIdProfesor(String idProfesor) {
    this.idProfesor = idProfesor;
}

}
