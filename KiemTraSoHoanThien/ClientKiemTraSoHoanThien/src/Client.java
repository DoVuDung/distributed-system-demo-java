
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.List;
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
public class Client {

    public static void main(String[] args) throws NotBoundException {
        try {
            Registry regClient = LocateRegistry.getRegistry("localhost", 9999);
            System.out.println("Client đang tìm kiếm đối tượng...");
            ServerRMI bt = (ServerRMI) regClient.lookup("rmi://localhost/SoHoanThien");
            List<Integer> myList = new ArrayList<>();

            System.out.println("Hãy nhập vào các số nguyên từ bàn phím:");
            while (true) {
                Scanner input = new Scanner(System.in);
                System.out.print("Hay nhap 4 so nguyen tu ban phim theo dang (a;b;c;d): ");
                String inputString = input.nextLine();

                if (inputString.equals("stop")) {
                    break;
                }

                String[] intArr = inputString.split(";");
                int a = Integer.parseInt(intArr[0]);
                myList.add(a);
                int b = Integer.parseInt(intArr[1]);
                myList.add(b);
                int c = Integer.parseInt(intArr[2]);
                myList.add(c);
                int d = Integer.parseInt(intArr[3]);
                myList.add(d);

            }
            bt.kiemtrasohoanthien(myList);
        } catch (RemoteException e) {
            System.out.println("Không tìm thấy đối tượng Remote");
        }
    }
}
