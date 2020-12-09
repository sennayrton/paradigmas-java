package ejemplo2;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Saludador  extends UnicastRemoteObject implements InterfaceSaluda
{
    public Saludador() throws RemoteException {}                 //Constructor
    public String saludar(String nombre) throws RemoteException  // Implementación del método remoto
    {   
        return "Buenos días " + nombre;
    }

    @Override
    public String decirAdios(String nombre) throws RemoteException {
        return "Adios "+nombre;
    }
    
    
}
