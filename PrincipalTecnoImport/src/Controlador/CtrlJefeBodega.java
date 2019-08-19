/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Decorator.JefeBodega;
import Vista.Observer.VistaJefeBodega;

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
