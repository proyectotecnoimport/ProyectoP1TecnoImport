package modelo;

/**
 *
 * @author Dario Triviño
 */
public class Repartidor extends Empleado {
    
    public Repartidor(String nombre, String apellido, String email, String direccion, String cedula, boolean estado, Establecimiento establecimiento) {
        super(nombre, apellido, email, direccion, cedula, estado, establecimiento);
    }

    public Establecimiento getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(Establecimiento establecimiento) {
        this.establecimiento = establecimiento;
    }

    
    
}
