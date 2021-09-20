
import java.io.DataInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.rmi.UnknownHostException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andy
 */
public class UDP_Client {
    public static void main(String []args) throws IOException 
    { 
    try{
    //B1: Tao socket tren Client 
        DatagramSocket ClientSocket = new DatagramSocket(); 
        System.out.println("Client đã kết nối với Server"); 
     int a,b,tong;  
   
    try{    
    //B2: Doc du lieu tu System.in de lay ra khi nhap 2 so nguyen a va b
        DataInputStream inFromUser = new DataInputStream(System.in); 
        
            System.out.print("Hãy nhập vào số nguyên a:"); 
            a = Integer.parseInt(inFromUser.readLine()); 
            System.out.print("Hãy nhập vào số nguyên b:"); 
            b = Integer.parseInt(inFromUser.readLine()); 
            
    //B3: Dong goi du lieu de goi cho Server
            //Khai bao mang byte de chua du lieu gui di server 
            byte outToServer1[]; //mang byte rong
            byte outToServer2[]; //mang byte rong
            //chuyen kieu du lieu : Tu int -> String 
            String s1 = String.valueOf(a); 
            String s2 = String.valueOf(b); 
            //chuyen kieu du lieu : String -> mang byte va dua vao mang byte da khai bao o tren 
            outToServer1 = s1.getBytes(); 
            outToServer2 = s2.getBytes();  
                        //lay kich thuoc cua mang 
            int leng1 = outToServer1.length; 
            int leng2 = outToServer2.length; 
           
            //Lay dia chi may chu 
            InetAddress address = InetAddress.getByName("Localhost"); 
            // lay Port cua Server 
            int port = 9999; 
            //Dong goi du lieu 
            DatagramPacket toServer1 = new DatagramPacket(outToServer1, leng1,address, port); 
            DatagramPacket toServer2 = new DatagramPacket(outToServer2, leng2, address, port); 
            
            //Goi du lieu cho Server
            ClientSocket.send(toServer1); 
            ClientSocket.send(toServer2); 
                        
    //B4:tao package de nhan du lieu tu Server goi ve 
            byte inFromServer[]=new byte[100]; 
           //kich thuoc mang nhan du lieu ve 
            leng1 = inFromServer.length; 
           // tao package nhan du lieu ve 
            DatagramPacket fromServer = new DatagramPacket(inFromServer, leng1); 
           // nhan package tra ve tu server 
            ClientSocket.receive(fromServer); 
            
           //Hien thi ket qua len man hinh
            String data = (new String(fromServer.getData(),0,fromServer.getLength())).trim(); 
           //in ket qua ra man hinh 
            System.out.println("Kết quả :"+data); 

    //B5: Dong Socket
            ClientSocket.close(); 
             
        }//ket thuc try 2
       catch (UnknownHostException e) 
        { 
            System.out.println("Server không tìm thấy"); 
            System.exit(1); 
        }
     }//ket thuc try 1 
    catch (IOException e) 
        { 
            System.out.println(" Client Không kết nối được với Server"); 
            System.exit(1); 
        } 
    }// ket thuc main

}
