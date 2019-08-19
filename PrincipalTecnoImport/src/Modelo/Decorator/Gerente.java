/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Decorator;

import Modelo.Articulo;
import Modelo.Cliente;
import Modelo.Establecimiento;

/**
 *
 * @author Dario Triviño
 */
public class Gerente extends Usuario{
    
    public Gerente(String nombre, String apellido, String email, String direccion, String cedula, boolean estado, Establecimiento establecimiento, String usuario, String contraseña) {
        super(nombre, apellido, email, direccion, cedula, estado, establecimiento, usuario, contraseña);
    }
    
    public Gerente(){
        
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Establecimiento getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(Establecimiento establecimiento) {
        this.establecimiento = establecimiento;
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
    
    //Metodos
    public void consultarClientes(Cliente clientes){
        
    }
    
    public void consultarArticulos(Articulo articulos){
        
    }
    
    public void consultarEnvios(){
        
    }
    
    public boolean pedirAbastecimiento(){
        return false;
        
    }

    public void asignarAdministrador(Usuario usuario){
        
    }
    
    public void buscarArticulo(Articulo articulos){
        
    }

}
