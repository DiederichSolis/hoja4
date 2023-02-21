
package hoja4grupal;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
/**
 * @author Diederich Solis
 *@author Rodrigo Mansilla
 * @author Alexis Mesias
 */
public class HOJA4GRUPAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("ADVERTENCIA!!");
        System.out.println("Antes de iniciar favor de verificar que el archivo .txt este bien establecido");
        System.out.println("");
        System.out.println("");
        System.out.println("Bienvenido, Favor ingrese una opcion: ");
        System.out.println("Stack:");
        System.out.println("0. ArrayList");
        System.out.println("1. vector");
        System.out.println("2. Simplelist");
        System.out.println("3. Doublelist");
        System.out.println("4. Cicularlist");
        
          try
        {
            Scanner sc = new Scanner(System.in);
            int opcion = sc.nextInt();
            implement.getInstance(opcion);
            
        }
        catch(Exception e){ System.out.println(e.getMessage()); }
        
        
        String path = "src/values.txt";
        List<String> lineas = leerArchivoDeTexto(path);
        if(lineas == null)
        {
           System.out.println("Lo lamentamos no se encontro el archivo .txt, favor de verificar");
           return;
        }
        
            //  patron singleton
            for(String linea : lineas)
                System.out.println("El resultado de la operacion es: " + linea + " --> " + 
                        implement.instance.calcular(linea));
            
        try
        {
            System.in.read();
        }
        catch(IOException e) {}
    }
    
    /**
     * lectura del archivo
     * @param path la ubicacion del archivo de texto para leer
     * @return lista con la lineas del archivo
     */
    public static List<String> leerArchivoDeTexto(String path)
    {
        try
        {
            return Files.readAllLines(Paths.get(path), Charset.defaultCharset());
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return null;
                
    }
    
}
