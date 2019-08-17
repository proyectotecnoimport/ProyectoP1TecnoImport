/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Dario Triviño
 */
public class Inventario {
    
    private String id;
    private Map<Articulo,Integer> articulos;

    public Inventario(String id, Map<Articulo,Integer> articulos) {
        this.id = id;
        this.articulos=articulos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<Articulo, Integer> getArticulos() {
        return articulos;
    }

    public void setArticulos(Map<Articulo, Integer> articulos) {
        this.articulos = articulos;
    }
   
    
}
