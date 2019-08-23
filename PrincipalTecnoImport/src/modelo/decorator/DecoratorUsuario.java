package modelo.decorator;


/**
 *
 * @author Dario Triviño
 */
public abstract class DecoratorUsuario implements UsuarioSistema{
    protected UsuarioSistema usuariosistema;

    public DecoratorUsuario(UsuarioSistema usuario) {
            super();
            this.usuariosistema = usuario;
    }
}
