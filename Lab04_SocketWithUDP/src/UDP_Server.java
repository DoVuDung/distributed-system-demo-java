
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andy
 */
public class UDP_Server {
     public static void main(String []args) throws IOException 
    { 
        //B1: Tao Socket Server, voi port 9999
        try (DatagramSocket serverSocket = new DatagramSocket(9999)) {
             System.out.println("Server đã khởi động !");
        
        //B2: tao mang byte de chua du lieu gui len tu client
            byte inFromClient1[]= new byte[100];
            byte inFromClient2[]= new byte[100];
         
            // lay kich thuoc cua cac mang
            int leng1 = inFromClient1.length;
            int leng2 = inFromClient2.length;
                        
            // Dong goi mang byte de nhan du lieu gui tu client
            DatagramPacket fromClient1 = new DatagramPacket(inFromClient1,leng1);
            DatagramPacket fromClient2 = new DatagramPacket(inFromClient2,leng2);
        //B3: nhan goi tu Client goi ve Server
            serverSocket.receive(fromClient1);
            serverSocket.receive(fromClient2);
            String data1,data2;
            
        //B4: Nhan du lieu va Tinh tong a+b
            // lay du lieu vao bien data
            data1 = (new String(fromClient1.getData(),0,leng1)).trim();
            data2 = (new String(fromClient2.getData(),0,leng2)).trim();
        
            int a = Integer.parseInt(data1);
            int b = Integer.parseInt(data2);
            // xu ly yeu cau
            int tong = a + b;
        
        //B5: Goi ket qua cho Client
        
           //chuyen du lieu tu kieu int -> String va truyen vao bien data
            data1 = String.valueOf(tong); //data1 chuỗi chứa tổng a+b
            // dong goi ket qua
            byte outToClient[];// khai bao mot mang rong
            outToClient = data1.getBytes();// Chuyen chuoi ve mang byte 
            //lay kich thuoc mang
            leng1 = outToClient.length;
            //lay dia chi cua Client, no nam luon trong goi ma da gui len server
            InetAddress address = fromClient1.getAddress();
            // lay so port cua Client
            int port = fromClient1.getPort();
            // Dong goi de goi cho Client
            DatagramPacket toClient = new DatagramPacket(outToClient,leng1,address,port);
            //gui goi ve client
            serverSocket.send(toClient);
        //B6: Dong ket noi    
            serverSocket.close();
        }// Ket thuc try 1 
      catch(IOException err){
            System.out.println("Không tạo được Server!");
        } 
    }//ket thuc ham main

}
