import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject implements Hello
{
    // Constructre    
    public HelloImpl() throws RemoteException
    {
        super();
    }
    @Override
    public String Hello(String Yourname) throws RemoteException
    {
        return "Hi! Hey, My name: "+Yourname;
    }
}  