
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;
import static javafx.application.Platform.exit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Andy
 */
public class ChatServerImpl extends UnicastRemoteObject implements ChatServer_RMI {

    public ChatServerImpl() throws RemoteException {
    }

    @Override
    public void Chat() {
        Scanner sc = new Scanner(System.in);
        String mess;
        do {
            System.out.println("Server:");
            mess = sc.nextLine();
            if (mess.equalsIgnoreCase("stop")) {
                System.out.print("hẹn gặp lại ban lan sau!\n");
                exit();
            } else {
            }
        } while (!mess.equalsIgnoreCase("stop"));
    }

}
