package modelo;

/**
 *
 * @author Dario Triviño
 */
public class Cliente extends Persona{
    
    boolean reciboEnvio;

    public Cliente(String nombre, String apellido, String email, String direccion, String cedula, boolean estado, boolean reciboEnvio) {
        super(nombre, apellido, email, direccion, cedula, estado);
        this.reciboEnvio=reciboEnvio;
    }

    public boolean isReciboEnvio() {
        return reciboEnvio;
    }

    public void setReciboEnvio(boolean reciboEnvio) {
        this.reciboEnvio = reciboEnvio;
    }
    
}