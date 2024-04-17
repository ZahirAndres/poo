import mx.utng.sesion03.Autor;
import mx.utng.sesion03.Libro;

public class App {
    public static void main(String[] args) throws Exception {
        Autor autor = new Autor();/*con new se manda a llamar un metodo para crear un objeto en la clase */
        autor.setNombre("Stephing");
        autor.setApellido("Kings");
        autor.setEdad(18);

        Libro libro = new Libro();
        libro.setTitulo("Gato Negro");
        libro.setAutor(autor);
        libro.setEditorial("anonimo");
        libro.setNumeroPagina(400);
        libro.setAnio(2000);
        System.out.println("Libro: "+libro.getTitulo());//sout, sysout
        System.out.println("Autor: "+libro.getAutor().getNombre()+" "+libro.getAutor().getApellido());
        
    }
}
