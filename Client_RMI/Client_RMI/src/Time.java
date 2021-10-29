
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

public interface Time extends Remote {
// Lay ngay gio hien tai cua san chung khoa Ha Noi
    public Date getCurrentTime() throws RemoteException;
}
