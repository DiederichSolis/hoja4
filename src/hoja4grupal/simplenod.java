/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja4grupal;

/**
 *

 *ckase para un simple nodo
 */
public class simplenod<E>
{

    protected simplenod<E> next;
    /**
     * valor a almacenar al nodo
     */
    protected E a;
    
    public simplenod(E a, simplenod<E> next)
    {
        this.a = a;
        this.next = next;
    }
    public void setNext(simplenod<E> next) { this.next = next; }
    public simplenod<E> getNext() { return next; }
    public void setItem(E item) { this.a = item; }
    public E getItem() { return a; }
    
}
