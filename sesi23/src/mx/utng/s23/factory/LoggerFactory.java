package mx.utng.s23.factory;

public class LoggerFactory {
    public Logger getLogger(int type){
        if(type == 1){
            return new FileLogger();
        }else if(type == 2){
            return new ConsoleLogger();
        }else{
            System.out.println("Opcion incorrecta, por defecto sera consola");
            return new ConsoleLogger();
        }
    }
}
