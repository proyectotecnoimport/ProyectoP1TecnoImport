package modelo.singleton;

import java.sql.*;

/**
 *
 * @author albin
 */
public class conexionSql {

    Connection conectarme;
    String drive = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String Usuario = "SA";
    String URL = "jdbc:sqlserver://127.0.0.1:1433;database=DBTECNOIMPORT";

    public Connection conexion() {
        try {
            Class.forName(drive);
            conectarme = DriverManager.getConnection(URL, Usuario, getContra("1090929292"));
            if (conectarme != null) {
                System.out.println("Exito");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println("Error" + ex);
        }
       
        return conectarme;
    }
    public String getContra(String contra){
        
        if(contra.equals("1090929292"))
            return "ismaelarias96@";
        return null;
   
        
    }
    public boolean terminarConexion(String clave){
        if(clave.equals("finalizar"));
        conectarme=null;
        return true;
        
    }
    
}
