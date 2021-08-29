
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
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
public class CopyFile_Teacher {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String nameFile = sc.nextLine();
        int i;//doc cac o nho file
        FileInputStream fin;//mo file de doc
        FileOutputStream fout ;//ghi ra file moi
        try {
            fin = new FileInputStream(nameFile);
        } catch (FileNotFoundException exc) {
            System.out.println("Input File Not Found");
            return;
        }
        catch(ArrayIndexOutOfBoundsException exc){
            System.out.println("Error: Can not write file");
            return;
        }
        
        //copy file
        try {
            fout = new FileOutputStream(nameFile);
        } catch (FileNotFoundException e) {
            System.out.println(e);
            return;
        }
        //ghi file moi
        try {
            do {
                i =fin.read();
                if(i != -1){
                    fout.write(i);
                }
            } while (i != -1);
            
        } catch (IOException e) {
            System.out.println(e);
            return;
        }
        //dong doc ghi file
        fin.close();
        fout.close();
    }

}
