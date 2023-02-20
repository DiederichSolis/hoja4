
package hoja4grupal;
/*
 * * @author diederich solis
 *@author rodrigo mansilla
 * @author Alexis mesias
 */

public class StackFactory
{
    /**

     * @param OP Determina el tipo de stack que se crea y devuelve.
     * @return nuevo stack
     */
    public static Stack createStack(int OP)
    {
        Stack STACK = null;
        switch(OP)
        {
            case 0:
                STACK = new StackArray();
                break;
            case 1:
                STACK = new StackV();
                break;
            case 2:
                STACK = new StackList(new LD());
                break;
            case 3:
                STACK = new StackList(new LC());
                break;
            case 4:
                STACK = new StackList(new LB());
                break;
            default:
                break;
        }
        return STACK;
    }
}
