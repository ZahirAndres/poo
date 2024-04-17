package mx.utng.s10;

public class Combustible {
    private short litrosMaximos;
    private short litrosActuales;

    
    public Combustible(short litrosMaximos, short litrosActuales) {
        this.litrosMaximos = litrosMaximos;
        this.litrosActuales = litrosActuales;
    }
    public short getLitrosActuales() {
        return litrosActuales;
    }
    public short getLitrosMaximos() {
        return litrosMaximos;
    }

    public void setLitrosActuales(short litrosActuales) {
        this.litrosActuales = litrosActuales;
    }
    public void setLitrosMaximos(short litrosMaximos) {
        this.litrosMaximos = litrosMaximos;
    }

    public void usar(){
        litrosActuales--;
        System.out.println("Quedan "+litrosActuales+ " litros.");
    }

    @Override
    public boolean equals(Object obj) {
            if (this==obj) return true;
            if (obj==null || getClass() != obj.getClass()) return false;
        Combustible that = (Combustible)obj;
            if(litrosMaximos!=that.litrosMaximos) return false;
            return litrosActuales==that.litrosActuales;        
    }
    public Combustible() {//contructor por defecto o vacio, pone a los numeros 0 y a los string null y boleanos false
    }

    
}
