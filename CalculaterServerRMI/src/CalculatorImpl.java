
import java.rmi.server.UnicastRemoteObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Andy
 */
public class CalculatorImpl extends UnicastRemoteObject implements Calculator {

    public CalculatorImpl() {
    }

    @Override
    public int sum(int n) {
        int s = 0;
        for (int i = 1; i < n; i++) {
            s = s + i;
        }
        return s;

    }

}
