package modelo.decorator;

import java.sql.Connection;

/**
 *
 * @author Dario Triviño
 */
public interface UsuarioSistema {
    
    public boolean iniciarSesion(Connection conn,String usuario,String contrasena);
    public boolean cerrarSesion(Connection conn);
    public boolean busquedaArticulo(Connection conn, String patron, String tipoBusqueda);
    
}
