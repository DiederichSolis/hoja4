package hoja4grupal;

/**
 * @author diederich solis
 *@author rodrigo mansilla
 * @author Alexis mesias
 */
public class LB<E> extends AbstractList<E>
{

    protected simplenod<E> t;
    /**
     * Guarda los nodos en la lista (cantidad)
     */
    protected int size;
    
    public LB()
    {
        t = null;
        size = 0;
    }
    
    @Override
    /**
     * Devuelve la cantidad de nodos en esta lista.
     
     */
    public int size() 
    {
        return size;
    }

    @Override
    /**
     * Devuelve el elemento ubicado en la posicion i en la lista.
     */
    public E get(int i) 
    {
        if(i < 0 || i > size - 1) return null;
        else
        {
            simplenod<E> node = t.getNext();
            for(int c = 0; c < i; c++) node = node.getNext();
            return node.getItem();
        }
    }

    @Override
    /**
     * Elimina y devuelve de la lista el elemento en la posicion i. 
     */
    public E remove(int i)
    {
       if(i < 0 || i > size - 1) return null;
       E temp = null;
       if(size == 1)
       {
           temp = t.getItem();
           t = null;
           size = 0;
       }
       else
       {
           if(i == 0) return t.getNext().getItem();
          simplenod<E> nod = t.getNext();
           for(int c = 0; c < i - 1; c++) nod = nod.getNext();
           temp = nod.getNext().getItem();
           nod.setNext(nod.getNext().getNext());
           size--;
       }
       return temp;
    }

    @Override
    /**
     * Agrega un nuevo elemento a la lista en la posicion i.
     */
    public void add(int i, E o) 
    {
        if(i < 0 || i > size) return;
        simplenod<E> newnod = new simplenod(o, null);
        if(t == null)
        {
            t = newnod;
            t.setNext(t);
            size = 1;
        }
        else
        {
            if(i == size)
            {
                newnod.setNext(t.getNext());
                t.setNext(newnod);
                t = newnod;
            }
            else
            {
                simplenod<E> nod = t.getNext();
                for(int c = 0; c < i - 1; c++) nod = nod.getNext();
                simplenod<E> temp = nod.getNext();
                nod.setNext(newnod);
                newnod.setNext(temp);
            }
            size++;
        }
    }
    
}
