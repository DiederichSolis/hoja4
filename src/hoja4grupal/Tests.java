package hoja4grupal;
import hoja4grupal.LA;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Assert.*;

public class Tests{

    private StackList<String> stack;

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
    //*test para Vector */
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
    //*Genera tests para lista simple */
    @Test
    void testSize() {
        LA<String> list = new ArrayList<>();
        assertEquals(0, list.size());
        list.add("Hello");
        assertEquals(1, list.size());
        list.add("World");
        assertEquals(2, list.size());
        list.removeLast();
        assertEquals(1, list.size());
        list.removeLast();
        assertEquals(0, list.size());
    }

    @Test
    void testIsEmpty() {
        LA<Integer> list = new LinkedList<>();
        assertTrue(list.isEmpty());
        list.add(42);
        assertFalse(list.isEmpty());
        list.removeFirst();
        assertTrue(list.isEmpty());
    }

    @Test
    void testFirstAndLast() {
        LA<String> list = new DoublyLinkedList<>();
        list.Last("World");
        list.First("Hello");
        assertEquals("Hello", list.getFirst());
        assertEquals("World", list.getLast());
        list.Last("!");
        assertEquals("!", list.getLast());
        assertEquals("Hello", list.getFirst());
    }

    @Test
    void testGetAndRemoveFirstAndLast() {
        LA<Integer> list = new CircularLinkedList<>();
        list.Last(3);
        list.Last(5);
        list.Last(7);
        assertEquals(3, list.removeFirst());
        assertEquals(5, list.getFirst());
        assertEquals(7, list.getLast());
        assertEquals(7, list.removeLast());
        assertEquals(5, list.getFirst());
        assertEquals(1, list.size());
    }

    @Test
    void testAddAndGet() {
        LA<Integer> list = new ArrayList<>();
        list.add(0, 2);
        list.add(1, 3);
        list.add(0, 1);
        list.add(3, 5);
        list.add(2, 4);
        assertEquals(5, list.size());
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(4, list.get(2));
        assertEquals(3, list.get(3));
        assertEquals(5, list.get(4));
    }

    @Test
    void testRemove() {
        LA<Integer> list = new CircularLinkedList<>();
        list.Last(1);
        list.Last(2);
        list.Last(3);
        list.Last(4);
        list.Last(5);
        assertEquals(5, list.remove());
        assertEquals(4, list.getLast());
        assertEquals(4, list.remove());
        assertEquals(3, list.remove());
        assertEquals(2, list.getFirst());
        assertEquals(2, list.remove());
        assertEquals(1, list.getFirst());
        assertEquals(1, list.remove());
        assertTrue(list.isEmpty());
    }
//*tests para clase List  */ 
@BeforeEach
void setUp() throws Exception {
    stack = new StackList<String>(new LD<String>());
}

@Test
void testPush() {
    stack.push("Hello");
    stack.push("World");
    assertEquals(2, stack.size());
    assertEquals("World", stack.peek());
}

@Test
void testPop() {
    stack.push("Hello");
    stack.push("World");
    assertEquals("World", stack.pop());
    assertEquals(1, stack.size());
    assertEquals("Hello", stack.pop());
    assertEquals(0, stack.size());
}

@Test
void testPeek() {
    stack.push("Hello");
    stack.push("World");
    assertEquals("World", stack.peek());
    assertEquals(2, stack.size());
}

@Test
void testEmpty() {
    assertTrue(stack.empty());
    stack.push("Hello");
    assertFalse(stack.empty());
    stack.pop();
    assertTrue(stack.empty());
}

@Test
void testSize() {
    assertEquals(0, stack.size());
    stack.push("Hello");
    stack.push("World");
    assertEquals(2, stack.size());
    stack.pop();
    assertEquals(1, stack.size());
}
//* Tests para clase Arraylist */
@Test
public void testPush() {
    StackList<Integer> stack = new StackList<Integer>(new LB<Integer>());
    stack.push(5);
    assertEquals(1, stack.size());
    assertEquals(5, stack.peek());
}

@Test
public void testPop() {
    StackList<Integer> stack = new StackList<Integer>(new LB<Integer>());
    stack.push(5);
    stack.push(10);
    assertEquals(2, stack.size());
    assertEquals(10, stack.pop());
    assertEquals(1, stack.size());
    assertEquals(5, stack.pop());
    assertEquals(0, stack.size());
}

@Test
public void testPeek() {
    StackList<Integer> stack = new StackList<Integer>(new LB<Integer>());
    stack.push(5);
    assertEquals(1, stack.size());
    assertEquals(5, stack.peek());
    assertEquals(1, stack.size());
}

@Test
public void testEmpty() {
    StackList<Integer> stack = new StackList<Integer>(new LB<Integer>());
    assertTrue(stack.empty());
    stack.push(5);
    assertFalse(stack.empty());
    stack.pop();
    assertTrue(stack.empty());
}

@Test
public void testSize() {
    StackList<Integer> stack = new StackList<Integer>(new LB<Integer>());
    assertEquals(0, stack.size());
    stack.push(5);
    assertEquals(1, stack.size());
    stack.push(10);
    assertEquals(2, stack.size());
    stack.pop();
    assertEquals(1, stack.size());
    stack.pop();
    assertEquals(0, stack.size());
}

}

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StackArrayTest {

@Test
public void testPush() {
    StackArray<Integer> stack = new StackArray<Integer>();
    stack.push(5);
    assertEquals(1, stack.size());
    assertEquals(5, stack.peek());
}

@Test
public void testPop() {
    StackArray<Integer> stack = new StackArray<Integer>();
    stack.push(5);
    stack.push(10);
    assertEquals(2, stack.size());
    assertEquals(10, stack.pop());
    assertEquals(1, stack.size());
    assertEquals(5, stack.pop());
    assertEquals(0, stack.size());
}

@Test
public void testPeek() {
    StackArray<Integer> stack = new StackArray<Integer>();
    stack.push(5);
    assertEquals(1, stack.size());
    assertEquals(5, stack.peek());
    assertEquals(1, stack.size());
}

@Test
public void testEmpty() {
    StackArray<Integer> stack = new StackArray<Integer>();
    assertTrue(stack.empty());
    stack.push(5);
    assertFalse(stack.empty());
    stack.pop();
    assertTrue(stack.empty());
}

@Test
public void testSize() {
    StackArray<Integer> stack = new StackArray<Integer>();
    assertEquals(0, stack.size());
    stack.push(5);
    assertEquals(1, stack.size());
    stack.push(10);
    assertEquals(2, stack.size());
    stack.pop();
    assertEquals(1, stack.size());
    stack.pop();
    assertEquals(0, stack.size());
}

}


