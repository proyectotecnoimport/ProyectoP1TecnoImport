package controlador;

import modelo.decorator.Vendedor;

/**
 *
 * @author Dario Triviño
 */
public class CtrlVendedor {
    
    private Vendedor vendedor;

    public CtrlVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    
    
}
