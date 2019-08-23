package controlador;


import modelo.singleton.conexionSql;
import principal.TecnoImporrt;
import vista.observer.VistaGerente;
import vista.observer.VistaJefeBodega;
import vista.observer.VistaVendedor;
import vista.VistaTecnoImport;
import java.sql.CallableStatement;
import java.sql.SQLException;
import javafx.scene.control.Alert;

/**
 *
 * @author Dario Triviño
 */
public class CtrlSistema {
    
    static String usuario;
    static VistaTecnoImport vista;

    private CtrlSistema() {
        
    }
    
    
    public static void IngresarSistema(String usuario, String contrasena) {
        vista=null;
        //Búsqueda en la base

        CtrlSistema.usuario=validarUsuario(usuario,contrasena);

        switch (CtrlSistema.usuario) {
            case "Vendedor":
                {
                    VistaVendedor vv = new VistaVendedor(800,600, "Bienvenido Vendedor");
                    vista = vv;
                    TecnoImporrt.primaryStage.setScene(vista.getScene());
                    break;
                }
            case "Gerente":
                {
                    VistaGerente vv = new VistaGerente(800,600, "Bienvenido Gerente");
                    vista = vv;
                    TecnoImporrt.primaryStage.setScene(vista.getScene());
                    break;
                }
            case "Jefe de Bodega":
                    VistaJefeBodega av = new VistaJefeBodega(800,600, "Bienvenido Jefe de Bodega");
                    vista = av;
                    TecnoImporrt.primaryStage.setScene(vista.getScene());    
                    break;
            default:
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Usuario No Registrado");
                alert.setHeaderText("");
                alert.setContentText("Usuario no registrado o datos ingresados incorrectos");
                alert.showAndWait();
                break;
        }
        
    }
        
    public static String validarUsuario(String usuario, String contrasena){
               conexionSql con = new conexionSql();
               
       try(CallableStatement cstmt = con.conexion().prepareCall("{call dbo.sp_iniciar_sesion(?, ?, ?)}"); ) {
        cstmt.setString("usuario", usuario);
        cstmt.setString("clave", contrasena);
        cstmt.registerOutParameter("output", java.sql.Types.INTEGER);
        cstmt.execute();
        if(cstmt.getInt("output")==1){
            
            CallableStatement cstmt2 = con.conexion().prepareCall("{call dbo.sp_buscar_rol(?, ?, ?)}");
            cstmt2.setString("usuario", usuario);
            cstmt2.setString("clave", contrasena);
            cstmt2.registerOutParameter("rol", java.sql.Types.VARCHAR);
            cstmt2.execute();
            return cstmt2.getString("rol");
        }
        
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return null;
    }

   
    
}

