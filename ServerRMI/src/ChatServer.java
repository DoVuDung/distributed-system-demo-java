
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
public class ChatServer {

    public static void main(String[] args) throws RemoteException {
        try {
            Registry reg = LocateRegistry.createRegistry(9999);
            ChatServerImpl chat = new ChatServerImpl();
            reg.rebind("rmi://localhost/ChatServer", chat);
            System.out.println("Đã đăng ký đối tượng Remote...");
            System.out.println("Chating...");
            chat.Chat();
            System.out.println("Hẹn gặp lại bạn :<<<<<");
        } catch (RemoteException e) {
            System.out.println("Không tạo được đối tượng Remote");
        }
    }
}
