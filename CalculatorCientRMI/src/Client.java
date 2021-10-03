
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
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
public class Client extends CalculatorImpl{

    public static void main(String[] args) throws RemoteException {
        try {
            System.out.println("Client dang tim doi tuong ");
            Calculator c = (Calculator)Naming.lookup("rmi://localhost/Mycalculator_Server");
            System.out.println("hay nhap vao so nguyen n can tinh tong tu ban phim");
            Scanner sc = new Scanner(System.in);
            int n =  Integer.parseInt(sc.nextLine());
            System.out.println("Sum("+n+")"+c.sum(n));
        
        } catch (MalformedURLException | NotBoundException | RemoteException e) {
            System.out.println("khong tim thay doi tuong remote");
        }
    }
}
