/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Dario Triviño
 */
public class Establecimiento {
    
    protected String nombre;
    protected String direccion;
    protected ArrayList<Inventario> inventario= new ArrayList<>();
    protected ArrayList<Empleado> empleados= new ArrayList<>();
    
    public Establecimiento(String nombre, String direccion, ArrayList<Inventario> inventario, ArrayList<Empleado> empleados){
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

    public ArrayList<Inventario> getInventario() {
        return inventario;
    }

    public void setInventario(ArrayList<Inventario> inventario) {
        this.inventario = inventario;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
    
    
}
