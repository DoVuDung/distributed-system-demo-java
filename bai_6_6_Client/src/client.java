
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
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
public class client {

    public static void main(String[] args) throws MalformedURLException, NotBoundException {
        try {
            Registry regClient = LocateRegistry.getRegistry("localhost", 9999);
            System.out.println("Client đang tìm kiếm đối tượng...");
            ChatServer_RMI bt = (ChatServer_RMI) regClient.lookup("rmi://localhost/ChatServer");
            System.out.println("Client:");
            bt.Chat();
        } catch (RemoteException e) {
            System.out.println("Không tìm thấy đối tượng Remote");
        }
    }
}
