/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Decorator.Gerente;

/**
 *
 * @author Dario Triviño
 */
public class CtrlGerente {
    
    private Gerente gerente;

    public CtrlGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
    
    

}
    