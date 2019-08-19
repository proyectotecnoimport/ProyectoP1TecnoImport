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
  
    static String drive="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    static String Usuario="SA";
    static String Contra="ismaelarias96@";
    static String URL="jdbc:sqlserver://127.0.0.1:1433;database=Sistema";
    static Connection conectarme;
    
    public static void conexionsql(){
        try {
            Class.forName(drive);
            conectarme=DriverManager.getConnection(URL,Usuario,Contra);
            if(conectarme!=null){
                System.out.println("Exito");
            }
        } catch (ClassNotFoundException | SQLException ex) {
             System.err.println("Error" + ex);
        } 
    }
    
    public static Connection getConnection() {
        try {
            if (conectarme.isClosed()) {
                conectarme = DriverManager.getConnection(URL,Usuario,Contra);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return conectarme;
    }
}
