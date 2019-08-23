package modelo;

import modelo.decorator.JefeBodega;
import java.util.Map;

/**
 *
 * @author Dario Triviño
 */
public class Abastecimiento {
    
    private String id;
    private String fecha;
    private boolean estado;
    private Map<Articulo,Integer> productos;
    private Sucursal sucursal;
    private Matriz matriz;
    private Ruta ruta;
    private JefeBodega jefeBodega;

    public Abastecimiento(String id, String fecha, boolean estado, Map<Articulo, Integer> productos, Sucursal sucursal, Ruta ruta, JefeBodega jefeBodega) {
        this.id = id;
        this.fecha = fecha;
        this.estado = estado;
        this.productos = productos;
        this.sucursal = sucursal;
        this.ruta = ruta;
        this.jefeBodega = jefeBodega;
    }

    public Abastecimiento(String id, String fecha, boolean estado, Map<Articulo, Integer> productos, Matriz matriz, Ruta ruta, JefeBodega jefeBodega) {
        this.id = id;
        this.fecha = fecha;
        this.estado = estado;
        this.productos = productos;
        this.matriz = matriz;
        this.ruta = ruta;
        this.jefeBodega = jefeBodega;
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Map<Articulo, Integer> getProductos() {
        return productos;
    }

    public void setProductos(Map<Articulo, Integer> productos) {
        this.productos = productos;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Matriz getMatriz() {
        return matriz;
    }

    public void setMatriz(Matriz matriz) {
        this.matriz = matriz;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public JefeBodega getJefeBodega() {
        return jefeBodega;
    }

    public void setJefeBodega(JefeBodega jefeBodega) {
        this.jefeBodega = jefeBodega;
    }
    
    
    
}
