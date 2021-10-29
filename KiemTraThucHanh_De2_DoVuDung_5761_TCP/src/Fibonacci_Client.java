
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;
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
public class Fibonacci_Client {

    public static void main(String[] args) throws IOException {
        //b1: tao socket client va cac doi tuong doc, ghi

        try (Socket client = new Socket("127.0.0.1", 9999)) {
            //Khai bao doi tuong doc ghi

            Scanner in = new Scanner(System.in);
 

            try (Scanner br = new Scanner(client.getInputStream());
                    PrintWriter pw = new PrintWriter(client.getOutputStream())) {
                //nhap chuoi tu ban phim
                String inputString;
                int a, b, k, p;
                //b4: nhan ket qua tra ve tu server
                do {
                    System.out.print("Nhập vào các giá trị theo định dạng: a;b;k;p ");
                    inputString = in.nextLine();
                    if (inputString.equals("stop")) {
                        break;
                    }
                    String[] intArr = inputString.split(";");
                    a = Integer.parseInt(intArr[0]);
                    b = Integer.parseInt(intArr[1]);
                    k = Integer.parseInt(intArr[2]);
                    p = Integer.parseInt(intArr[3]);

                    //server tra loi
                    System.out.print("Server: ");
                    //b3: ghi du lieu len socket client de gui cho server
                    pw.write(a);
                    pw.write(b);
                    pw.write(k);
                    pw.write(p);
                    pw.write("\n");
                    pw.flush();
                    //b5: in ket qua ra man hinh
                    String msg = br.nextLine();
                    System.out.print(msg);

                    //doc file
                    System.out.println("Nhap ten file can doc");
                    String fileName = in.nextLine();
                    try {
                        FileInputStream fis = new FileInputStream(fileName);
                        byte[] bytes = new byte[(int) fileName.length()];
                        
                        
                        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
                            fileInputStream.read(bytes);
                        }
                        System.out.println(Arrays.toString(bytes));

                    } catch (FileNotFoundException e) {
                        System.out.println("An error occurred.");
                    }

                } while (!inputString.equals("stop"));

                //b6: ket thuc
                br.close();
                pw.close();

            }
            client.close();
        } catch (UnknownHostException e) {
            System.err.println("Khong nhan duoc ket noi den server");
        }
    }
}
