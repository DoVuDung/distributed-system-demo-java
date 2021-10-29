
import java.rmi.Remote;
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
public interface ServerRMI extends Remote{
    public void kiemtrasohoanthien(List<Integer> myList);
}
