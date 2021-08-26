
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Lab_02 WriteChar
 * @author Andy
 */
public class WriteChar {
    public static void main(String[] args) throws IOException{
        int b ;
        b = 'X'; //khi gan char ma luu se luu ve dang so nguyen
        //luu ve bang ma ascii
        //write dung de ghi dang byte, dang mang 
        System.out.write(b); //khi ghi ra thiet bi ngoai vi, thi cuoi cung la ki tu ket thuc dong => trắng màn hình
        System.out.println("\n");
    }
}
