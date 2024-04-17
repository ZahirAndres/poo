package mx.utng.sesion9;

public class Llanta {
    private float ancho;
    private float diametro;
    private float presion;

    public float getAncho() {
        return ancho;
    }
    public float getDiametro() {
        return diametro;
    }
    public float getPresion() {
        return presion;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }

    public void setPresion(float presion) {
        this.presion = presion;
    }
    public void rodar(){
        System.out.println("Rodando...");
    }
}
