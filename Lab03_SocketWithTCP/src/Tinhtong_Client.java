
import java.io.IOException;
import java.io.PrintWriter;
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
public class Tinhtong_Client {
     public static void main(String[] args) throws IOException {
        //b1: tao socket client va cac doi tuong doc, ghi

        try (Socket client = new Socket("127.0.0.1", 9999)) {
            //Khai bao doi tuong doc ghi

            Scanner in = new Scanner(System.in);
            try (Scanner br = new Scanner(client.getInputStream());
                    PrintWriter pw = new PrintWriter(client.getOutputStream())) {
                //nhap chuoi tu ban phim
                System.out.println("Hay so can tinh tong vao");
                String st = in.nextLine();
                //b3: ghi du lieu len socket client de gui cho server
                pw.write(st);
                pw.write("\n");
                pw.flush();
                //b4: nhan ket qua tra ve tu server
                String kq = br.nextLine();
                //b5: in ket qua ra man hinh
                System.out.println("Tong " + kq);
                System.out.println(kq.getClass().getSimpleName());

                //b6: ket thuc
                br.close();
                pw.close();

            }
            client.close();
        } catch (UnknownHostException e) {
            System.err.println("Khong nhan duoc ket noi den server");
        }
    }
}
