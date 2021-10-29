
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hanoi extends Remote{
    // Lay thong tin ve chi so Index tai san giao dich Ha Noi
    public String getHanoi() throws RemoteException;
}
