
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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
public class ReadFile {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten file can doc");
        String fileName = sc.nextLine();
//        try {
//            File myObj = new File(fileName);
//            Scanner myReader = new Scanner(myObj);
//            while (myReader.hasNextLine()) {
//                String data = myReader.nextLine();
//                System.out.println(data);
//            }
//            myReader.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
        try {
            FileInputStream fis = new FileInputStream(fileName);
            byte[] bytes = new byte[(int) fileName.length()];
            try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
                fileInputStream.read(bytes);
            }
            System.out.println(Arrays.toString(bytes));

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
