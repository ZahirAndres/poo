package mx.utng.s15;

import java.util.PriorityQueue;
import java.util.Queue;

public class LibroTest {
    public static void main(String[] args) {
        //Priorisa la cola de los elementos
        Queue<Libro> libros = new PriorityQueue<>();
        libros.add(new Libro("Libro1",3)); //forma anonima
        libros.add(new Libro("libro2",2));
        libros.add(new Libro("libro4",5));
        System.out.println(libros);

        Libro libro = null;
        //.poll() borra el ultimo de la lista
        while ((libro = libros.poll())!=null) {
            System.out.println(libro.getTitulo());
        }

        System.out.println(libros);

    }
}
