package hoja4grupal;
import hoja4grupal.LA;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Assert.*;

public class Tests{
    public Tests() {
    }
    
    /**
     * Test of size method, of class LD.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        LD<Integer> instance = new LD<>();
        instance.add(0, 1);
        instance.add(1, 2);
        instance.add(2, 3);
        int expResult = 3;
        int result = instance.size();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of get method, of class LD.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int i = 1;
        LD<Integer> instance = new LD<>();
        instance.add(0, 1);
        instance.add(1, 2);
        instance.add(2, 3);
        Integer expResult = 2;
        Integer result = instance.get(i);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of remove method, of class LD.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        int i = 1;
        LD<Integer> instance = new LD<>();
        instance.add(0, 1);
        instance.add(1, 2);
        instance.add(2, 3);
        Integer expResult = 2;
        Integer result = instance.remove(i);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of add method, of class LD.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int i = 1;
        Integer o = 5;
        LD<Integer> instance = new LD<>();
        instance.add(0, 1);
        instance.add(1, 2);
        instance.add(2, 3);
        instance.add(i, o);
        Integer expResult = 5;
        Integer result = instance.get(i);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testStackV() {
        System.out.println("testStackV");
        StackV<String> instance = new StackV<>();
        instance.push("one");
        instance.push("two");
        instance.push("three");
        instance.pop();
        String expResult = "two";
        String result = instance.peek();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testStackList() {
        System.out.println("testStackList");
        LA<String> LA = new LA<String>();
        StackList<String> instance = new StackList<>(LA);
        instance.push("one");
        instance.push("two");
        instance.push("three");
        instance.pop();
        String expResult = "two";
        String result = instance.peek();
        assertEquals(expResult, result);
    }   




}