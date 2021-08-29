
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
public class ShowFile_Teacher {
    public static void main(String[] args) throws IOException{
        int i;// doc tung ki tu trong o nho
        FileInputStream fin;
        Scanner sc = new Scanner(System.in);
        String nameFile = sc.nextLine();
        try {
            fin = new FileInputStream(nameFile);
        } catch (FileNotFoundException file) {
            System.out.println("khong tim thay file");
            return;
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("File qua dai");
            return;
        }
        
        do {
            i = fin.read();
            if (i != -1) {
                System.out.println((char)i);
            }
        } while (i != -1);
        fin.close();
    }
}
