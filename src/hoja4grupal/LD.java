
package hoja4grupal;
/**
 * 
 ** @author diederich solis
 *@author rodrigo mansilla
 * @author Alexis mesias
  
 */

public class LD<E> extends AbstractList<E>
{
    /**
     * Referencia al primer nodo de la lista simple
     */
    protected simplenod<E> head;
    
    /**
     * 
     * Variable que guarda la cantidad que nodos existentes en la lista
     * 
     */
    protected int size;
    
    public LD()
    {
        head = null;
        size = 0;
    }

    @Override
    /**
     * Devuelve la cantidad de nodos que hay en la lista
     * pre: no hay precondiciones
     * post: la lisa no cambia de estado
     */
    public int size() 
    {
        return size;
    }

    @Override
    /**
     * Devuelve el elemento ubicado en la posicion i en la lista. El primer
     * elemento esta en la posicion 0.
     * pre: la lista no esta vacia y i esta en el rango [0...size-1]
     * post: la lista no cambia de estado
     */
    public E get(int i) 
    {
        if(i < 0 || i > size -1)
        {
            return null;
        }
        else
        {
            simplenod<E> curNode = head;
            for(int c = 0; c < i; c++)
            {
                curNode = curNode.getNext();
            }
            return curNode.getItem();
        }
    }

    @Override
    /**
     * Elimina y devuelve de la lista el elemento en la posicion i. El primer
     * elemento esta en la posicion 0.
     * pre: la lista no esta vacia y i es un valor en el rango [0...size-1]
     * post: la lista contiene un nodo menos en la posicion i indicada.
     */
    public E remove(int i) 
    {
        if(i < 0 || i > size -1)
        {
            return null;
        }
        
        else
        {            
            E temp = null;
            simplenod<E> curNode = head;
            if(size == 1)
            {
                temp = head.getItem();
                head = null;
                size = 0;
            }
            
            else
            {
                for(int c = 0; c < i-1; c++)
                {
                    curNode = curNode.getNext();
                }
            
                temp = curNode.getNext().getItem();
                curNode.setNext(curNode.getNext().getNext());
                size--;
                
            }
            
            return temp;
        }
    }

    @Override
    /**
     * Agrega un nuevo elemento a la lista en la posicion i.
    
     */
    public void add(int i, E o) 
    {
        if(i < 0 || i > size)
        {
            return;
        }
        else
        {
            if(head == null)
            {
                head = new simplenod<E>(o, null);
            }
            simplenod<E> node = head;
            for(int c = 0; c < i-1; c++)
            {
                node = node.getNext();
            }
            simplenod<E> nuevoNodo = new simplenod(o, node.getNext());
            node.setNext(nuevoNodo);
        }
        size++;
    }
}
