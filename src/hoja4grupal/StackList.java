
package hoja4grupal;


public class StackList<E> implements Stack<E>
{
    protected LA<E> list;
    
    public StackList(LA lista)
    {
        this.list = lista;
    }

    @Override
    public void push(E element) 
    {
        list.Last(element);
    }

    @Override
    public E pop() 
    {
        return list.removeLast();
    }

    @Override
    public E peek() 
    {
        return list.getLast();
    }

    @Override
    public boolean empty() 
    {
        return list.isEmpty();
    }

    @Override
    public int size() 
    {
        return list.size();
    }
}