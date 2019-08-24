/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

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
public class ArticuloTest {
    
    public ArticuloTest() {
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
     * Verificar que el metodo obtener id devuelva la id del articulo.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Articulo instance = new Articulo("1","jabon","Bano","Usado para lavarse el cuerto",25.50);
        String expResult = "1";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }


    /**
     * Verficar que el metodo obtener nombre devuelva el nombre del Articulo.
     * 
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Articulo instance = new Articulo("1","jabon","Bano","Usado para lavarse el cuerto",25.50);
        String expResult = "jabon";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

       
}
