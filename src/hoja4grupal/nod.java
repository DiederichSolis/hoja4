
package hoja4grupal;
/**
 *
 
 * Nodo doblemente enlazado.
 */
public class nod<E> 
{
      /**
     * anterior nodo
     */
    protected nod<E> prev;
    /**
     * siguiente nodo
     */
    protected nod<E> next;
  
    /**
     * Valor almacenado
     */
    protected E t;
    
    
    public nod(E t, nod<E> next, nod<E> prev)
    {
        this.next = next;
        this.prev = prev;
        this.t = t;
        
    }
    
    public nod<E> getNext() { return next; }
    public void setPrev(nod<E> prev) { this.prev = prev; }
    public nod<E> getPrev() { return prev; }
    public void setItem(E item) { this.t = item; }
    public E getItem() { return t; }
    public void setNext(nod<E> next) { this.next = next; }
    
    
    
    
}
