package modelo.strategy;

import java.util.ArrayList;

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
    private double pago;
    private static ArrayList<FormaPago> FacturasTarjeta;
    
    public Tarjeta(String nombre, String numeroTarjeta, boolean credito, String cvv, String fechaExpiracion) {
        this.nombre = nombre;
        this.numeroTarjeta = numeroTarjeta;
        this.credito = credito;
        this.cvv = cvv;
        this.fechaExpiracion = fechaExpiracion;
        this.pago=0;
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
    public boolean pago(double valorPagar) {
            if(valorPagar==0) return false;
            pago = valorPagar;
            Tarjeta pagoTarjeta = new Tarjeta("albin","1020120980",true,"Tarea","2016-01-20");
            FacturasTarjeta.add(pagoTarjeta);
            return true; 

    }
    
    

    
}
