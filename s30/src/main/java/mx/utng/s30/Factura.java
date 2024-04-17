package mx.utng.s30;

public class Factura {
    private String concepto;
    private int importe;

    public Factura(String concepto, int importe){
        this.concepto = concepto;
        this.importe = importe;
    }

    public String getConcepto() {
        return concepto;
    }
    public int getImporte() {
        return importe;
    }
    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
    public void setImporte(int importe) {
        this.importe = importe;
    }

    @Override
    public String toString() {
        
        return this.concepto+"-"+ this.importe;
    }
}
