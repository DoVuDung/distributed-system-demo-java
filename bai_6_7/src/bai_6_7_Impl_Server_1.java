
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
public class bai_6_7_Impl_Server_1 extends UnicastRemoteObject implements bai_6_7_Server_1{
    public bai_6_7_Impl_Server_1() throws RemoteException{}
    @Override
    public int tinhTong(int a, int b) throws RemoteException {
        return a+b;
    }
    
}
