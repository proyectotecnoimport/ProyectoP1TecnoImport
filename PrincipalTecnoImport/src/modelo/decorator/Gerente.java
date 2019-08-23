package modelo.decorator;

import modelo.Articulo;
import modelo.Cliente;
import modelo.Establecimiento;

/**
 *
 * @author Dario Triviño
 */
public class Gerente extends Usuario{
    
    public Gerente(String nombre, String apellido, String email, String direccion, String cedula, boolean estado, Establecimiento establecimiento, String usuario, String contraseña) {
        super(nombre, apellido, email, direccion, cedula, estado, establecimiento, usuario, contraseña);
    }
    
    public Gerente(){
        
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
