package modelo.singleton;

import modelo.Establecimiento;
import modelo.Inventario;
import modelo.Persona;
import modelo.Venta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dario Triviño
 */
public class BaseDeDatos {
    
    private List<Persona> usuarios=new ArrayList<>(); 
    private List<Inventario> inventarios=new ArrayList<>(); 
    private List<Venta> ventas=new ArrayList<>();
    private List<Establecimiento> establecimiento=new ArrayList<>();
    private BaseDeDatos baseDatos=new BaseDeDatos();
    
    private BaseDeDatos(){
       usuarios=new ArrayList<>(); 
       inventarios=new ArrayList<>(); 
       ventas=new ArrayList<>();
       establecimiento=new ArrayList<>();
    }
    
    public BaseDeDatos getInstance(){
        return baseDatos;
    }

    public List<Persona> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Persona> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Inventario> getInventarios() {
        return inventarios;
    }

    public void setInventarios(List<Inventario> inventarios) {
        this.inventarios = inventarios;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }

    public List<Establecimiento> getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(List<Establecimiento> establecimiento) {
        this.establecimiento = establecimiento;
    }

    public BaseDeDatos getBaseDatos() {
        return baseDatos;
    }

    public void setBaseDatos(BaseDeDatos baseDatos) {
        this.baseDatos = baseDatos;
    }
   
    
}
