package mx.utng.s14.Ej2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/**
 * @author Zahir Andres Rodriguez Mora
 * @category GDS 0622
 * @since 2024-02-08
 */
public class Colecciones {
    public static void main(String[] args) {
        List<String> listaCadenas = new ArrayList<>();//Para parametrizar se coloca el tipo de la lista "<>"
        listaCadenas.isEmpty();//Ver si esta vacia

        System.out.println(listaCadenas.isEmpty());
        //uso de una LISTA=========================
        //Agregar a la lista
        listaCadenas.add("Venado");
        listaCadenas.add("Ornitorrinco");
        listaCadenas.add("Gato");
        listaCadenas.add("Gato");
        listaCadenas.add("Pejelagarto");
        listaCadenas.add("Aguila");
        //Imprimi la lista con todos sus elementos
        System.out.println(listaCadenas);
        //Imprima cada elemento con un salto de linea
        System.out.println("============CON UN FOR===============");
        for (int i = 0; i < listaCadenas.size()/*.size Numero de la lista */; i++) {
            System.out.println(listaCadenas.get(i));
        }
        System.out.println("=============CON UN FOREACH===============");
        //cada valor en cadena imprime el valor de cadena
        for (String cadena : listaCadenas) {
            System.out.println(cadena);
        }
        //uso de un CONJUNTO=========================
        //No se repiten los objetos en los conjuntos
        System.out.println("CONJUTNO =====================");
        Set<String> conjuntoCadena = new HashSet<>();
        conjuntoCadena.isEmpty();
        System.out.println(conjuntoCadena.isEmpty());
        conjuntoCadena.add("Venado");
        conjuntoCadena.add("Ornitorrinco");
        conjuntoCadena.add("Gato");
        conjuntoCadena.add("Gato");
        conjuntoCadena.add("Pejelagarto");
        conjuntoCadena.add("Aguila");
        //imprimir la lista
        
        for (String cadena : conjuntoCadena) {
            System.out.println(cadena);
        }
        System.out.println("Lista de numeros");
        List<Numero> listaNumeros = new ArrayList<>();
        listaNumeros.add(new Numero("uno"));
        listaNumeros.add(new Numero("dos"));
        listaNumeros.add(new Numero("tres"));
        listaNumeros.add(new Numero("tres"));
        listaNumeros.add(new Numero("cinco"));
        listaNumeros.add(new Numero("seis"));
        for (Numero cadena : listaNumeros) {
            System.out.println(cadena.getNombre());
        }
        
        System.out.println("Conjunto de numeros");
        Set<Numero> conjuntoNumeros = new HashSet<>();
        conjuntoNumeros.add(new Numero("uno"));
        conjuntoNumeros.add(new Numero("dos"));
        conjuntoNumeros.add(new Numero("tres"));
        conjuntoNumeros.add(new Numero("tres"));
        conjuntoNumeros.add(new Numero("cinco"));
        conjuntoNumeros.add(new Numero("seis"));
        for (Numero cadena : conjuntoNumeros) {
            System.out.println(cadena.getNombre());
        }


    }
}
