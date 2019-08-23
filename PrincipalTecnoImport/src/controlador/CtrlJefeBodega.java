package controlador;

import modelo.decorator.JefeBodega;
import vista.observer.VistaJefeBodega;

/**
 *
 * @author Dario Triviño
 */
public class CtrlJefeBodega {
    
    private JefeBodega jefeBodega;
    private VistaJefeBodega viewJefeBodega;

    public CtrlJefeBodega(JefeBodega jefeBodega, VistaJefeBodega viewJefeBodega) {
        this.jefeBodega=jefeBodega;
        this.viewJefeBodega=viewJefeBodega;
    }

    public JefeBodega getJefeBodega() {
        return jefeBodega;
    }

    public void setJefeBodega(JefeBodega jefeBodega) {
        this.jefeBodega = jefeBodega;
    }

    public VistaJefeBodega getViewJefeBodega() {
        return viewJefeBodega;
    }

    public void setViewJefeBodega(VistaJefeBodega viewJefeBodega) {
        this.viewJefeBodega = viewJefeBodega;
    }
    
    
    
}
