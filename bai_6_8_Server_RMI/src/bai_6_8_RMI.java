
import java.net.MalformedURLException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andy
 */
public class bai_6_8_RMI {
     public static void main(String[] args) throws MalformedURLException{
        try {
            Registry reg = LocateRegistry.createRegistry(9999);
            bai_6_8_Impl bt = new bai_6_8_Impl();
            reg.rebind("rmi://localhost/Calculator", (Remote) bt);
            System.out.println("Đã đăng ký đối tượng Remote...");
        } catch (RemoteException e) {
            System.out.println("Không tạo được đối tượng Remote");
        }
    }
}
