/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.Decorator.Vendedor;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Dario Triviño
 */
public class Cotizacion {
    
    private String id;
    private String fecha;
    private String descripcion;
    private Map<Articulo,Integer> articulos;
    private Vendedor vendedor;

    public Cotizacion(String id, String fecha, String descripcion, Map<Articulo,Integer> articulos, Vendedor vendedor) {
        this.id = id;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.articulos=articulos;
        this.vendedor = vendedor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Map<Articulo, Integer> getArticulos() {
        return articulos;
    }

    public void setArticulos(Map<Articulo, Integer> articulos) {
        this.articulos = articulos;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    
    
    
}
