package mx.utng.sesion9;

public class Combustible {
    private short litrosMaximos;
    private short litrosActuales;

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
}
