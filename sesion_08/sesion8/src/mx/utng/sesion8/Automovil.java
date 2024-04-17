package mx.utng.sesion8;

public class Automovil {
    private String marca;
    private String modelo;
    private int anioFabricacion;
    private int kilometraje;
//this.marca és una variable mas haya de la clase
    //constructor, el alcance de los parametros solo son dentro del método{}
    public Automovil(String marca, String modelo, int anioFabricacion, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.kilometraje = kilometraje;
    } 
   
    @Override//sobre escribir
    public int hashCode() {
//todos los objetos tienen hashCode entonces debemos de sobrescribir
int hash = 0;
hash = marca.hashCode();
hash += modelo.hashCode();
hash += anioFabricacion;
hash += kilometraje;
        return hash;
    }
}
