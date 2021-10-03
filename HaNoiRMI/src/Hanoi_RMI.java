
import java.net.MalformedURLException;
import java.rmi.Naming;
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
public class Hanoi_RMI {
    public static void main(String[] args) throws MalformedURLException {
        //chay tren moi truong shell
        try {
            RateServer sv = new RateServerImpl();
            Naming.rebind("Hanoi", sv);
            System.out.println("Server da khoi tao doi tuong tu xa, dang cho yeu cau tu client");
        } catch (RemoteException e) {
            System.out.println("Khong ket noi duoc voi doi tuong Remote");
        }
    }
}
