/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Decorator;

import java.util.ArrayList;
import Modelo.Articulo;
import Modelo.Empleado;
import Modelo.Establecimiento;
import Vista.Observer.VistaGerente;
import Vista.Observer.VistaJefeBodega;
import Vista.Observer.VistaVendedor;
import Vista.VistaTecnoImport;
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
    
    protected String usuario;
    protected String contrasena;
    static VistaTecnoImport vista;
    

    public Usuario(String nombre, String apellido, String email, String direccion, String cedula, 
                    boolean estado, Establecimiento establecimiento, String usuario, String contraseña) {
        super(nombre, apellido, email, direccion, cedula, estado, establecimiento);
        this.usuario=usuario;
        this.contrasena=contraseña;
    }
    
    public Usuario(){
        
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

    
    
    @Override
    public boolean iniciarSesion(Connection conn,String usuario,String contraseña) {
        try(CallableStatement cstmt = conn.prepareCall("{call dbo.sp_iniciar_sesion(?, ?, ?)}"); ) {
        cstmt.setString("usuario", usuario);
        cstmt.setString("clave", contraseña);
        cstmt.registerOutParameter("output", java.sql.Types.INTEGER);
        cstmt.execute();
        vista=null;
        if (cstmt.getObject(1) instanceof Vendedor){
            VistaVendedor vv = new VistaVendedor(500,400, "Bienvenido Vendedor");
            vista = vv;
            vista.crearEscena();
            return true;
        }else if(cstmt.getObject(1) instanceof Vendedor){
            VistaGerente vv = new VistaGerente(500,400, "Bienvenido Gerente");
            vista = vv;
            vista.crearEscena();
          
        }else if(cstmt.getObject(1) instanceof JefeBodega){
            VistaJefeBodega av = new VistaJefeBodega(500,400, "Bienvenido Jefe de Bodega");
            vista = av;
            vista.crearEscena();
        }
        }   catch (SQLException ex) {  
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
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
