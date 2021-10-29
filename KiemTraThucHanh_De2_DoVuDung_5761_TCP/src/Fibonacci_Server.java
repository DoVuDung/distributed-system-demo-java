
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
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
public class Fibonacci_Server {

    public static void main(String[] args) throws IOException {
        //B1: tao Socket cua server
        try (ServerSocket server = new ServerSocket(9999)) {
            System.out.println("Server da khoi dong...");

            //B2: Thuc hien lang nghe va ket noi
            try (Socket client = server.accept()) {
                System.out.println("Server da ket noi thanh cong voi client");

                //B3: Khai bao doi tuong
                try (Scanner br = new Scanner(client.getInputStream());
                        PrintWriter pw = new PrintWriter(client.getOutputStream())) {

                    //B4: Server nhan chuoi tu client
                    int a = br.nextInt();
                    int b = br.nextInt();
                    int k = br.nextInt();
                    int p = br.nextInt();
                    System.out.println("Số được truyền từ client{ " + a + "," + b + "," + k + "," + p + "}");
                    //B4.1 server xu ly 
                    String kq;
                    kq = checkFibonacci(a, b, k, p);

                    //B4.2 server tra lai ket qua da xu ly cho client
                    pw.write(kq);
                    pw.write("\n");
                    pw.flush();

                    //B5: ket thuc -  dong cac ket noi
                    br.close();
                    pw.close();
                    server.close();

                }

            } catch (IOException e) {
                System.out.println("");
            }

        } catch (UnknownHostException e) {
            System.err.println("Server khong ton tai");
        }
    }
    //ket thuc ham main

    public static void checkFibonacci(int a, int b, int k, int p) {
        int arrFib[] = null;
        if (k < 2) {
            if (p == a) {
                System.out.println(p + "tồn tại trong dãy trên, có vị trí thứ 0");
            } else {
                System.out.println(p + "tồn tại trong dãy trên, có vị trí thứ 1");
            }
        } else {
            //Sinh day fibonacci 
            System.out.print("Chuỗi fibonacci với " + k + " số là: ");
            for (int i = 0; i < k; i++) {
                System.out.print(a + " ");
                int sumOfPrevTwo = a + b;
                arrFib[i] = sumOfPrevTwo;
                a = b;
                arrFib[i + 1] = a;
                b = sumOfPrevTwo;
                arrFib[i + 2] = b;

            }
            for (int i = 0; i < k; i++) {
                if (arrFib.equals(p)) {
                    System.out.println("Tồn tại p = " + p + "trong dãy số có vị trí" + i);
                }
            }
        }
      

    }

}
