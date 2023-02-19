package hoja4grupal;


public abstract class StackAbs<E> implements Stack<E>
{   
    /**
     *true si la lista esta vacia
     * @return 
     */
    public boolean empty()
    {
        return size() == 0;
    }
}
