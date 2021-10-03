
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
public interface bai_6_8 extends Remote{
    public void giaiPhuongTrinhBac2(int a, int b, int c) throws RemoteException;
}
