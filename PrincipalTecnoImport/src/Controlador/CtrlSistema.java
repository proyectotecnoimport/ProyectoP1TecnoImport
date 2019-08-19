/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Decorator.Gerente;
import Modelo.Decorator.JefeBodega;
import Modelo.Decorator.Usuario;
import Modelo.Decorator.Vendedor;
import Modelo.Singleton.conexionsql;
import Vista.Observer.VistaGerente;
import Vista.Observer.VistaJefeBodega;
import Vista.Observer.VistaVendedor;
import Vista.VistaTecnoImport;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import javafx.scene.control.Alert;

/**
 *
 * @author Dario Triviño
 */
public class CtrlSistema {
    
    static Usuario usuario;
    static VistaTecnoImport vista;
    
    public static void IngresarAlSistema(String usuario, String contraseña) {
        vista=null;
        //Búsqueda en la base
        CtrlSistema.usuario = validarUsuario(usuario, contraseña);
        if (CtrlSistema.usuario instanceof Vendedor) {
            VistaVendedor vv = new VistaVendedor(500,400, "Bienvenido Vendedor");
            vista = vv;
            vista.crearEscena();
        }
        else if (CtrlSistema.usuario instanceof Gerente) {
            VistaGerente vv = new VistaGerente(500,400, "Bienvenido Gerente");
            vista = vv;
            vista.crearEscena();
        }
        else if (CtrlSistema.usuario instanceof JefeBodega) {
            VistaJefeBodega av = new VistaJefeBodega(500,400, "Bienvenido Jefe de Bodega");
            vista = av;
            vista.crearEscena();
        }
        else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Usuario No Registrado");
            alert.setHeaderText("");
            alert.setContentText("Usuario no registrado o datos ingresados incorrectos");
            alert.showAndWait();    
        }
        
    }
        
    public static Usuario validarUsuario(String usuario, String contraseña){
       String query = "{call obtenerRol(?,?,?)}";
        ResultSet rs;

        try (Connection conn = conexionsql.getConnection();
                CallableStatement stmt = conn.prepareCall(query)) {
            //Set IN parameter
            stmt.setString(1, usuario);
            stmt.setString(2, contraseña);
            //Set OUT parameter
            stmt.registerOutParameter(3, Types.VARCHAR);
            rs = stmt.executeQuery();
            String rol = stmt.getString(3);
            Usuario u = getUsuario(rol, usuario, contraseña);
            return u;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    private static Usuario getUsuario(String rol, String usu, String contraseña) {
        Usuario usuario=new Usuario();
        if (rol != null) {
            switch (rol) {
                case "Vendedor":
                    usuario = new Vendedor();
                    break;
                case "Gerente":
                    usuario = new Gerente();
                    break;
                case "Administrador":
                    usuario = new JefeBodega();
                    break;
            }
        }
        usuario.setUsuario(usu);
        usuario.setContrasena(contraseña);
        usuario=getByUsuario(usuario);
        return usuario;
    }
    
    
    private static Usuario getByUsuario(Usuario usuario){
        String query = "{call obtenerCedula(?,?,?,?)}";
        ResultSet rs;
        try (Connection conn = conexionsql.getConnection();
                CallableStatement stmt = conn.prepareCall(query)) {
            //Set IN parameter
            stmt.setString(1, usuario.getUsuario());
            stmt.registerOutParameter(2, Types.VARCHAR);
            stmt.registerOutParameter(3, Types.VARCHAR);
            stmt.registerOutParameter(4, Types.VARCHAR);
            
            rs = stmt.executeQuery();
            String cedula=stmt.getString(2);
            String nombres=stmt.getString(3);
            String apellidos=stmt.getString(4);
            usuario.setCedula(cedula);
            usuario.setNombre(nombres);
            usuario.setApellido(apellidos);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return usuario;
    }
        
    
    
}
