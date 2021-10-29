
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
public class PrintRMI {
    public static void main(String[] args) throws MalformedURLException {
        try {
            Print p = new PrintImpl();
            Naming.rebind("rmi://localhost/Print", p);
            System.out.println("Server da khoi tao doi tuong tu xa, dang cho yeu cau tu client");
        } catch (RemoteException e) {
            System.out.println("Khong ket noi duoc voi doi tuong Remote");
        }
    }
}
