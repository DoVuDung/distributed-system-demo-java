
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Andy
 */
public class ServerKiemTraSoHoanThienImpl extends UnicastRemoteObject implements ServerRMI {

    public ServerKiemTraSoHoanThienImpl() throws RemoteException {
    }

    
    @Override
    public void kiemtrasohoanthien(List<Integer> myList) {
        int tong = 0;
        for (int i = 0; i < myList.size(); i++) {
            for (int j = 1; j < i; j++) {
                if (myList.get(i) % j == 0) {
                    tong += j;
                }
            }
            if (tong == i) {
                System.out.print("So" + myList.get(i) + "la so hoan thien" + "co vi tri" + i);
            }
        }
    }

}
