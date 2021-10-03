
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
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
public class TimeImpl extends UnicastRemoteObject implements  Time{
    public TimeImpl()throws RemoteException{}
    @Override
    public Date getCurrentDateTime() throws RemoteException {
        return new Date();//lay ra ngay gio hien tai
    }
    
}
