package modelo;

/**
 *
 * @author Dario Triviño
 */
public class Factura extends DocumentoTransaccion{
    
    public Factura(String id, String descripcion, double cantidadPagada, Venta venta) {
        super(id, descripcion, cantidadPagada, venta);
    }

   
    
    
}
