
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andy
 */
public class RateServerImpl extends UnicastRemoteObject implements RateServer{
    //dat hai bien
    Hanoi vn;//
    Time time;//
    //xay dung phuong thuc Constructure de khoi tao class rateserver
    public RateServerImpl() throws RemoteException{
        time = (Time) new TimeImpl();
        vn = (Hanoi) new HanoiImpl();
        //sinh doi tuong remote cho vn, time
        //UnicastRemoteObject.exportObject(vn);        //UnicastRemoteObject.exportObject(vn);        //UnicastRemoteObject.exportObject(vn);
        //UnicastRemoteObject.exportObject(time);

    }
    @Override
    public Hanoi rateHanoi() throws RemoteException {
        return vn;
    }

    @Override
    public Time CreateTime() throws RemoteException {
        return time;
    }
    
}
