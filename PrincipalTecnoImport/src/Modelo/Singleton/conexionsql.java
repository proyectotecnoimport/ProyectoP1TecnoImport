/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Singleton;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author albin
 */
public class conexionsql {
    static Connection conectarme;
    String drive="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String Usuario="SA";
    String Contra="ismaelarias96@";
    String URL="jdbc:sqlserver://127.0.0.1:1433;database=DBTECNOIMPORT";
    
    public Connection conexion(){
        try {
            Class.forName(drive);
            conectarme=DriverManager.getConnection(URL,Usuario,Contra);
            if(conectarme!=null){
                System.out.println("Exito");
            }
        } catch (ClassNotFoundException | SQLException ex) {
             System.err.println("Error" + ex);
        } 
        return conectarme;
    }
    
    
    
    public static void main (String args[]){
        conexionsql conn = new conexionsql();
        Connection con = conn.conexion();  
        

    }
}
