
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
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
public class ServerHello {
    public static void main(String[] args) throws IOException{
        //tao socket
        try {
            //b1: tao socket, mo port 9999
            ServerSocket server = new ServerSocket(9999);
            System.out.println("Server: server is working");
            //b2: thuc hien lang nghe ket noi tu server den client
            Socket client = server.accept();//client la socket cua server
            System.out.println("Server: Server is connected with client");
            //b3: goi/nhan du lieu client
            PrintWriter output = new PrintWriter(client.getOutputStream(), true);//out: ghi du lieu len socket client
            Scanner input =  new Scanner(client.getInputStream());//in: lay du lieu tu socket server len man hinh client
            output.println("Server: hello, how are u?");
            System.out.println("Client: "+input.nextLine());
            //b4: dong ket noi
            client.close();
            server.close();
            
        } catch (IOException e) {
            System.err.println("khong ket noi duoc voi client");
            System.exit(1);
        }
        
       
    }
}
