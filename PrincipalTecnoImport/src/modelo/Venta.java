package modelo;

import modelo.decorator.Vendedor;
import java.util.HashMap;
import java.util.Map;
import modelo.strategy.FormaPago;

/**
 *
 * @author Dario Triviño
 */
public class Venta {
    
    private String id;
    private Map<Articulo,Integer> articulos=new HashMap<>(); 
    private double valorVenta;
    private String fecha;
    private Vendedor vendedor;
    private Cliente cliente;
    private FormaPago formaPago;

    public Venta(String id, Map<Articulo, Integer> articulos, double valorVenta, String fecha,
                 Cliente cliente, Vendedor vendedor, FormaPago formaPago) {
        this.id = id;
        this.articulos = articulos;
        this.valorVenta = valorVenta;
        this.fecha = fecha;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.formaPago = formaPago;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<Articulo, Integer> getArticulos() {
        return articulos;
    }

    public void setArticulos(Map<Articulo, Integer> articulos) {
        this.articulos = articulos;
    }

    public double getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(double valorVenta) {
        this.valorVenta = valorVenta;
    }



    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }
    
  

}
