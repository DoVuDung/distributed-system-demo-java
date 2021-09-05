
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Andy
 */
public class CreateSocket {

    public static void main(String[] args) throws IOException {
        //khi tao socket co 2 truong hop
        /**
         * socket tao nhung chua ket noi chua tao
         */
        try {
            InetAddress addr = InetAddress.getByName("www.google.com");//chuyen dia chi web vao dia chi socket
            int port = 80;//port co gia tri tu 0 -> 65655
            //b1: tao socket client
            Socket socket = new Socket(addr, port);
            System.out.println("Da ket noi thanh cong voi may chu");
            System.out.println("Dia chi ip cua host: " + addr.getHostAddress());
            System.out.println("Dia chi web cua host: " + addr.getHostName());

        } catch (UnknownHostException err) {
            System.err.println("Khong ton tai server nhu tren!");
        }
    }
}
