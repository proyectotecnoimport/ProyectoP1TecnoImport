/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Strategy;

/**
 *
 * @author Dario Triviño
 */
public class Tarjeta implements FormaPago{
    
    private String nombre;
    private String numeroTarjeta;
    private boolean credito;
    private String cvv;
    private String fechaExpiracion;

    public Tarjeta(String nombre, String numeroTarjeta, boolean credito, String cvv, String fechaExpiracion) {
        this.nombre = nombre;
        this.numeroTarjeta = numeroTarjeta;
        this.credito = credito;
        this.cvv = cvv;
        this.fechaExpiracion = fechaExpiracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public boolean isCredito() {
        return credito;
    }

    public void setCredito(boolean credito) {
        this.credito = credito;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    @Override
    public void pago(double valorPagar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    
}
