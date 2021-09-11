
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
public class Chat_Client {

    public static void main(String[] args) throws IOException {
        //b1: tao socket client va cac doi tuong doc, ghi

        try (Socket client = new Socket("127.0.0.1", 9999)) {
            //Khai bao doi tuong doc ghi

            Scanner in = new Scanner(System.in);
            try (Scanner br = new Scanner(client.getInputStream());
                    PrintWriter pw = new PrintWriter(client.getOutputStream())) {
                //nhap chuoi tu ban phim

                String st;
                String msg;
                //b4: nhan ket qua tra ve tu server
                do {
                    System.out.print("Client: ");
                    st = in.nextLine();
                    //server tra loi
                    
                    System.out.print("Server: ");
                    //b3: ghi du lieu len socket client de gui cho server
                    pw.write(st);
                    pw.write("\n");
                    pw.flush();
                    //b5: in ket qua ra man hinh
                    msg = br.nextLine();
                    System.out.print(msg);
                } while (!st.equals("stop"));

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
