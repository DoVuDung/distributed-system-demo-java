
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;



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
    public static void main(String[] args) throws MalformedURLException, NotBoundException{
        try {
            Registry regClient = LocateRegistry.getRegistry("localhost", 9999);
            System.out.println("Client đang tìm kiếm đối tượng...");
            bai_6_7 bt = (bai_6_7) regClient.lookup("rmi://localhost/Calculator");
            System.out.println("Hãy nhập vào các số nguyên từ bàn phím:");
            Scanner sc = new Scanner(System.in);
            int number = Integer.parseInt(sc.nextLine());
            String 
            string.split(";");
            
        } catch (RemoteException e) {
            System.out.println("Không tìm thấy đối tượng Remote");
        }
    }
}
