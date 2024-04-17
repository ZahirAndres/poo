package mx.utng.s27;

import java.util.concurrent.TimeUnit;

public class MiHilo extends Thread{
//private int count;
private String parametro;


public void setParametro(String parametro) {
    this.parametro = parametro;
}

    @Override
    public void run() {
/**        System.out.println(getName()+" En ejecución "+isDaemon());
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally{
            System.out.println("Veces: "+(++count));
        }        
        
 */
        while (!"terminar".equalsIgnoreCase(parametro)) {//miestras sea diferente
            //e ignora minus y mayus con case
            mostrarInfo();
            pausarUnSegundo();
        }

       }

    private void mostrarInfo(){
        String tipoHilo = isDaemon()?"Damon":"Usuario";
        System.out.println(tipoHilo+"\t| Nombre: "+getName()+"\t| ID:"+getId()+"\t|");

    }

    public static void pausarUnSegundo(){
       try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}