

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Random;

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

    public static void main(String[] args) throws NotBoundException {
        try {
            Registry regClient = LocateRegistry.getRegistry("localhost", 9999);
            System.out.println("Client đang tìm kiếm đối tượng...");
            bai_6_8 bt = (bai_6_8) regClient.lookup("rmi://localhost/Calculator");
            int max = 100, min = 20;
            Random random = new Random();           
            int a = random.nextInt(max - min + 1) + min;
            int b = random.nextInt(max - min + 1) + min;
            int c = random.nextInt(max - min + 1) + min;
            bt.giaiPhuongTrinhBac2(a, b, c);

        } catch (RemoteException e) {
            System.out.println("Không tìm thấy đối tượng Remote");
        }
    }
}
