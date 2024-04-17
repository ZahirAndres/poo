package mx.utng.s15;

public class Libro implements Comparable<Libro>{
    private String titulo;
    private int prioridad;

    public Libro(String titulo, int prioridad){
        this.titulo=titulo;
        this.prioridad=prioridad;
    }

    public String getTitulo() {
        return titulo;
    }
//Metodo para el comparable
    @Override
    //"Libro libro" es el parametro que se compara
    public int compareTo(Libro libro) {
        return this.prioridad - libro.prioridad;
    }

    @Override
    public String toString() {
      
        return "Libro [titulo=" + titulo + "]" ;
    }
}
