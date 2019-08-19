/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Singleton;

import Modelo.Establecimiento;
import Modelo.Inventario;
import Modelo.Persona;
import Modelo.Venta;
import java.util.ArrayList;

/**
 *
 * @author Dario Triviño
 */
public class BaseDeDatos {
    
    private ArrayList<Persona> usuarios=new ArrayList<>(); 
    private ArrayList<Inventario> inventarios=new ArrayList<>(); 
    private ArrayList<Venta> ventas=new ArrayList<>();
    private ArrayList<Establecimiento> establecimiento=new ArrayList<>();
    private BaseDeDatos baseDatos=new BaseDeDatos();
    
    private BaseDeDatos(){
        
    }
    
    public BaseDeDatos getInstance(){
        return baseDatos;
    }

    public ArrayList<Persona> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Persona> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Inventario> getInventarios() {
        return inventarios;
    }

    public void setInventarios(ArrayList<Inventario> inventarios) {
        this.inventarios = inventarios;
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }

    public ArrayList<Establecimiento> getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(ArrayList<Establecimiento> establecimiento) {
        this.establecimiento = establecimiento;
    }

    public BaseDeDatos getBaseDatos() {
        return baseDatos;
    }

    public void setBaseDatos(BaseDeDatos baseDatos) {
        this.baseDatos = baseDatos;
    }
   
    
}
