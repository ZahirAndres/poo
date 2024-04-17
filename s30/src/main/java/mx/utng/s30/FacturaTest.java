package mx.utng.s30;
/**
 * @autor Zahir Andres Rodriguez Mora
 * @category GDS 0622
 * @since 05/03/2024
 */
import java.util.ArrayList;
import java.util.List;

public class FacturaTest {
    @SuppressWarnings("null")
    public static void main(String[] args) {
        Factura f1 = new Factura("Computadora", 10000);
        Factura f2 = new Factura("Telefono", 5000);
        Factura f3 = new Factura("Impresora", 4000);
        Factura f4 = new Factura("TV", 8000);

        List<Factura> facturas = new ArrayList<>();
        facturas.add(f1);
        facturas.add(f2);
        facturas.add(f3);
        facturas.add(f4);


        Factura fo = null;
        for (Factura factura : facturas) {
            if(factura.getImporte()==5000){
                fo = factura;
                break;
            }
        }
        System.out.println(fo.getConcepto()+", "+fo.getImporte());

        Factura fs = facturas.stream().filter(s -> s.getImporte() == 5000).findFirst().get();
        System.out.println(fs.getConcepto()+", "+fs.getImporte());

        //findAny() encontrar la ultima

        long x = facturas.stream().filter(s -> s.getImporte() > 4000).count();
        System.out.println(x);

        List<Factura> facturasEncontradas = facturas.stream().filter(s -> s.getImporte() > 4000).toList();
        System.out.println(facturasEncontradas);
    }
}
