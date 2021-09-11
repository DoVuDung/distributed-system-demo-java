
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
public class Tinhtong_Server {

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
                    int number = br.nextInt(); //st chuoi tu client gui qa server
                    System.out.println("Số được truyền từ client " + number);
                    //B4.1 server xu ly dao chuoi
                    int kq = tinhtong(number);
                    System.out.println("tổng vừa tinh được " + kq);

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

    public static int tinhtong(int number) {
        if (number < 0) {
            return 0;
        }
        return number + tinhtong(number - 1);
    }
}
