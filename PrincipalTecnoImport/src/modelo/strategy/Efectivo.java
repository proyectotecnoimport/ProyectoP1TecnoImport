package modelo.strategy;

import java.util.ArrayList;

/**
 *
 * @author Dario Triviño
 */

public class Efectivo implements FormaPago{

    private int cantidadBilletes;
    private double denominacion;
    private static ArrayList<FormaPago> FacturaEfectivo = new ArrayList<>();
    private double pago;
    

    public Efectivo(int cantidadBilletes, double denominacion) {
        this.cantidadBilletes = cantidadBilletes;
        this.denominacion = denominacion;
        this.pago=0;
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
    public boolean pago(double valorPagar) {
            if(valorPagar==0) return false;
            pago = valorPagar;
            Efectivo pagoTarjeta = new Efectivo(10,5.00);
            FacturaEfectivo.add(pagoTarjeta);
            return true; 
    }
    
}
