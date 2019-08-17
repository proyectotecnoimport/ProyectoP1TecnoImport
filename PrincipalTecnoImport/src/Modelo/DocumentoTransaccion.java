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
public class DocumentoTransaccion {
    
    protected String id;
    protected String descripcion;
    protected double cantidadPagada;
    protected Venta venta;

    public DocumentoTransaccion(String id, String descripcion, double cantidadPagada, Venta venta) {
        this.id = id;
        this.descripcion = descripcion;
        this.cantidadPagada = cantidadPagada;
        this.venta = venta;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCantidadPagada() {
        return cantidadPagada;
    }

    public void setCantidadPagada(double cantidadPagada) {
        this.cantidadPagada = cantidadPagada;
    }
    
    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

}
