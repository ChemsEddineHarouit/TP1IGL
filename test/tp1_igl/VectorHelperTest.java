/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1_igl;

import java.util.function.Function;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Chemsou Harouit
 */
public class VectorHelperTest {
    
    public VectorHelperTest() {
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
     * Test of trier method, of class VectorHelper.
     */
    @Test
    public void testTrier() {
        System.out.println("trier");
        int[] tableau = {50,112,32,-5};
        int[] expResult = {-5,32,50,112};
        int[] result = VectorHelper.trier(tableau);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of inverser method, of class VectorHelper.
     */
    @Test
    public void testInverser() {
        System.out.println("inverser");
        int[] tableau = {50,112,32,-5};
        int[] expResult = {-5,32,112,50};
        int[] result = VectorHelper.inverser(tableau);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of sommer method, of class VectorHelper.
     */
    @Test
    public void testSommer() throws Exception {
        System.out.println("sommer");
        int[] tableau1 = {50,112,32,-5};
        int[] tableau2 = {52,113,31,3};
        int[] expResult = {102,225,63,-2};
        int[] result = VectorHelper.sommer(tableau1, tableau2);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of appliquer method, of class VectorHelper.
     */
    @Test
    public void testAppliquer() {
        System.out.println("appliquer");
        int[] tableau = {50,112,32,-5};
        Function<Integer, Integer> fonction = x->x*2;
        int[] expResult = {100,224,64,-10};
        int[] result = VectorHelper.appliquer(tableau, fonction);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of maxAndMin method, of class VectorHelper.
     */
    @Test
    public void testMaxAndMin() {
        System.out.println("maxAndMin");
        int[] tableau = {50,112,32,-5};
        int[] expResult = {112,-5};
        int[] result = VectorHelper.maxAndMin(tableau);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
