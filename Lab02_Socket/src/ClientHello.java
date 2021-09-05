
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Andy
 */
public class ClientHello {

    public static void main(String[] args) throws IOException {
        try {
            //b1: tao socket client
            Socket client = new Socket("127.0.0.1", 9999);

            try ( //b2: trao doi du lieu voi server
                    //lay du lieu voi sever
                    //in:  doc du lieu tren Socket client
                    BufferedReader input = new BufferedReader(new InputStreamReader(client.getInputStream()))) {
                PrintWriter output = new PrintWriter(client.getOutputStream(), true);//gui du lieu len server
                output.println("Client: Thank you. I'm good");
                System.out.println("Client: da ket noi thanh cong den server");
                //Doc du lieu tu in va xuat ra man hinh
                while (!input.ready()) {
                    System.out.println("Server: " + input.readLine());
                    System.out.println();
                    //b3: dong ket noi
                    input.close();
                    client.close();
                }

            }

        } catch (IOException e) {
            System.err.println("Clinet khong ket noi den server");
        }

    }
}
