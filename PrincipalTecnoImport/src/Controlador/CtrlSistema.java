/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Modelo.Singleton.conexionsql;
import Principal.TecnoImporrt;
import Vista.Observer.VistaGerente;
import Vista.Observer.VistaJefeBodega;
import Vista.Observer.VistaVendedor;
import Vista.VistaTecnoImport;
import java.sql.CallableStatement;
import java.sql.SQLException;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

/**
 *
 * @author Dario Triviño
 */
public class CtrlSistema {
    
    static String usuario;
    static VistaTecnoImport vista;
    
    public static void IngresarAlSistema(String usuario, String contraseña) {
        vista=null;
        //Búsqueda en la base

        CtrlSistema.usuario=validarUsuario(usuario,contraseña);

        if (CtrlSistema.usuario.equals("Vendedor")) {
            Stage s=new Stage();
            VistaVendedor vv = new VistaVendedor(800,600, "Bienvenido Vendedor");
            vista = vv;
            TecnoImporrt.primaryStage.setScene(vista.getScene());
        }
        else if (CtrlSistema.usuario.equals("Gerente")) {
            VistaGerente vv = new VistaGerente(800,600, "Bienvenido Gerente");
            vista = vv;
            TecnoImporrt.primaryStage.setScene(vista.getScene());        }
        else if (CtrlSistema.usuario.equals("Jefe de Bodega")) {
            VistaJefeBodega av = new VistaJefeBodega(800,600, "Bienvenido Jefe de Bodega");
            vista = av;
            TecnoImporrt.primaryStage.setScene(vista.getScene());        }
        else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Usuario No Registrado");
            alert.setHeaderText("");
            alert.setContentText("Usuario no registrado o datos ingresados incorrectos");
            alert.showAndWait();    
        }
        
    }
        
    public static String validarUsuario(String usuario, String contraseña){
               conexionsql con = new conexionsql();
               
       try(CallableStatement cstmt = con.conexion().prepareCall("{call dbo.sp_iniciar_sesion(?, ?, ?)}"); ) {
        cstmt.setString("usuario", usuario);
        cstmt.setString("clave", contraseña);
        cstmt.registerOutParameter("output", java.sql.Types.INTEGER);
        cstmt.execute();
        if(cstmt.getInt("output")==1){
            
            CallableStatement cstmt2 = con.conexion().prepareCall("{call dbo.sp_buscar_rol(?, ?, ?)}");
            cstmt2.setString("usuario", usuario);
            cstmt2.setString("clave", contraseña);
            cstmt2.registerOutParameter("rol", java.sql.Types.VARCHAR);
            cstmt2.execute();
            return cstmt2.getString("rol");
        }
        
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

   
    
}

