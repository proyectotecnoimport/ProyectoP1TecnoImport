/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Decorator;

import java.util.ArrayList;
import Modelo.Articulo;
import java.sql.Connection;

/**
 *
 * @author Dario Triviño
 */
public interface UsuarioSistema {
    
    public boolean iniciarSesion(Connection conn,String usuario,String contraseña);
    public boolean cerrarSesion(Connection conn);
    public boolean busquedaArticulo(Connection conn, String patron, String tipoBusqueda);
    
}
