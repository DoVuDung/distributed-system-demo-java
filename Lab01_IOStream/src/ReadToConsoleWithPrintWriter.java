
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Lab 06
 * Read to console for debug with PrintWriter
 * @author Andy
 */
public class ReadToConsoleWithPrintWriter {
    public static void main(String[] args) throws IOException{
        try (PrintWriter pw = new PrintWriter(System.out, true)) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap ");
            String str = sc.nextLine();
            pw.write(str);
            pw.flush(); //ép dữ liệu từ bộ đệm phải ghi xuống luồng;
            pw.close(); //đóng luồng xuất và giải phóng tài nguyên hệ thống gắn với luồng
        }
    }
}
