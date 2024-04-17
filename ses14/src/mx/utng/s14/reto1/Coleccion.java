package mx.utng.s14.reto1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * @author Zahir Andres Rodriguez Mora
 * @category GDS 0622
 * @size 2024-02-08
 */
public class Coleccion {
    public static void main(String[] args) {
        List<String> listaFrutas = new ArrayList<>();
        System.out.println(listaFrutas.isEmpty());
        listaFrutas.add("Plátanos");
        listaFrutas.add("Sandía");
        listaFrutas.add("Pera");
        listaFrutas.add("Manzana");
        listaFrutas.add("Naranja");
        listaFrutas.add("Kiwi");
        
        System.out.println("Orden invertido====================");
        Collections.reverse(listaFrutas);
        for (String string : listaFrutas) {
            System.out.println(string);
        }
        System.out.println("Elemento más pequeño================");
        System.out.println(Collections.min(listaFrutas));
        System.out.println("Elemento más grande=================");
        System.out.println(Collections.max(listaFrutas));
        System.out.println("Orden alfabético====================");
        Collections.sort(listaFrutas);
        for (String string : listaFrutas) {
            System.out.println(string);
        }
        System.out.println("Busca Pera y Naranja================");
        Collections.sort(listaFrutas);//ordenar en orden alfabético
        System.out.println(Collections.binarySearch(listaFrutas, "Pera"));
        int indice = Collections.binarySearch(listaFrutas, "Pera");
        int indice1 = Collections.binarySearch(listaFrutas, "Naranja");
        if(indice >= 0 && indice1>=0){
            System.out.println("Si existe Pera en: "+ (indice+1));
            System.out.println(" y también Naranja en: "+ (indice1+1));
        }else{
            System.out.println("No existe");
        }

        System.out.println("Agrega tres manzanas nuevas==========");
        Collections.addAll(listaFrutas, "Manzana", "Manzana", "Manzana");
        for (String string : listaFrutas) {
            System.out.println(string);
        }

        System.out.println("Orden Aleatorio=====================");
        Collections.shuffle(listaFrutas);
        for (String string : listaFrutas) {
            System.out.println(string);
        }
        System.out.println("Contar Manzana======================");
        System.out.println(Collections.frequency(listaFrutas, "Manzana"));

    }
}
