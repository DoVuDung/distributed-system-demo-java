
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
public interface bai_6_7 extends Remote{
    public int tinhTong(int a,int b, int c, int d) throws RemoteException;
}
