/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Decorator;

import Modelo.Articulo;
import java.sql.Connection;

/**
 *
 * @author Dario Triviño
 */
public class UsuarioAdministrativo extends DecoratorUsuario{
    
    public UsuarioAdministrativo(UsuarioSistema usuarioSistema) {
        super(usuarioSistema);
    }
    
    public void crearUsuario(Usuario usuario){
        
    }
    
    public void consultarUsuario(Usuario usuario){
        
    }
    
    public void actualizarUsuario(Usuario usuario){
        
    }
    
    public void eliminarUsuario(Usuario usuario){
        
    }
    
    public void ingresarStocks(){
        
    }
    
    public void actualizarStocks(){
    
    }
    
    public void actualizarPrecioVenta(Articulo articulo){
        
    }
    
    public void importarDatos(){
        
    }

    @Override
    public boolean inciarSesion(Connection conn) {
        return this.usuariosistema.inciarSesion(conn);
    }

    @Override
    public boolean cerrarSesion(Connection conn) {
        return this.usuariosistema.cerrarSesion(conn);
    }

    @Override
    public boolean busquedaArticulo(Connection conn, String patron, String tipoBusqueda) {
        return this.usuariosistema.busquedaArticulo(conn, patron, tipoBusqueda);
    }

    
    
    
}
