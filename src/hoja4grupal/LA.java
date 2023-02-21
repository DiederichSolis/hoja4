package hoja4grupal;
/**
* @author Diederich Solis
 *@author Rodrigo Mansilla
 * @author Alexis Mesias
 **/

public interface LA<E> {
    
   /**
    * 
    * @return el tamaño 
    */
    public int size();
   

   /**
    * 
    * @return regresa el estado de la lista ya sea verdadero o falso
    */
    public boolean isEmpty();
   

   /**
    * 
    * @param value el valor a agregar en primero de la lista
    */
   public void First(E value);
   

   
   /**
    * 
    * @param value el valor a agregar de ultimo
    */
   public void Last(E value);
   

   /**
    * 
    * @return el primer valor dentro de la lista
    * 
    */
   public E getFirst();
   

   /**
    * 
    * @return valor de la ultima posicion
    */
   public E getLast();
   

   /**
    * 
    * @return toma el primer valor y elimina 
    */
   public E removeFirst();
   

   /**
    * 
    * @return ultimo valor y lo elimina
    */
   public E removeLast();
  

   /**
    * 
    * @param value valor a agregar de ultimo 
    */
   public void add(E value);
   

   /**
    * 
    * @return remueve el ultimo valor
    */
   public E remove();
   

   /**
    * 
    * @return ultima posicion 
    */
   public E get();
  
   
   /**
    * 
    * @param i la posicion del valor
    * @return el valor en la posicion indicada
    */
   public E get (int i);
   
   
   /**
    * 
    * @param i posicion del valor
    * @return el valor de la posicion indicada y lo elimina de la lista
    */
   public E remove (int i);
   

   /**
    * 
    * @param i la posicion de la lista
    * @param j el elemento que se quiere agregar a la lista 
    */
   public void add(int i, E j);
   
}
