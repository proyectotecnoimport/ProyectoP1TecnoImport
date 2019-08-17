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
public class Persona {
    
    protected String nombre;
    protected String apellido;
    protected String email;
    protected String direccion;
    protected String cedula;
    protected boolean estado;

    public Persona(String nombre, String apellido, String email, String direccion, String cedula, boolean estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.direccion = direccion;
        this.cedula = cedula;
        this.estado = estado;
    }

    
}
