/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author albin
 */
public class CtrlSistemaTest {
    
    public CtrlSistemaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }


    /**
     * Test para validar el usuario que ingresa.
     * Solo ingresa si los datos ingresados son los correctos. Devolviendo el tipo
     * de usuario que es (En este caso vendedor) y muestra a la interface correspondiente
     */
    @Test
    public void testValidarUsuario() {
        System.out.println("validarUsuario");
      String usuario = "jparrales";
        String contrasena = "Jpml990";
        String expResult = "Vendedor";
        String result = CtrlSistema.validarUsuario(usuario, contrasena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    /*
        El usuaro o contrasena no se encuentra en la base de datos.
    */
    @Test
    public void testUsuarionnovalido() {
        System.out.println("validarUsuario");
      String usuario = "albin";
        String contrasena = "Jpml990";
        String expResult = null;
        String result = CtrlSistema.validarUsuario(usuario, contrasena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
