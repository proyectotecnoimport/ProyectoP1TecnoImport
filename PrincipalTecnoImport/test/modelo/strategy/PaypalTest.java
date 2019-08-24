/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.strategy;

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
public class PaypalTest {
    
    public PaypalTest() {
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
     * Prueba unitaraia al metodo Testpago
     *  Cuando ingresas un pago por los productos que seleccionaste
     * devuelve verdadero para confirmar el pago del cliente al vendedor
     * */
    @Test
    public void testPago() {
        System.out.println("pago");
        
        Paypal instance = new Paypal("albin","albin1804","albinloco@gmail.com");
        double valorPagar = 25.25;
        boolean expResult = true;
        boolean result = instance.pago(valorPagar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }
    /*
        Prueba unitaria a TestPago
        Si no se ingresa valor alguno para pagar, entonces el metodo devuelve falso
        avisando que el cliente aun no pago por los articulos seleccionados.
    */
    
    @Test
    public void testnPago() {
        System.out.println("pago");
        double valorPagar = 0;
        Paypal instance = new Paypal("albin","albin1804","albinloco@gmail.com");
        boolean expResult = false;
        boolean result = instance.pago(valorPagar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
  
    
}
