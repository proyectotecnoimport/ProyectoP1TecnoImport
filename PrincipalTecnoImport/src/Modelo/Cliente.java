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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
    
}
