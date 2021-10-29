
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
public class client {
    public static void main(String[] args) {
        try {
            System.out.println("client dang tim kiem thong tin");
            Print c = (Print) Naming.lookup("rmi://localhost/Print");
            c.Print();
            System.out.println("Ket noi server thanh cong");
        } catch (MalformedURLException | NotBoundException | RemoteException e) {
               System.out.println("khong tim thay doi tuong remote");
        }
    }
}
