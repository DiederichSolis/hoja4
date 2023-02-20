/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja4grupal;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author diede
 */
public class LBIT {
    
    public LBIT() {
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
     * Test of size method, of class LB.
     */
    @Test
    public void testSize() {
    
        LC<Integer> instance = new LC();
        Integer v1 = 0;
        instance.add(v1);
        Integer rr = 1;
        Integer resultado = instance.size();
        assertEquals(rr, resultado);
    }

    /**
     * Test of get method, of class LB.
     */
    @Test
    public void testGet() {
       
        int i = 0;
        LC instance = new LC();
        Object rr = null;
        Object re = instance.get(i);
        assertEquals(rr, re);
    }

    /**
     * Test of remove method, of class LB.
     */
    @Test
    public void testRemove() {
        
        LC<Integer> instance = new LC();
        Integer a = 0;
        Integer b = 0;
        Integer c = 0;
        Integer d = 0;
        instance.First(a);
        instance.Last(b);
        instance.add(1, c);
        instance.Last(d);
        for(int i = 0; i < instance.size(); i++)
            System.out.print(instance.get(i) + ",");
        System.out.println();
        Integer res = instance.removeLast();
        assertEquals(res, c);
    }

    /**
     * Test of add method, of class LB.
     */
    @Test
    public void testAdd() {
        
    }
    
}
