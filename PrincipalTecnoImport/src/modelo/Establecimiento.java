package modelo;

import java.util.List;

/**
 *
 * @author Dario Triviño
 */
public class Establecimiento {
    
    protected String nombre;
    protected String direccion;
    protected List<Inventario> inventario;
    protected List<Empleado> empleados;
    
    public Establecimiento(String nombre, String direccion, List<Inventario> inventario, List<Empleado> empleados){
        this.nombre=nombre;
        this.direccion=direccion;
        this.inventario=inventario;
        this.empleados=empleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Inventario> getInventario() {
        return inventario;
    }

    public void setInventario(List<Inventario> inventario) {
        this.inventario = inventario;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }
    
    
}
