
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * ReadLine
 * @author Andy
 */
public class ReadLines {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Hay nhap vao mot chuoi tu ban phim");
        System.out.println("Nhap 'stop' ket thuc chuong trinh");
        do {
            str = sc.nextLine();
            System.out.println(str);
        } while (!str.equals("stop"));
        
    }
}
