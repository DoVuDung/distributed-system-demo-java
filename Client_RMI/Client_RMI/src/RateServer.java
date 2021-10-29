
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RateServer extends Remote{
    // Lay chi so chung khoan
    public Hanoi rateHanoi() throws RemoteException;
  
    public Time CreateTime() throws RemoteException;
}