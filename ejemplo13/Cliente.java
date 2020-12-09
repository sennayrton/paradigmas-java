package ejemplo2;
import java.rmi.*;
import java.io.*;
import static java.lang.Thread.sleep;

public class Cliente
{
    public static void main(String args[])
    {
        String respuesta = "";
        try
        {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Introduce tu nombre:");
            String nombre = entrada.readLine();
            InterfaceSaluda obj = (InterfaceSaluda) Naming.lookup("//127.0.0.1/ObjetoSaluda"); //Localiza el objeto distribuido
            respuesta = obj.saludar(nombre);                                                   //Llama al método saludar
            System.out.println(respuesta);
            sleep(1000); //Para que dé tiempo a leer la respuesta antes de que se cierre la ventana
            
            System.out.println("Introduce otro nombre:");
            nombre = entrada.readLine();
            respuesta = obj.decirAdios(nombre);                                                   //Llama al método saludar
            System.out.println(respuesta);
        }
        catch (Exception e)
        {
            System.out.println("Excepción : " + e.getMessage());
            e.printStackTrace();
        }
    }
}

