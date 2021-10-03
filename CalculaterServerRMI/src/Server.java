
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Andy
 */
public class Server {

    public static void main(String[] args) throws RemoteException {
        try {
            CalculatorImpl c = new CalculatorImpl();
            System.out.println("Dich doi tuong ra remote....");
            //chuyen kieu du lieu cua doi tuong remote
            //UnicastRemoteObject.exportObject(c); dung cho khi ko co extends tu unicastremote
            Naming.rebind("rmi://localhost/Mycalculator_Server", c);
            System.out.println("Da dang ky doi tuong");
        } catch (MalformedURLException | RemoteException e) {
            System.out.println("khong tao duoc doi tuong tu xa");
        }
    }
}
