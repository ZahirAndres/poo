import mx.utng.sesion7.Lector;
import mx.utng.sesion7.ListasTareas;
import mx.utng.sesion7.Menu;
//Zahir Andrés Rodríguez Mora
public class App {
    public static void main(String[] args) throws Exception {
        //Todos los nombre de las instancias comienzan con minúscula lectorMenu
        Menu menu = new Menu();
        Lector lector = new Lector();
        ListasTareas lista = new ListasTareas();
        byte opcionSeleccionada = 0;
        do {
            menu.muestraOpciones();
            opcionSeleccionada = lector.leeOpcion();
            System.out.println("\n\nLa opcíon seleecionada es "+ opcionSeleccionada);
            switch (opcionSeleccionada) {
                case 1:
                    lista.crearNuevaLista();                   
                    break;
                case 2:
                    lista.verLista();
                    break;
                case 3:
                    lista.verTareasDeLista();
                    break;
                case 4:
                    lista.actualizarListaTareas();
                    break;
                case 5:
                    lista.eliminarListaTareas();
                    break;
                case 6:
                System.out.println("Saliendo de la aplicación...Adios");
                break;            
                default:
                System.out.println("Opción desconocida...");
                    break;
            }
        } while (opcionSeleccionada != 6);
    }
}
