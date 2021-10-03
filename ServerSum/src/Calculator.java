import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculator extends Remote{

    /**
     *
     * @param n
     * @return
     * @throws RemoteException
     */
    public int sum (int n) throws RemoteException;
}