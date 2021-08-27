
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Lab 05 + 08
 * Create File With BufferedReader
 * @author Andy
 */
public class WriteLines {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str, nameFile;

        System.out.println("Hay nhap thong tin vao");
        str = br.readLine();
        System.out.println("Hay nhap ten file vao");
        nameFile = br.readLine();
        
        System.out.println("THONG TIN");
        System.out.println("Ten File: " + nameFile );
        System.out.println("Thong tin vua nhap: " + str);
        
        try {
            File myObj = new File(nameFile);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
                try {
                    try (FileWriter myWriter = new FileWriter(nameFile)) {
                        myWriter.write(str);
                    }
                    System.out.println("Successfully wrote to the file.");
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                }
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
