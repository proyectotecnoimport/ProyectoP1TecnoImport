/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Decorator;

import java.util.ArrayList;
import Modelo.Articulo;

/**
 *
 * @author Dario Triviño
 */
public abstract class DecoratorUsuario implements UsuarioSistema{
    
    protected UsuarioSistema usuariosistema;

    public DecoratorUsuario(UsuarioSistema usuariosistema) {
        this.usuariosistema = usuariosistema;
    }
    
    @Override
    public boolean inciarSesion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean cerrarSesion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String busquedaArticulo(ArrayList<Articulo> articulo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
    
}
