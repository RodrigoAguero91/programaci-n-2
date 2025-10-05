/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package javaapplication27.TrabajoPractico5.Ejercicio1;

import java.time.LocalDate;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Charly Cimino
 */
public class PasaporteTest {
    
    public PasaporteTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getNumero method, of class Pasaporte.
     */
    @Test
    public void testGetNumero() {
        System.out.println("getNumero");
        Pasaporte instance = null;
        String expResult = "";
        String result = instance.getNumero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaEmision method, of class Pasaporte.
     */
    @Test
    public void testGetFechaEmision() {
        System.out.println("getFechaEmision");
        Pasaporte instance = null;
        LocalDate expResult = null;
        LocalDate result = instance.getFechaEmision();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFoto method, of class Pasaporte.
     */
    @Test
    public void testGetFoto() {
        System.out.println("getFoto");
        Pasaporte instance = null;
        Foto expResult = null;
        Foto result = instance.getFoto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitular method, of class Pasaporte.
     */
    @Test
    public void testGetTitular() {
        System.out.println("getTitular");
        Pasaporte instance = null;
        Titular expResult = null;
        Titular result = instance.getTitular();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Pasaporte.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Pasaporte instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
