/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.singleton;

import java.sql.Connection;
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
public class conexionSqlTest {
    
    public conexionSqlTest() {
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

    
    /*
        Verificar si la conexion se conecta exitosamente
    */
    @Test
    public void testConexion() {
        System.out.println("conexion");
        conexionSql instance = new conexionSql();
      
        Connection result = instance.conexion();
          Connection expResult = instance.conectarme;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
     

    /**
     * Si la contrasena ingresada como parametro en el metodo entonces 
     * no se devuelve la contrasena para ingresara a la base de datos,
     * en vez de eso se devuleve null
     */
    @Test
    public void testGetContra() {
        System.out.println("getContra");
        
        conexionSql instance = new conexionSql();
        String contra = "1090929292";
        String expResult = "ismaelarias96@";
        String result = instance.getContra(contra);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    /* Prueba unitaria para comprobar lo que sucede si ingresa la contrasena incorrecta
        para obtener la contrasena de la base de datos.
    */
    
     @Test
    public void testGetnoContra() {
        System.out.println("getContra");
        
        conexionSql instance = new conexionSql();
        String contra = "10s0929292";
        String expResult = null;
        String result = instance.getContra(contra);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Prueba unitaria para confirma que el metodo funciona.
     * Este metodo termina la conexion con la base de datos una vez que finaliza 
     * la sesion un usuario.
     */
    @Test
    public void testTerminarConexion() {
        System.out.println("terminarConexion");
        String clave = "finalizar";
        conexionSql instance = new conexionSql();
        boolean expResult = true;
        boolean result = instance.terminarConexion(clave);
        assertEquals(expResult, result);
    }
    
}
