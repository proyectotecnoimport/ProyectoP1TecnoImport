package modelo.decorator;

import modelo.Empleado;
import modelo.Establecimiento;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dario Triviño
 */
public class Usuario extends Empleado implements UsuarioSistema{
    
    protected String name;
    protected String contrasena;
    

    public Usuario(String nombre, String apellido, String email, String direccion, String cedula, 
                    boolean estado, Establecimiento establecimiento, String usuario, String contrasena) {
        super(nombre, apellido, email, direccion, cedula, estado, establecimiento);
        this.name=usuario;
        this.contrasena=contrasena;
    }
    
    public Usuario(){
        
    }
    
    public String getUsuario() {
        return name;
    }

    public void setUsuario(String usuario) {
        this.name = usuario;
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

    
    
    @Override
    public boolean iniciarSesion(Connection conn,String usuario,String contraseña) throws UnsupportedOperationException{
        return false;
       
    }

    @Override
    public boolean cerrarSesion(Connection conn) {
        try {
            conn.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean busquedaArticulo(Connection conn, String patron, String tipoBusqueda) {
        String call;
        if (tipoBusqueda.equals("Nombre"))
            call = "{call dbo.sp_buscar_articulo_nombre(?)}";
        else if (tipoBusqueda.equals("Descripcion"))
            call = "{call dbo.sp_buscar_articulo_descripcion(?)}";
        else
            call = "{call dbo.sp_buscar_articulo_categoria(?)}";
        try(CallableStatement cstmt = conn.prepareCall(call); ) {
        cstmt.setString("string", patron);
        cstmt.execute();
        if (cstmt.getInt("output") == 1)
            return true;
    }   catch (SQLException ex) {  
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
}
