
package hoja4grupal;

import java.util.ArrayList;

public class StackArray<E> implements Stack<E>
{
    protected ArrayList<E> l;
    
    public StackArray()
    {
        l = new ArrayList();
    }

    @Override
    public void push(E value) 
    {
        l.add(value);
    }

    @Override
    public E pop() 
    {
        return l.remove(l.size()-1);
    }

    @Override
    public E peek() 
    {
        return l.get(l.size()-1);
    }

    @Override
    public boolean empty() 
    {
        return l.isEmpty();
    }

    @Override
    public int size() 
    {
        return l.size();
    }
}
