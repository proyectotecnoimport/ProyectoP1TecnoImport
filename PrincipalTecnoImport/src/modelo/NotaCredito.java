package modelo;

/**
 *
 * @author Dario Triviño
 */
public class NotaCredito extends DocumentoTransaccion{
    
    public NotaCredito(String id, String descripcion, double cantidadPagada, Venta venta) {
        super(id, descripcion, cantidadPagada, venta);
    }

    
    
}
