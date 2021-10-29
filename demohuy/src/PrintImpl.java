
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
public class PrintImpl extends UnicastRemoteObject implements Print{
    public PrintImpl() throws RemoteException{
    
    }
    
    @Override
    public void Print() {
        System.out.println("Hello World!");
    }
    
}
