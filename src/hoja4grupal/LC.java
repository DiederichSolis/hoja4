
package hoja4grupal;
/**
 * @author diederich solis
 *@author rodrigo mansilla
 * @author Alexis mesias
 * */

public class LC<E> extends AbstractList<E>
{

   protected int size;
   protected nod<E> head;
   protected nod<E> t;

   public LC()
   {
    size = 0;
    head = null;
    t = null;
   }

    @Override
    public int size()
    {
        return size;
    }

    @Override
    public E get(int i) 
    {

           if(i<0 || i>size-1)
           {
               return null;
           }
           else 
           {
             nod<E> node = head;
             for (int j = 0; j<i; j++)
                 node = node.getNext();
             return node.getItem(); 
           }
    }

    @Override
    public E remove(int i)
    {
        if(i < 0 || i > size - 1) return null;
        E temp = null;
        if(i == 0)
        {
            temp = head.getItem();
            head = head.getNext();
            if(head != null) head.setPrev(null);
        }
        else if(i == size - 1)
        {
            temp = t.getItem();
            t = t.getPrev();
            if(t != null) t.setNext(null);
        }
        else
        {
            nod<E> node = head;
            for(int c = 0; c < i; c++)
            {
                node = node.getNext();
            }
            temp = node.getPrev().getItem();
        }
        size--;
        return temp;
    }

    @Override
    public void add(int i, E o)
    {
        nod<E> newnodo = new nod<E>(o, null, null);
        if(i < 0 || i > size) return;
        if(head == null)
        {
             head = newnodo;
             head.setNext(t);
             t = head;
             t.setNext(null);
             t.setPrev(head);
             size = 1;
             return;
        }
        else if(i == 0)
        {
            newnodo.setNext(head);
            head.setPrev(newnodo);
            head = newnodo;
        }
        else if(i == size)
        {
            newnodo.setPrev(t);
            t.setNext(newnodo);
            t = newnodo;
        }
        else
        {
            nod<E> curNodo = head;
            for(int c = 0; c < i; c++) curNodo = curNodo.getNext();
            nod<E> temp = curNodo.getPrev();
            temp.setNext(newnodo);
            newnodo.setPrev(temp);
            newnodo.setNext(curNodo);
            curNodo.setPrev(newnodo);
        }
        size++;
    }
}
