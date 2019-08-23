package modelo;

import java.util.ArrayList;

/**
 *
 * @author Dario Triviño
 */
public class Matriz extends Establecimiento {
    
    public Matriz(String nombre, String direccion, ArrayList<Inventario> inventario, ArrayList<Empleado> empleados) {
        super(nombre, direccion, inventario, empleados);
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

    public ArrayList<Inventario> getInventario() {
        return (ArrayList<Inventario>) inventario;
    }

    public void setInventario(ArrayList<Inventario> inventario) {
        this.inventario = inventario;
    }

    public ArrayList<Empleado> getEmpleados() {
        return (ArrayList<Empleado>) empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
    
    
    
}
