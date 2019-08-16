/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principaltecnoimport.Modelo.Decorator;

import java.util.ArrayList;
import principaltecnoimport.Model.Articulo;
import principaltecnoimport.Model.Empleado;

/**
 *
 * @author Dario Triviño
 */
public class Usuario extends Empleado implements UsuarioSistema{
    String usuario;
    String contrasena;
    boolean estado;

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
