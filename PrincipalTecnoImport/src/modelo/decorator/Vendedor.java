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
                    Establecimiento establecimiento, String usuario, String contraseña, ArrayList<Venta> ventas, ArrayList<Cotizacion> cotizaciones) {
        super(nombre, apellido, email, direccion, cedula, estado, establecimiento, usuario, contraseña);
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Establecimiento getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(Establecimiento establecimiento) {
        this.establecimiento = establecimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    //Metodos
    public void agregarClientes() throws UnsupportedOperationException{
        
    }
    
    public void editarClientes() throws UnsupportedOperationException{
        
    }
    
    public Cotizacion realizarCotizacion(Articulo articulo) throws UnsupportedOperationException{
        return null;
        
    }
    
    public void editarCotizaciones(Cotizacion cotizacion) throws UnsupportedOperationException{
        
    }
    
    public void buscarArticulo(Articulo articulos) throws UnsupportedOperationException{
        
    }
    
    public Venta realizarVenta(Articulo articulo) throws UnsupportedOperationException{
        return null;
        
    }
    
    public void consultarEntregas() throws UnsupportedOperationException{
        
    }
    
    public void ingresarNotasCredito() throws UnsupportedOperationException{
        
    }
    
    public void enviarCorreo(DocumentoTransaccion documentoTransaccion) throws UnsupportedOperationException{
        
    }
    
    
}
