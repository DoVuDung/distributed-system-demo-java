
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
    
    public static void main(String[] args) throws MalformedURLException, NotBoundException {
        try {
            Registry regClient = LocateRegistry.getRegistry("localhost", 9999);
            System.out.println("Client đang tìm kiếm đối tượng...");
            bai_6_7 bt = (bai_6_7) regClient.lookup("rmi://localhost/Calculator");
            System.out.println("Hãy nhập vào các số nguyên từ bàn phím:");
            while (true) {
                Scanner input = new Scanner(System.in);
                System.out.print("Hay nhap 4 so nguyen tu ban phim theo dang (a,b,c,d): ");
                String inputString = input.nextLine();
                
                if (inputString.equals("stop")) {
                    break;
                }
                
                String[] intArr = inputString.split(",");
                int a = Integer.parseInt(intArr[0]);
                int b = Integer.parseInt(intArr[1]);
                int c = Integer.parseInt(intArr[2]);                
                int d = Integer.parseInt(intArr[3]);
                System.out.println("S = 25*(a+b) – 6*(3c- 2d), ");
                System.out.print(bt.tinhTong(a, b, c, d));
            }
            
        } catch (RemoteException e) {
            System.out.println("Không tìm thấy đối tượng Remote");
        }
    }
}
