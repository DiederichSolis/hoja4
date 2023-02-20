
package hoja4grupal;
/**
 * 
 * @author diederich solis
 *@author rodrigo mansilla
 * @author Alexis mesias
 *
 */

public abstract class AbstractList<E> implements LA<E>
{
    public AbstractList()
    {
        
    }
    
    /**
     * post: retorna verdadero su esta vacia la lista
     * @return size
     */
    public boolean isEmpty()
    {
        return size() == 0;
    }
    
    /**
     * 
     * post: nuevo elemento a la lista
     * @param value elemento para agregar
     */
    public void First(E value)
    {
        add(0,value);
    }
    
    /**

     * post: elemento al final de la lista
     * @param value El nuevo elemento a agregar.
     */
    public void Last(E value)
    {
        add(size(),value);
    }
    /**
     *
     * post: devuelve el primero
     * @return El primer elemento de la lista.
     */
    public E getFirst()
    {
        return get(0);
    }
    
    
    /**
     
     * post: devuelve el ultimo.
     * @return El ultimo elemento de la lista.
     */
    public E getLast()
    {
        return get(size()-1);
    }
    
    /**
     * pre: la lista no esta vacia.
     * post:  remueve el primero
     * @return El primer elemento de la lista.
     */
    public E removeFirst()
    {
        return remove(0);
    }
    
    /**
     * pre: la lista no esta vacia
     * post: devuelve el ultimo elemento de la lista.
     * @return El ultimo elemento de la lista.
     */
    public E removeLast()
    {
        return remove(size()-1);
    }
    
    /**
   
     * post: simplemente se agrega un nuevo
     * @param value El nuevo elemento a agregar.
     */
    public void add(E value)
    {
        Last(value);
    }
    
    /**

     * post: remueve y devuelve 
     * @return El ultimo elemento de la lista.
     */
    public E remove()
    {
        return removeLast();
    }
    
    /**
   
     * post: devuelve el ultimo elemento de la lista.
     * @return  get
     */
    public E get()
    {
        return getLast();
    }
}

