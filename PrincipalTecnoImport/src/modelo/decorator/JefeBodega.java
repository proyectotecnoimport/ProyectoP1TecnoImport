package modelo.decorator;

import modelo.Articulo;
import modelo.Bodega;
import modelo.Establecimiento;
import java.util.Queue;
import modelo.Repartidor;
import modelo.Ruta;

/**
 *
 * @author Dario Triviño
 */
public class JefeBodega extends Usuario {
    
    private Bodega bodega;
        
    public JefeBodega(String nombre, String apellido, String email, String direccion, String cedula, boolean estado, Establecimiento establecimiento, String usuario, String contraseña, Bodega bodega) {
        super(nombre, apellido, email, direccion, cedula, estado, establecimiento, usuario, contraseña);
        this.bodega=bodega;
    }
    
    public JefeBodega(){
        
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
    
     public Bodega getBodega() {
        return bodega;
    }

    public void setBodega(Bodega bodega) {
        this.bodega = bodega;
    }
    //Metodos
    public void ingresarEnvios() throws UnsupportedOperationException{
        
    }
    
    public void ingresarEntregas() throws UnsupportedOperationException{
        
    }
    
    public Ruta crearRutasEntrega() throws UnsupportedOperationException{
        return null;
        
    }
    
    public void asignarRepartidor(Queue<Repartidor> repartidores) throws UnsupportedOperationException{
        
    }
    
    public void buscarArticulo(Articulo articulos) throws UnsupportedOperationException{
        
    }
    
    public UsuarioAdministrativo asignarAdministrador(Usuario usuario){
        if(usuario instanceof Vendedor){
            return new UsuarioAdministrativo(new Vendedor());
        }
        else if(usuario instanceof JefeBodega){
            return new UsuarioAdministrativo(new JefeBodega());
            
        }else if(usuario instanceof Gerente){
            return new UsuarioAdministrativo(new Gerente());
        }
        return null;
    }
    
    
}
