/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

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

    

    

   
    
    
}
