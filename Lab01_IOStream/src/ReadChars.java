
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * ReadChars
 * @author Andy
 */
public class ReadChars {
    public static void main(String[] args) throws IOException{
        //Lop truu tuong phai khai bao them lop con
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Scanner sc = new Scanner(System.in);
        System.out.println("Hay nhap vao mot chuoi, gioi han bang dau cham");
        //vong lap de xuat chuoi, cho den khi gap dau cham
        char c;
        //doc chuoi ky tu
        do {
            c = (char)br.read(); //ep kieu tu byte sang char
            System.out.print(c);
        } while (c != '.');
        
    }
}
