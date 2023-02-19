package hoja4grupal;

public class implement implements calculate
{
    public static implement instance;
      /**
     * los siguiente solamente son mensajes
     */
     
  
   
    
    private Stack<Float> stack;
     public static implement getInstance(int opcion)
    {
        if(instance == null)
        {
            instance = new implement(opcion);
        }
        return instance;
    }
    /**
     * Regresa una instancia 
     */
    private implement(int opcion)
    {
       
        stack = StackFactory.createStack(opcion);
    }
    
   
    private final String DV = "ERROR: se detecto un division con 0 favor tomar cuenta eso";
    private final String EI = "ERROR: verificar una expresion, ha detectable, invalido";
    private final String CI = "ERROR: ver entrada de texto, caracter invalido";
    private final String FO = "ERROR: observacion en operandos, faltan para realizar las operaciones";
    /**
     * solo procesa informacion 
     * @param value La value que se desea evaluar.
     * @return value o error
     */
    @Override
    public String calcular(String value)
    {
        String rest = "";
        
        for(char c : value.toCharArray())
        {
            if(c == ' ') continue;
            else if(c >= '0' && c <= '9') 
            {
                stack.push(Float.parseFloat(String.valueOf(c)));
            }
            
            else
            {
                if(stack.size() > 1)
                {
                    Float o1 = stack.pop();
                    Float o2 = stack.pop();
                    switch(c)
                    {
                        case '+':
                            stack.push(suma(o1, o2));
                            break;
                        case '-':
                            stack.push(resta(o1,o2));
                            break;
                        case '*':
                            stack.push(multiplicacion(o1,o2));
                            break;
                        case '/':
                            try
                            {
                                stack.push(division(o1,o2));
                            }
                            catch(IllegalArgumentException e)
                            {
                                return DV;
                            }
                            break;
                        default:
                            return CI;
                    }
                }
                else
                {
                    
                    return FO;
                }
            }
        }
      
        if(stack.size() == 1)
            rest = String.valueOf(stack.pop());
        else rest = EI;
        return rest;
    }
    
    /**
   
     * @param a Operando 1.
     * @param b Operando 2.
     * @return resultado suma 
     **/
    
    private Float suma(Float a, Float b)
    {
        return a + b;
    }
    
    /**
     
     * @param a Operando 1.
     * @param b Operando 2.
     * @return resultado de resta.
     */
    private Float resta(Float a, Float b)
    {
        return a - b;
    }
    
    /**
    
     * @param a Operando 1.
     * @param b Operando 2.
     * @return resutlado multiplicacion
     */
    private Float multiplicacion(Float a, Float b)
    {
        return a * b;
    }
    
    /**

     * @param a Operando 1.
     * @param b Operando 2.
     * @return resultado division
     */
    private Float division(Float a, Float b)
            throws IllegalArgumentException
    {
        if(b == 0) throw new IllegalArgumentException(
        "division por cero, verificar eso.");
        return a / b;
    }
}

