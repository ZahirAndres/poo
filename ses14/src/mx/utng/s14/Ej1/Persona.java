package mx.utng.s14.Ej1;
/**
 * @author Zahir Andres Rodriguez Mora
 * @category GDS0622
 * @since 08-02-2024
 */

public abstract class Persona {
    private String nombre;
    private String apellidos;

    public Persona(String nombre, String apellidos){
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    
public void mostrarDatos(){
    System.out.printf("Persona: %nNombre: %s %nApellido:%s%n", nombre, apellidos);//%s para cadenas, %n para saltos
}
public abstract void vivir();

    public String getNombre() {
        return nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

}
