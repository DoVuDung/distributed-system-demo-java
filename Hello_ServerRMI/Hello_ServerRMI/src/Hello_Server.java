
import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class Hello_Server {
    public static void main (String[] args) throws MalformedURLException{
        try
        { 
            // Tao doi tuong Registry voi port =9999
            Registry reg = LocateRegistry.createRegistry(9999);
            // Tao doi tuong Remote 
            Hello h = (Hello)new HelloImpl(); // Kieu la Interface
            //Dang ky doi tuong RMI va Rang buoc vao Server CS420SA 
            reg.rebind("CS420SA",h); // CS420SA: Ten hoac duong dan den may Server
            System.out.println("Đối tượng từ xa đã được đăng ký.");
            System.out.println("Server đang đợi yêu cầu từ Client!");
        }
        catch(RemoteException e)
        {
            System.out.println("Không thể tạo đượcc đối tượng Remote");
        }
    }
}
