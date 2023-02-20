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
public class LDIT {
    
    public LDIT() {
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
     * Test of size method, of class LD.
     */
    @Test
    public void testSize() {
        LD<Integer> instance = new LD();
        Integer r = 6;
        for(int i = 0; i < 6; i++)
        {
            instance.add(i);
        }
        Integer size = instance.size();
        assertEquals(r, size);      
    }

    /**
     * Test of get method, of class LD.
     */
    @Test
    public void testGet() {
      System.out.println("get");
        LD<Integer> instance = new LD();
        Integer a =0;
        Integer b = 0;
        instance.First(a);
        instance.Last(b);
        Integer resultado = instance.getLast();
        assertEquals(resultado, b);
    }

    /**
     * Test of remove method, of class LD.
     */
    @Test
    public void testRemove() {
        LD<Integer> instance = new LD();
        Integer a = 3;
        Integer b = 9;
        instance.First(a);
        instance.Last(b);
        Integer res = instance.removeLast();
        assertEquals(res, b);
    }

    /**
     * Test of add method, of class LD.
     */
    @Test
    public void testAdd() {
  
        LD<Integer> instance = new LD();
        Integer N = 1;
        instance.add(0, N);
        Integer T = instance.get(0);
        assertEquals(T, N);
    }
    
}
