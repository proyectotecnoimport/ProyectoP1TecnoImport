
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    Connection con;

    public Connection Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Techno", "root", "secret");
            if(con!=null){
            System.out.println("Se conexto con exito");
            }
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println("Error" + ex);
            
        } return con;
        
    }
    
    
    
    public static void main(String args[]) {
        Conexion con = new Conexion();     
        Connection conn = con.Conexion();
        /*try {
            PreparedStatement pps= conn.prepareStatement("INSERT INTO prueba(id,Nombre) VALUES (?,?)");
            pps.setString(1, "4");
            pps.setString(2, "jose");
            pps.executeUpdate();
            
        }catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
    }

}
