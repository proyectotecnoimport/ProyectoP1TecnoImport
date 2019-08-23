package modelo.decorator;

import java.sql.Connection;

/**
 *
 * @author Dario Triviño
 */
public class UsuarioAdministrativo extends DecoratorUsuario{
    
    public UsuarioAdministrativo(UsuarioSistema usuarioSistema) {
        super(usuarioSistema);
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
