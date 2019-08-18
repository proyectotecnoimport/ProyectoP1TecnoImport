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
import Vista.Observer.VistaGerente;
import Vista.Observer.VistaJefeBodega;
import Vista.Observer.VistaVendedor;
import Vista.VistaTecnoImport;
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
        return null;
        
    }
    
}
