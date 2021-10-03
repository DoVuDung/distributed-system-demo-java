
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
//B2: xay dung lop thuc hien implements den lop interface
public class HelloImpl extends UnicastRemoteObject implements Hello{
    //constructor method
    public  HelloImpl()throws RemoteException{
        super();
    }

    @Override
    public String Hello(String yourName) throws RemoteException {
        return "Hello, my name is "+yourName;
        
    }
}
