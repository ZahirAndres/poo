package mx.utng.sesion03;

public class Libro {
private String titulo;
private Autor autor;
private String editorial;
private int anio;
private int numeroPagina;

public String getTitulo() {
    return titulo;
}
public void setTitulo(String titulo) {
    this.titulo = titulo;
}
public Autor getAutor() {
    return autor;
}
public void setAutor(Autor autor) {
    this.autor = autor;
}
public String getEditorial() {
    return editorial;
}
public void setEditorial(String editorial) {
    this.editorial = editorial;
}
public int getAnio() {
    return anio;
}
public void setAnio(int anio) {
    this.anio = anio;
}
public int getNumeroPagina() {
    return numeroPagina;
}
public void setNumeroPagina(int numeroPagina) {
    this.numeroPagina = numeroPagina;
}

}
