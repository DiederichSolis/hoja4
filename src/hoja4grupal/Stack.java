
package hoja4grupal;
/**
* @author diederich solis
 *@author rodrigo mansilla
 * @author Alexis mesias
 
 */

public interface Stack<E>
{
    /**
     * 
     * @param element el elemento que se quiere agregar al stack
     */
    public void push(E element);
    
    /**
     * 
     * @return regresa el ultimo elemento
     */
    public E pop();
    
    /**
     * 
     * @return regresa el valor del ultimo elemento 
     */
    public E peek();
    
    /**
     * 
     * @return el estado del stack
     */
    public boolean empty();
    
    
    /**
     * 
     * @return regresa el tamaño actual del stack.s
     */
    public int size();
}