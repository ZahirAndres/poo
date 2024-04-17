package mx.utng.sesion9;

public class Automovil {
    private String marca;
    private String modelo;
    private int anioFabricacion;
    private int kilometraje;
    private Llanta[] llantas = new Llanta[4];
    private Combustible combustible = new Combustible();

    public Automovil(String marca, String modelo, int anioFabricacion, int kilometraje){
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.kilometraje = kilometraje;

    }
    @Override
    public int hashCode() {
        int hash = 0;
        hash = marca.hashCode();
        hash += modelo.hashCode();
        hash += anioFabricacion;
        hash += kilometraje;
        return hash;
    }
    

    public void colocaLlantas(
        Llanta delanteraIzquierdda, 
        Llanta delanteraDerecha, 
        Llanta traseraIzquierda, 
        Llanta traseraDerecha){
    llantas[0] = delanteraIzquierdda;
    llantas[1] = delanteraDerecha;
    llantas[2] = traseraIzquierda;
    llantas[3] = traseraDerecha;
    }

    public void llenarTanque(){
        combustible.setLitrosActuales(combustible.getLitrosMaximos());
    }
    public void avanzar(){
        if (combustible.getLitrosActuales() > 0) {
            for (Llanta llanta : llantas){
                llanta.rodar();
            }
            combustible.usar();
        } else {
            System.out.println("No hay combustible!!");
        }
    }
    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }
    public Automovil(String marca, String modelo, int anioFabricacion, int kilometraje, Llanta[] llantas,
            Combustible combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.kilometraje = kilometraje;
        this.llantas = llantas;
        this.combustible = combustible;
    }
    

}
