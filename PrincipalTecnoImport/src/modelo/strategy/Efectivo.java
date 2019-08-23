package modelo.strategy;

/**
 *
 * @author Dario Triviño
 */
public class Efectivo implements FormaPago{

    private int cantidadBilletes;
    private double denominacion;

    public Efectivo(int cantidadBilletes, double denominacion) {
        this.cantidadBilletes = cantidadBilletes;
        this.denominacion = denominacion;
    }

    public int getCantidadBilletes() {
        return cantidadBilletes;
    }

    public void setCantidadBilletes(int cantidadBilletes) {
        this.cantidadBilletes = cantidadBilletes;
    }

    public double getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(double denominacion) {
        this.denominacion = denominacion;
    }
    
    @Override
    public void pago(double valorPagar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
