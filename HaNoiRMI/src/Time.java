
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andy
 */
public interface Time extends Remote{
    //lay ngay, gio hien tai cua san chung khoan Ha Noi
    public Date getCurrentDateTime() throws RemoteException;
}
