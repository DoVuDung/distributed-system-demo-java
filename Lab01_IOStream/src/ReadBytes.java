
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Lab_01_ReadBytes
 * @author Andy
 */
public class ReadBytes {
    public static void main(String[] args) throws IOException{
        byte data[] = new byte[100];
        System.out.println("Ban hay nhap vao mot so ky tu");        
        System.in.read(data);
        System.out.println("Ban hay nhap vao mot so ky tu");        
        for (int i = 0; i < data.length; i++) {
            System.out.println((byte) data[i]);
        }
    }
}
