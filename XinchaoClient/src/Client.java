
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
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
public class Client {
    public static void main(String[] args) throws RemoteException{
        try {
            Hello m = (Hello)Naming.lookup("CS420");//tro den server de su dung doi tuong remote
            System.out.println("Client: Hooowee, what is your name?");
            System.out.println("Server"+m.Hello("Bro"));
        } catch (MalformedURLException | NotBoundException | RemoteException e) {
        }
    }
}
