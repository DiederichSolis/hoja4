
package hoja4grupal;



public class ii<E>
{
    /**
     * guarda el dato
     */
    protected Object[] array;

    protected int ps;
    
   
    public ii()
    {
      
        this(11);
    }
    
    /**
     * tamaño indicado por usuario 
     * @param init tamaño del vector 
     */
    public ii(int init)
    {
        array = new Object[init];
    }
    
    /**
     *agrega elemento
     * @param value el elemento a agregar al vector
     */
    public void add(E value)
    {
        ajuste(ps+1);
        array[ps++] = value;
    }
    
    /**
     * lecutra del valor
     * @param ii ps del elemento dentro del array
     * @return el elemento deseado.
     */  
    public E get(int ii)
    {
        return (E)array[ii];
    }
    
    /**
    * guarda el valor en variable del momento 
    * @param ii posicion a eliminar
    * @return el elemento que se elimino del array
    */
    public E remove(int ii)
    {
        E temp = (E)array[ii];
        if(ps < array.length)
        {
            for (int i = ii; i < ps; i++)
            {
                array[i] = array[i+1];
            }
            array[ps--] = null;
        }
        else
        {
            array[ps-1] = null;
            ps--;
        }
        return temp;
    }
    
  
   
    /**
     * Metodo que indica cuantos elementos tiene el vector
     * @return el tamaño del vector
     */
    public int size()
    {
        return ps;
    }
     public boolean isEmpty()
    {
        if(ps == 0)
        {
            return true;
        }
        else return false;
    }
   
    protected void ajuste(int newcap)
    {
        if(newcap > array.length)
        {
            Object[] nuevoArray = new Object[newcap*2];
            for(int i = 0; i < array.length; i++)
            {
                nuevoArray[i] = array[i];
            }
            array = nuevoArray;
        }
    }
}
