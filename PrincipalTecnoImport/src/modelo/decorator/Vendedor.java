package modelo.decorator;

import modelo.Articulo;
import modelo.Establecimiento;
import java.util.ArrayList;
import modelo.Cotizacion;
import modelo.DocumentoTransaccion;
import modelo.Venta;

/**
 *
 * @author Dario Triviño
 */
public class Vendedor extends Usuario {
    
    ArrayList<Venta> ventas;
    ArrayList<Cotizacion> cotizaciones;

    public Vendedor(String nombre, String apellido, String email, String direccion, String cedula, boolean estado, 
                    Establecimiento establecimiento, String usuario, String contrasena, ArrayList<Venta> ventas, ArrayList<Cotizacion> cotizaciones) {
        super(nombre, apellido, email, direccion, cedula, estado, establecimiento, usuario, contrasena);
        this.ventas=ventas;
        this.cotizaciones=cotizaciones;
    }
    
    public Vendedor(){
        
    }
    
    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }

    public ArrayList<Cotizacion> getCotizaciones() {
        return cotizaciones;
    }

    public void setCotizaciones(ArrayList<Cotizacion> cotizaciones) {
        this.cotizaciones = cotizaciones;
    }

    
    
}
