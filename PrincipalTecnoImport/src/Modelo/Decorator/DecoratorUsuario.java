/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Decorator;

import java.util.ArrayList;
import Modelo.Articulo;

/**
 *
 * @author Dario Triviño
 */
public abstract class DecoratorUsuario implements UsuarioSistema{
    protected UsuarioSistema usuariosistema;

    public DecoratorUsuario(UsuarioSistema usuario) {
            super();
            this.usuariosistema = usuario;
    }
}
