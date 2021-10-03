
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
public class bai_6_7_Impl extends UnicastRemoteObject implements bai_6_7{
    bai_6_7_Server_1 server1;
    bai_6_7_Server_2 server2;
    public bai_6_7_Impl() throws RemoteException{
        server1 = (bai_6_7_Server_1) new bai_6_7_Impl_Server_1();
        server2 = (bai_6_7_Server_2) new bai_6_7_Impl_Server_2();
    }

    @Override
    public int tinhTong(int a,int b, int c, int d) throws RemoteException {
       return (25*server1.tinhTong(a, b)-6*server2.tinhTong(c, d));
    }
    
}
