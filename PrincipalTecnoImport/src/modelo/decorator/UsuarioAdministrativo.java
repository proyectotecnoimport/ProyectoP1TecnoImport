package modelo.decorator;

import modelo.Articulo;
import java.sql.Connection;

/**
 *
 * @author Dario Triviño
 */
public class UsuarioAdministrativo extends DecoratorUsuario{
    
    public UsuarioAdministrativo(UsuarioSistema usuarioSistema) {
        super(usuarioSistema);
    }

    
    public void crearUsuario(Usuario usuario) throws UnsupportedOperationException{
        
    }
    
    public void consultarUsuario(Usuario usuario) throws UnsupportedOperationException{
        
    }
    
    public void actualizarUsuario(Usuario usuario) throws UnsupportedOperationException{
        
    }
    
    public void eliminarUsuario(Usuario usuario) throws UnsupportedOperationException{
        
    }
    
    public void ingresarStocks() throws UnsupportedOperationException{
        
    }
    
    public void actualizarStocks() throws UnsupportedOperationException{
    
    }
    
    public void actualizarPrecioVenta(Articulo articulo) throws UnsupportedOperationException{
        
    }
    
    public void importarDatos() throws UnsupportedOperationException{
        
    }

    @Override
    public boolean iniciarSesion(Connection conn,String usuario,String contraseña) {
        return this.usuariosistema.iniciarSesion(conn,usuario,contraseña);
    }

    @Override
    public boolean cerrarSesion(Connection conn) {
        return this.usuariosistema.cerrarSesion(conn);
    }

    @Override
    public boolean busquedaArticulo(Connection conn, String patron, String tipoBusqueda) {
        return this.usuariosistema.busquedaArticulo(conn, patron, tipoBusqueda);
    }

    
    
    
}
