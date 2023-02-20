package hoja4grupal;

/**
 * 
* @author diederich solis
 *@author rodrigo mansilla
 * @author Alexis mesias
 
 */
public abstract class StackAbs<E> implements Stack<E>
{   
    /**
     *true si la lista esta vacia
     * @return empty
     */
    public boolean empty()
    {
        return size() == 0;
    }
}
