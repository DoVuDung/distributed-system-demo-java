
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
//B1: xây dựng Interface
public interface Hello extends Remote {

    public String Hello(String yourName) throws RemoteException;//khai bao phuong thuc giao tiep giua server va client
}
