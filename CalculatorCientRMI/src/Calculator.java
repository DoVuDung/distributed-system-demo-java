
import java.rmi.Remote;
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

//Interface :
//Public: cho phep truy cap tu phia ngoai
//extends: thua ke tu remote
//phuong thuc cho client yeu cau, client yeu cau gi thi tao phuong thuc do

public interface Calculator extends Remote{

    /**
     *
     * @param n
     * @return
     * @throws RemoteException
     */
    public int sum (int n) throws RemoteException;

   
}
