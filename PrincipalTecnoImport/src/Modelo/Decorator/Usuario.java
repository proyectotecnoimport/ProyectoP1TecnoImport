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

/**
 *
 * @author Dario Triviño
 */
public class Usuario extends Empleado implements UsuarioSistema{
    
    protected String usuario;
    protected String contrasena;

    public Usuario(String nombre, String apellido, String email, String direccion, String cedula, 
                    boolean estado, Establecimiento establecimiento, String usuario, String contraseña) {
        super(nombre, apellido, email, direccion, cedula, estado, establecimiento);
        this.usuario=usuario;
        this.contrasena=contraseña;
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
