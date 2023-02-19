
package hoja4grupal;



public class StackV<E> implements Stack<E>
{
    
    /**
    * Declaracion de la variable vector de tipo vector 
  
    */
    protected ii vector;
    
    /**
    * entero
    * ImplementacionStack
    */
    protected int cont;
 
    public StackV()
    {
        
        vector = new ii();
        cont = 0;
    }
    
    /**
     * agregar elemento
     * @param value 
     */
    @Override
    public void push(E value) 
    {
       vector.add(value);
       cont++;    
    }

    /**
     * quitar valor o elemento 
     
     * @return 
     */
    @Override
    public E pop() 
    {
       if (cont == 0)
           throw new IllegalStateException("Esta vacio el stack");
       E elementos = (E)vector.remove(cont-1);
       cont--;
       return elementos;
    }

   
    @Override
    public E peek()
    {
       if (cont ==0 )
           throw new IllegalStateException("Esta vacio el stack");
       E elementos = (E)vector.get(cont-1);
       return elementos;
    }

   
    @Override
    public boolean empty() 
    {
        if (cont == 0)
            return true;
        
        return false;
        
        
    }    
       
    /**
     * regresa contador valor acutal
     * 
     * @return 
     */
    @Override
    public int size()
    {
       return cont;
    }
    
}