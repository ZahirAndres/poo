import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class App {
    public static void main(String[] args) throws Exception {
        List<String> materias = new ArrayList<>();
        materias.add("POO");
        Collections.addAll(materias,"FSG", "BD", "MMDS", "I", "IR", "FM");//Es una metodo de clase, osea no es instancia
        System.out.println(materias);
        
        for (String string : materias) {
           //para cada materia de las materias imprime un renglon
            System.out.println(string);
        }

        System.out.println("Al reves");
        Collections.reverse(materias);
        System.out.println(materias);

        System.out.println("La mas pequeña: "+Collections.min(materias));
        System.out.println("La mas pequeña: "+Collections.max(materias));

        Collections.sort(materias);
        System.out.println("Orden alfabético "+materias);

        System.out.println("Metodologia y Modelado se encutra en la posicion: "+(Collections.binarySearch(materias, "MMDS")+1));
        
        Collections.addAll(materias, "POO","POO","POO");
        System.out.println(materias);
        
        Collections.shuffle(materias);
        System.out.println(materias);

        System.out.println("Hay "+Collections.frequency(materias, "POO")+" POO en la lista");
        
    }
}
