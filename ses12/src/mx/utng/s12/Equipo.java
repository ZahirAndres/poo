package mx.utng.s12;

public class Equipo {
    private String nombre;
    private String ciudad;
    private int puntos;

    public Equipo(String nombre, String ciudad, int puntos) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.puntos = puntos;
    }

    public Equipo(String nombre, String ciudad) {
        this(nombre, ciudad, 0);
    }

    public Equipo(String ciudad) {
        this("Anonimo", ciudad);
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public int getPuntos() {
     return puntos;
    }

 public void actualizar(String nombre, int puntos){
this.nombre=nombre;
this.puntos=puntos;
 } 
 public void actualizar(String nombre){
    this.nombre= nombre;
 }
 public void actualizar(int puntos){
    this.puntos=puntos;
 }

 @Override
 public String toString() {
   
     return "Equipo [nombre= "+nombre+", ciudad= "+ciudad+", puntos= "+puntos+"]";
 }
}
