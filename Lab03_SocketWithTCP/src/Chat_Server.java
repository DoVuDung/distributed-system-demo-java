
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
public class Chat_Server {

    public static void main(String[] args) throws IOException {
        //B1: tao Socket cua server
        try (ServerSocket server = new ServerSocket(9999)) {
            System.out.println("Server da khoi dong...");

            //B2: Thuc hien lang nghe va ket noi
            try (Socket client = server.accept()) {
                System.out.println("Server da ket noi thanh cong voi client");

                //B3: Khai bao doi tuong
                Scanner sc = new Scanner(System.in);
                try (Scanner br = new Scanner(client.getInputStream());
                        PrintWriter pw = new PrintWriter(client.getOutputStream())) {
                    String msg;
                    String st;
                    //gui tin nhan sang client
                    do {
                        //Server nhan chuoi tu client
                        System.out.println("client: ");
                        st = br.nextLine(); //st chuoi tu client gui qa server
                        if (st.equals("stop")) {
                            pw.write("hẹn gặp lại ban lan sau!");
                            pw.write("\n");
                        }
                        System.out.print(st);
                        System.out.print("server: ");
                        msg = sc.nextLine();
                        pw.write(msg);
                        pw.write("\n");
                        pw.flush();

                    } while (!st.equals("stop"));

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
}
