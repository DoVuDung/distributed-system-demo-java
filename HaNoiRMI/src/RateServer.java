
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
public interface RateServer extends Remote{
    //lay chi so chung khoan o san Hanoi
    public Hanoi rateHanoi() throws RemoteException;
    //lay ra ngay, gio hien tai o san Hanoi
    public Time CreateTime() throws RemoteException;
}
