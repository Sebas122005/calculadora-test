package com.mycompany.procalculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    
    public CalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        System.out.println("Esto se ejecuta antes");
        
    }
    
    @After
    public void tearDown() {
        System.out.println("Esto se ejecuta despues");
    }

    @Test
    public void testSuma() {
        System.out.println("suma");
        Calculator instance = new Calculator(15,10);
        float expResult = 25.0F;
        float result = instance.suma();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of resta method, of class Calculator.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        Calculator instance = new Calculator(15,10);
        float expResult = 5.0F;
        float result = instance.resta();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of producto method, of class Calculator.
     */
    @Test
    public void testProducto() {
        System.out.println("producto");
        Calculator instance = new Calculator(15,10);
        float expResult = 150.0F;
        float result = instance.producto();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of division method, of class Calculator.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        Calculator instance = new Calculator(15,10);
        float expResult = 1.5F;
        float result = instance.division();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
