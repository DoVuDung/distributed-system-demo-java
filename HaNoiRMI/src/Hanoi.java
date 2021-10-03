
import java.rmi.Remote;
import java.rmi.RemoteException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andy
 */
public interface Hanoi extends Remote{
    //lay ra thong tin ve chi so chung khoan tren san giao dich tai Ha Noi
    public String getHanoi() throws RemoteException;
}
