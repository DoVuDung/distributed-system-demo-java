
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
public class Daochuoi_Server {

    public static void main(String[] args) throws IOException {
        //B1: tao Socket cua server
        try (ServerSocket server = new ServerSocket(9999)) {
            System.out.println("Server da khoi dong...");

            //B2: Thuc hien lang nghe va ket noi
            try (Socket client = server.accept()) {
                System.out.println("Server da ket noi thanh cong voi client");

                //B3: Khai bao doi tuong
                try (Scanner br = new Scanner(client.getInputStream());
                        PrintWriter pw = new 
                    PrintWriter(client.getOutputStream())
                    
                        ) {

                            //B4: Server nhan chuoi tu client
                            String st = br.nextLine(); //st chuoi tu client gui qa server

                        //B4.1 server xu ly dao chuoi
                        String kq = daonguoc(st);

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

    

    public static String daonguoc(String st) {
        StringBuffer in = new StringBuffer(st).reverse();//tra ve bo nho chuoi dao nguoc
        String nguoc = in.toString();
        return nguoc;

    }

}
