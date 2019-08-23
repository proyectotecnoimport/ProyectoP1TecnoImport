package modelo.decorator;

import modelo.Bodega;
import modelo.Establecimiento;

/**
 *
 * @author Dario Triviño
 */
public class JefeBodega extends Usuario {
    
    private Bodega bodega;
        
    public JefeBodega(String nombre, String apellido, String email, String direccion, String cedula, boolean estado, Establecimiento establecimiento, String usuario, String contraseña, Bodega bodega) {
        super(nombre, apellido, email, direccion, cedula, estado, establecimiento, usuario, contraseña);
        this.bodega=bodega;
    }
    
    public JefeBodega(){
        
    }

    
     public Bodega getBodega() {
        return bodega;
    }

    public void setBodega(Bodega bodega) {
        this.bodega = bodega;
    }
 
    
    public UsuarioAdministrativo asignarAdministrador(Usuario usuario){
        if(usuario instanceof Vendedor){
            return new UsuarioAdministrativo(new Vendedor());
        }
        else if(usuario instanceof JefeBodega){
            return new UsuarioAdministrativo(new JefeBodega());
            
        }else if(usuario instanceof Gerente){
            return new UsuarioAdministrativo(new Gerente());
        }
        return null;
    }
    
    
}
