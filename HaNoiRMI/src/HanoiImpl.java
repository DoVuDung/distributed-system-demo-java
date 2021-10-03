
import static java.lang.Math.random;
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
public class HanoiImpl extends UnicastRemoteObject implements Hanoi {

    //phuong thuc contructor
    public HanoiImpl() throws RemoteException {
    }

    @Override
    public String getHanoi() throws RemoteException {
        //sinh ra kieu so index ngau nhien cho san Ha Noi
        return Double.toString(random() * 150);//sinh so ngau nhien, hard-code chi so ve san 
        //giao dich, sinh so lon hon 0 nho hon 1
    }

}
