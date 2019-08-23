package modelo;

import java.util.ArrayList;
import java.util.Queue;

/**
 *
 * @author Dario Triviño
 */
public class Bodega extends Establecimiento{
    
    private Queue<Repartidor> colaRepartidores;
    private boolean hayGerente=false;
    
    public Bodega(String nombre, String direccion, ArrayList<Inventario> inventario, ArrayList<Empleado> empleados, Queue<Repartidor> colaRepartidores, boolean hayGerente) {
        super(nombre, direccion, inventario, empleados);
        this.colaRepartidores=colaRepartidores;
        this.hayGerente=hayGerente;
    }

    public Queue<Repartidor> getColaRepartidores() {
        return colaRepartidores;
    }

    public boolean isHayGerente() {
        return hayGerente;
    }
  
    
    
}
