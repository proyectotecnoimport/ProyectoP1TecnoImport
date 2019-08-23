package modelo;

/**
 *
 * @author Dario Triviño
 */
public class Empleado extends Persona{
    
    protected Establecimiento establecimiento;

    public Empleado(String nombre, String apellido, String email, String direccion, String cedula, boolean estado, Establecimiento establecimiento) {
        super(nombre, apellido, email, direccion, cedula, estado);
        this.establecimiento=establecimiento;
    }
    
    public Empleado(){
        
    }
}
