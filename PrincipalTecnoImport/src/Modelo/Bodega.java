/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.Decorator.JefeBodega;
import java.util.ArrayList;
import java.util.LinkedList;
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
    public boolean getHayGerente(){
        return hayGerente;
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
    
    public Queue<Repartidor> getColaRespartidores() {
        return colaRepartidores;
    }

    public void setColaRespartidores(Queue<Repartidor> colaRepartidores) {
        this.colaRepartidores = colaRepartidores;
    }
    
}
