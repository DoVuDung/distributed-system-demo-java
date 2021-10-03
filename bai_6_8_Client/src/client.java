
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Random;
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

            // cau b
            System.out.println("Hãy nhập vào các số nguyên từ bàn phím:");
            while (true) {
                Scanner input = new Scanner(System.in);
                System.out.print("Hay nhap 4 so nguyen tu ban phim theo dang (a;b;c;d): ");
                String inputString = input.nextLine();

                if (inputString.equals("stop")) {
                    break;
                }

                String[] intArr = inputString.split(";");
                int d = Integer.parseInt(intArr[0]);
                int e = Integer.parseInt(intArr[1]);
                int f = Integer.parseInt(intArr[2]);

                bt.giaiPhuongTrinhBac2(a, b, c);
                bt.giaiPhuongTrinhBac2(d, e, f);
                
            }
        } catch (RemoteException e) {
            System.out.println("Không tìm thấy đối tượng Remote");
        }
    }
}
